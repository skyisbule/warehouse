package com.github.skyisbule.wxpay.domain;

import java.io.Serializable;

/**
 * @author 
 */
public class WarehouseCodePicCache implements Serializable {
    private Integer wid;

    private String key;

    private static final long serialVersionUID = 1L;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
        WarehouseCodePicCache other = (WarehouseCodePicCache) that;
        return (this.getWid() == null ? other.getWid() == null : this.getWid().equals(other.getWid()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWid() == null) ? 0 : getWid().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", key=").append(key);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}