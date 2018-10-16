package com.github.skyisbule.wxpay.vo;

import com.github.skyisbule.wxpay.domain.Require;
import com.github.skyisbule.wxpay.domain.User;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RequireWithContactVO{

    private Integer rid;

    /**
     * 位置
     */
    private String locates;

    /**
     * 面积
     */
    private Integer area;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 消防需求
     */
    private String fireControlRequire;

    /**
     * 月台需求
     */
    private String platformRequire;

    /**
     * 楼层要求
     */
    private String floorRequire;

    /**
     * 需求时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date requireTime;

    /**
     * 租期
     */
    private String leaseTerm;

    /**
     * 最高价格
     */
    private Integer maxPrice;

    /**
     * 备注
     */
    private String remark;

    /**
     * 0、未审核 1、已经通过审核 3、订单已完成 4、订单已取消
     */
    private Integer status;

    /**
     * 发布者id
     */
    private String openId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 电话号
     */
    private String telNum;

    /**
     * 位置
     */
    private String locate;

    /**
     * 公司名
     */
    private String company;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setRequire(Require require){
        this.rid = require.getRid();
        this.area = require.getArea();
        this.locates = require.getLocates();
        this.purpose = require.getPurpose();
        this.fireControlRequire = require.getFireControlRequire();
        this.platformRequire = require.getPlatformRequire();
        this.floorRequire = require.getFloorRequire();
        this.requireTime = require.getRequireTime();
        this.leaseTerm = require.getLeaseTerm();
        this.maxPrice = require.getMaxPrice();
        this.remark = require.getRemark();
        this.status = require.getStatus();
        this.openId = require.getOpenId();
        this.createTime = require.getCreateTime();
    }

    public void setUser(User user){
        this.company  = user.getCompany();
        this.realName = user.getRealName();
        this.telNum   = user.getTelNum();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getLocates() {
        return locates;
    }

    public void setLocates(String locates) {
        this.locates = locates;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getFireControlRequire() {
        return fireControlRequire;
    }

    public void setFireControlRequire(String fireControlRequire) {
        this.fireControlRequire = fireControlRequire;
    }

    public String getPlatformRequire() {
        return platformRequire;
    }

    public void setPlatformRequire(String platformRequire) {
        this.platformRequire = platformRequire;
    }

    public String getFloorRequire() {
        return floorRequire;
    }

    public void setFloorRequire(String floorRequire) {
        this.floorRequire = floorRequire;
    }

    public Date getRequireTime() {
        return requireTime;
    }

    public void setRequireTime(Date requireTime) {
        this.requireTime = requireTime;
    }

    public String getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(String leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
