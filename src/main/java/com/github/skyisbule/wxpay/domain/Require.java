package com.github.skyisbule.wxpay.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
@ApiModel("需求的实体")
public class Require implements Serializable {
    @ApiModelProperty("主键id，添加的接口不需要传")
    private Integer rid;

    /**
     * 位置
     */
    @ApiModelProperty("地理位置，若有多个则以空格作为分隔符")
    private String locates;

    /**
     * 面积
     */
    @ApiModelProperty("面积")
    private Integer area;

    /**
     * 用途
     */
    @ApiModelProperty("用途")
    private String purpose;

    /**
     * 消防需求
     */
    @ApiModelProperty("消防需求")
    private String fireControlRequire;

    /**
     * 月台需求
     */
    @ApiModelProperty("月台需求")
    private String platformRequire;

    /**
     * 楼层要求
     */
    @ApiModelProperty("楼层需求")
    private String floorRequire;

    /**
     * 需求时间
     */
    @ApiModelProperty("提交这条需求的时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date requireTime;

    /**
     * 租期
     */
    @ApiModelProperty("租期")
    private String leaseTerm;

    /**
     * 最高价格
     */
    @ApiModelProperty("最高价格")
    private Integer maxPrice;

    /**
     * 备注
     */
    @ApiModelProperty("备注（推荐理由）")
    private String remark;

    /**
     * 0、未审核 1、已经通过审核 3、订单已完成 4、订单已取消
     */
    private Integer status;

    /**
     * 发布者id
     */
    private String openId;

    private static final long serialVersionUID = 1L;

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
        Require other = (Require) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
            && (this.getLocates() == null ? other.getLocates() == null : this.getLocates().equals(other.getLocates()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getPurpose() == null ? other.getPurpose() == null : this.getPurpose().equals(other.getPurpose()))
            && (this.getFireControlRequire() == null ? other.getFireControlRequire() == null : this.getFireControlRequire().equals(other.getFireControlRequire()))
            && (this.getPlatformRequire() == null ? other.getPlatformRequire() == null : this.getPlatformRequire().equals(other.getPlatformRequire()))
            && (this.getFloorRequire() == null ? other.getFloorRequire() == null : this.getFloorRequire().equals(other.getFloorRequire()))
            && (this.getRequireTime() == null ? other.getRequireTime() == null : this.getRequireTime().equals(other.getRequireTime()))
            && (this.getLeaseTerm() == null ? other.getLeaseTerm() == null : this.getLeaseTerm().equals(other.getLeaseTerm()))
            && (this.getMaxPrice() == null ? other.getMaxPrice() == null : this.getMaxPrice().equals(other.getMaxPrice()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getLocates() == null) ? 0 : getLocates().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getPurpose() == null) ? 0 : getPurpose().hashCode());
        result = prime * result + ((getFireControlRequire() == null) ? 0 : getFireControlRequire().hashCode());
        result = prime * result + ((getPlatformRequire() == null) ? 0 : getPlatformRequire().hashCode());
        result = prime * result + ((getFloorRequire() == null) ? 0 : getFloorRequire().hashCode());
        result = prime * result + ((getRequireTime() == null) ? 0 : getRequireTime().hashCode());
        result = prime * result + ((getLeaseTerm() == null) ? 0 : getLeaseTerm().hashCode());
        result = prime * result + ((getMaxPrice() == null) ? 0 : getMaxPrice().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rid=").append(rid);
        sb.append(", locates=").append(locates);
        sb.append(", area=").append(area);
        sb.append(", purpose=").append(purpose);
        sb.append(", fireControlRequire=").append(fireControlRequire);
        sb.append(", platformRequire=").append(platformRequire);
        sb.append(", floorRequire=").append(floorRequire);
        sb.append(", requireTime=").append(requireTime);
        sb.append(", leaseTerm=").append(leaseTerm);
        sb.append(", maxPrice=").append(maxPrice);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", openId=").append(openId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}