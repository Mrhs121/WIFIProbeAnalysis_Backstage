package edu.cs.scu.javautils;

import edu.cs.scu.bean.VendorMacBean;
import edu.cs.scu.dao.impl.VendorMacDaoImpl;
import org.apache.log4j.Logger;

/**
 * Mac 地址解析类
 * <p>
 * Created by Wang Han on 2017/6/19 17:31.
 * E-mail address is wanghan0501@vip.qq.com.
 * Copyright © 2017 Wang Han. SCU. All Rights Reserved.
 *
 * @author Wang Han
 */
public class MacAdressUtil {
    // 得到log记录器
    private static final Logger logger = Logger.getLogger(MacAdressUtil.class);

    // 根据Mac地址获取制造厂商
    public static synchronized String getVendorByMac(String macAddress) {
        return getVendorByMacPrefix(getMacPrefix(macAddress));
    }

    public static synchronized String getBrandByMac(String macAddress) {
        String vendor = getVendorByMac(macAddress);
        String brand = "Unknown";
        try {
            brand = vendor.split(" ")[0];
        } catch (Exception e) {
            if (null != vendor)
                brand = vendor;
        }
        return brand;
    }

    // 获取Mac地址前缀
    private static String getMacPrefix(String macAddress) {
        try {
            String macPrefix = macAddress.substring(0, 8).toUpperCase();
            return macPrefix;
        } catch (Exception e) {
            logger.error(e.getStackTrace());
            System.err.println(e.getStackTrace());
        }
        return null;
    }

    // 根据Mac地址前缀获取制造商
    private static String getVendorByMacPrefix(String macPrefix) {
        try {
            VendorMacDaoImpl vendorMacDaoImpl = new VendorMacDaoImpl();
            VendorMacBean vendorMacBean = vendorMacDaoImpl.getVendorByMac(macPrefix);
            return vendorMacBean.getVendorName();
        } catch (Exception e) {
            logger.error(e.getStackTrace());
            System.err.println(e.getStackTrace());
        }
        return null;
    }


}
