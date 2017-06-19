package edu.cs.scu.bean;

import java.io.Serializable;

/**
 * 用户访问类
 * <p>
 * Created by Wang Han on 2017/6/18 15:11.
 * E-mail address is wanghan0501@vip.qq.com.
 * Copyright © 2017 Wang Han. SCU. All Rights Reserved.
 */
public class UserVisitBean implements Serializable{
    private static final long serialVersinUID = 351877796426921776L;

    private long shopId;
    private String mmac;
    private String time;
    private long totalFlow;
    private long checkInFlow;
    private double checkInRate;
    private double shallowVisitRate;
    private double deepVisitRate;

    public UserVisitBean() {

    }

    public static long getSerialVersinUID() {
        return serialVersinUID;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String getMmac() {
        return mmac;
    }

    public void setMmac(String mmac) {
        this.mmac = mmac;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getTotalFlow() {
        return totalFlow;
    }

    public void setTotalFlow(long totalFlow) {
        this.totalFlow = totalFlow;
    }

    public long getCheckInFlow() {
        return checkInFlow;
    }

    public void setCheckInFlow(long checkInFlow) {
        this.checkInFlow = checkInFlow;
    }

    public double getCheckInRate() {
        return checkInRate;
    }

    public void setCheckInRate(long checkInRate) {
        this.checkInRate = checkInRate;
    }

    public double getShallowVisitRate() {
        return shallowVisitRate;
    }

    public void setShallowVisitRate(long shallowVisitRate) {
        this.shallowVisitRate = shallowVisitRate;
    }

    public double getDeepVisitRate() {
        return deepVisitRate;
    }

    public void setDeepVisitRate(long deepVisitRate) {
        this.deepVisitRate = deepVisitRate;
    }

}