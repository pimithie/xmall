package com.xmall.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户详细信息实体类
 */
public class UserDetail {
    /**
     * UserLoginInfo表的主键
     */
    private Long userId;

    /**
     * 用户生日
     */
    private Date brithday;

    /**
     * 用户性别
     */
    private Byte gender;

    /**
     * 当前用户注册时间
     */
    private Date registerTime;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String headPicture;

    /**
     * 积分
     */
    private Long points;

    /**
     * 留给扩展，当前平台币余额
     */
    private BigDecimal money;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture == null ? null : headPicture.trim();
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}