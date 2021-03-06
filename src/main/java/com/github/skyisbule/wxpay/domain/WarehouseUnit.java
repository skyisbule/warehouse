package com.github.skyisbule.wxpay.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class WarehouseUnit implements Serializable {
    private Integer wuid;

    /**
     * 面积
     */
    private Integer area;

    /**
     * 能否分组 1可以 0不可以
     */
    private Integer couldSublet;

    /**
     * 最小分租面积
     */
    private Integer minSubletArea;

    /**
     * 报价
     */
    private Integer price;

    /**
     * 配套设施
     */
    private String supportingFacilities;

    private Integer warehouseId;

    /**
     * 楼层
     */
    private String floor;

    private static final long serialVersionUID = 1L;

    public Integer getWuid() {
        return wuid;
    }

    public void setWuid(Integer wuid) {
        this.wuid = wuid;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getCouldSublet() {
        return couldSublet;
    }

    public void setCouldSublet(Integer couldSublet) {
        this.couldSublet = couldSublet;
    }

    public Integer getMinSubletArea() {
        return minSubletArea;
    }

    public void setMinSubletArea(Integer minSubletArea) {
        this.minSubletArea = minSubletArea;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSupportingFacilities() {
        return supportingFacilities;
    }

    public void setSupportingFacilities(String supportingFacilities) {
        this.supportingFacilities = supportingFacilities;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
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
        WarehouseUnit other = (WarehouseUnit) that;
        return (this.getWuid() == null ? other.getWuid() == null : this.getWuid().equals(other.getWuid()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCouldSublet() == null ? other.getCouldSublet() == null : this.getCouldSublet().equals(other.getCouldSublet()))
            && (this.getMinSubletArea() == null ? other.getMinSubletArea() == null : this.getMinSubletArea().equals(other.getMinSubletArea()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSupportingFacilities() == null ? other.getSupportingFacilities() == null : this.getSupportingFacilities().equals(other.getSupportingFacilities()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getFloor() == null ? other.getFloor() == null : this.getFloor().equals(other.getFloor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWuid() == null) ? 0 : getWuid().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCouldSublet() == null) ? 0 : getCouldSublet().hashCode());
        result = prime * result + ((getMinSubletArea() == null) ? 0 : getMinSubletArea().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSupportingFacilities() == null) ? 0 : getSupportingFacilities().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getFloor() == null) ? 0 : getFloor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wuid=").append(wuid);
        sb.append(", area=").append(area);
        sb.append(", couldSublet=").append(couldSublet);
        sb.append(", minSubletArea=").append(minSubletArea);
        sb.append(", price=").append(price);
        sb.append(", supportingFacilities=").append(supportingFacilities);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", floor=").append(floor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}