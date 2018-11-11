package com.github.skyisbule.wxpay.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * db_message
 * @author 
 */
public class Message implements Serializable {
    private Integer mid;

    private String title;

    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    /**
     * 0-系统 1-个人
     */
    private Integer fromType;

    /**
     * 0-公告 1-供应 2-需求
     */
    private Integer classType;

    private String openId;

    private String locate;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getFromType() {
        return fromType;
    }

    public void setFromType(Integer fromType) {
        this.fromType = fromType;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
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
        Message other = (Message) that;
        return (this.getMid() == null ? other.getMid() == null : this.getMid().equals(other.getMid()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getFromType() == null ? other.getFromType() == null : this.getFromType().equals(other.getFromType()))
            && (this.getClassType() == null ? other.getClassType() == null : this.getClassType().equals(other.getClassType()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getLocate() == null ? other.getLocate() == null : this.getLocate().equals(other.getLocate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMid() == null) ? 0 : getMid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getFromType() == null) ? 0 : getFromType().hashCode());
        result = prime * result + ((getClassType() == null) ? 0 : getClassType().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getLocate() == null) ? 0 : getLocate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mid=").append(mid);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", createDate=").append(createDate);
        sb.append(", fromType=").append(fromType);
        sb.append(", classType=").append(classType);
        sb.append(", openId=").append(openId);
        sb.append(", locate=").append(locate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}