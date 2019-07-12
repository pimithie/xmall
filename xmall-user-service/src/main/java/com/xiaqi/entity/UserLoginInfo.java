package com.xiaqi.entity;

/**
 * 用户登录信息实体，对应表：user_login_info
 */
public class UserLoginInfo {
    /**
     * 用户id，唯一标识一个用户
     */
    private Long id;

    /**
     * 用户名，可用于登录
     */
    private String username;

    /**
     * 登录使用的密码，使用MD5加密
     */
    private String password;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户Email
     */
    private String email;

    /**
     * 当前用户账号是否被验证(手机验证)
     */
    private int isVerified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public int getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(int isVerified) {
        this.isVerified = isVerified;
    }
}