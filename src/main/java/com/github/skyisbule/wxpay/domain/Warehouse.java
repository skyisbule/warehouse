package com.github.skyisbule.wxpay.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Warehouse implements Serializable {
    private Integer wid;

    /**
     * 位置
     */
    private String locate;

    /**
     * 图片
     */
    private String picture;

    /**
     * 园区的服务
     */
    private String parkService;

    /**
     * 适合行业
     */
    private String suitableFor;

    /**
     * 是否通过审核
     */
    private Integer isPass;

    /**
     * 用户的openid
     */
    private String openId;

    /**
     * 优势
     */
    private String advantage;

    /**
     * 备注
     */
    private String remark;

    /**
     * 0、未审核 1、已经通过审核 3、订单已完成 4、订单已取消
     */
    private Integer status;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getParkService() {
        return parkService;
    }

    public void setParkService(String parkService) {
        this.parkService = parkService;
    }

    public String getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(String suitableFor) {
        this.suitableFor = suitableFor;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Warehouse other = (Warehouse) that;
        return (this.getWid() == null ? other.getWid() == null : this.getWid().equals(other.getWid()))
            && (this.getLocate() == null ? other.getLocate() == null : this.getLocate().equals(other.getLocate()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getParkService() == null ? other.getParkService() == null : this.getParkService().equals(other.getParkService()))
            && (this.getSuitableFor() == null ? other.getSuitableFor() == null : this.getSuitableFor().equals(other.getSuitableFor()))
            && (this.getIsPass() == null ? other.getIsPass() == null : this.getIsPass().equals(other.getIsPass()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getAdvantage() == null ? other.getAdvantage() == null : this.getAdvantage().equals(other.getAdvantage()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWid() == null) ? 0 : getWid().hashCode());
        result = prime * result + ((getLocate() == null) ? 0 : getLocate().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getParkService() == null) ? 0 : getParkService().hashCode());
        result = prime * result + ((getSuitableFor() == null) ? 0 : getSuitableFor().hashCode());
        result = prime * result + ((getIsPass() == null) ? 0 : getIsPass().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getAdvantage() == null) ? 0 : getAdvantage().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", locate=").append(locate);
        sb.append(", picture=").append(picture);
        sb.append(", parkService=").append(parkService);
        sb.append(", suitableFor=").append(suitableFor);
        sb.append(", isPass=").append(isPass);
        sb.append(", openId=").append(openId);
        sb.append(", advantage=").append(advantage);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}