package com.shop.game.gameshoping.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "USER_BASE")
public class UserBase {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public String toString() {
        return "UserBase{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", sex='" + sex + '\'' +
                ", nickname='" + nickname + '\'' +
                ", stat='" + stat + '\'' +
                ", userMall=" + userMall +
                ", lastLoginDate=" + lastLoginDate +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", srcOpenUserId=" + srcOpenUserId +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", isEmailConfirmed='" + isEmailConfirmed + '\'' +
                ", isPhoneConfirmed='" + isPhoneConfirmed + '\'' +
                ", creater=" + creater +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", mobileTgc='" + mobileTgc + '\'' +
                ", mac='" + mac + '\'' +
                ", source='" + source + '\'' +
                ", activate='" + activate + '\'' +
                ", activateType='" + activateType + '\'' +
                '}';
    }

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "USER_PWD")
    private String userPwd;

    /**
     * 生日
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 头像图片
     */
    @Column(name = "USER_ICON")
    private String userIcon;

    /**
     * 性别, 1:男，2:女，3：保密
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 用户状态，01:正常，02:冻结
     */
    @Column(name = "STAT")
    private String stat;

    /**
     * 当前所属MALL
     */
    @Column(name = "USER_MALL")
    private Long userMall;

    /**
     * 最后登录时间
     */
    @Column(name = "LAST_LOGIN_DATE")
    private Date lastLoginDate;

    /**
     * 最后登录IP
     */
    @Column(name = "LAST_LOGIN_IP")
    private String lastLoginIp;

    /**
     * 来源的联合登录
     */
    @Column(name = "SRC_OPEN_USER_ID")
    private Long srcOpenUserId;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 手机
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 是否绑定邮箱
     */
    @Column(name = "IS_EMAIL_CONFIRMED")
    private String isEmailConfirmed;

    /**
     * 是否绑定手机
     */
    @Column(name = "IS_PHONE_CONFIRMED")
    private String isPhoneConfirmed;

    /**
     * 创建人
     */
    @Column(name = "CREATER")
    private Long creater;

    /**
     * 注册时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 修改日期
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 手机登录标识
     */
    @Column(name = "MOBILE_TGC")
    private String mobileTgc;

    /**
     * mac地址
     */
    @Column(name = "MAC")
    private String mac;

    /**
     * 1:WEB,2:IOS,3:ANDROID,4:WIFI,5:管理系统, 0:未知
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * 激活，1：激活，0：未激活
     */
    @Column(name = "ACTIVATE")
    private String activate;

    /**
     * 激活类型，0：自动，1：手动
     */
    @Column(name = "ACTIVATE_TYPE")
    private String activateType;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return USER_NAME - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return USER_PWD - 密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置密码
     *
     * @param userPwd 密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取生日
     *
     * @return BIRTHDAY - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取头像图片
     *
     * @return USER_ICON - 头像图片
     */
    public String getUserIcon() {
        return userIcon;
    }

    /**
     * 设置头像图片
     *
     * @param userIcon 头像图片
     */
    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    /**
     * 获取性别, 1:男，2:女，3：保密
     *
     * @return SEX - 性别, 1:男，2:女，3：保密
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别, 1:男，2:女，3：保密
     *
     * @param sex 性别, 1:男，2:女，3：保密
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户状态，01:正常，02:冻结
     *
     * @return STAT - 用户状态，01:正常，02:冻结
     */
    public String getStat() {
        return stat;
    }

    /**
     * 设置用户状态，01:正常，02:冻结
     *
     * @param stat 用户状态，01:正常，02:冻结
     */
    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * 获取当前所属MALL
     *
     * @return USER_MALL - 当前所属MALL
     */
    public Long getUserMall() {
        return userMall;
    }

    /**
     * 设置当前所属MALL
     *
     * @param userMall 当前所属MALL
     */
    public void setUserMall(Long userMall) {
        this.userMall = userMall;
    }

    /**
     * 获取最后登录时间
     *
     * @return LAST_LOGIN_DATE - 最后登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginDate 最后登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取最后登录IP
     *
     * @return LAST_LOGIN_IP - 最后登录IP
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * 设置最后登录IP
     *
     * @param lastLoginIp 最后登录IP
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * 获取来源的联合登录
     *
     * @return SRC_OPEN_USER_ID - 来源的联合登录
     */
    public Long getSrcOpenUserId() {
        return srcOpenUserId;
    }

    /**
     * 设置来源的联合登录
     *
     * @param srcOpenUserId 来源的联合登录
     */
    public void setSrcOpenUserId(Long srcOpenUserId) {
        this.srcOpenUserId = srcOpenUserId;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机
     *
     * @return MOBILE - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取是否绑定邮箱
     *
     * @return IS_EMAIL_CONFIRMED - 是否绑定邮箱
     */
    public String getIsEmailConfirmed() {
        return isEmailConfirmed;
    }

    /**
     * 设置是否绑定邮箱
     *
     * @param isEmailConfirmed 是否绑定邮箱
     */
    public void setIsEmailConfirmed(String isEmailConfirmed) {
        this.isEmailConfirmed = isEmailConfirmed;
    }

    /**
     * 获取是否绑定手机
     *
     * @return IS_PHONE_CONFIRMED - 是否绑定手机
     */
    public String getIsPhoneConfirmed() {
        return isPhoneConfirmed;
    }

    /**
     * 设置是否绑定手机
     *
     * @param isPhoneConfirmed 是否绑定手机
     */
    public void setIsPhoneConfirmed(String isPhoneConfirmed) {
        this.isPhoneConfirmed = isPhoneConfirmed;
    }

    /**
     * 获取创建人
     *
     * @return CREATER - 创建人
     */
    public Long getCreater() {
        return creater;
    }

    /**
     * 设置创建人
     *
     * @param creater 创建人
     */
    public void setCreater(Long creater) {
        this.creater = creater;
    }

    /**
     * 获取注册时间
     *
     * @return CREATE_DATE - 注册时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置注册时间
     *
     * @param createDate 注册时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改日期
     *
     * @return UPDATE_DATE - 修改日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改日期
     *
     * @param updateDate 修改日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取手机登录标识
     *
     * @return MOBILE_TGC - 手机登录标识
     */
    public String getMobileTgc() {
        return mobileTgc;
    }

    /**
     * 设置手机登录标识
     *
     * @param mobileTgc 手机登录标识
     */
    public void setMobileTgc(String mobileTgc) {
        this.mobileTgc = mobileTgc;
    }

    /**
     * 获取mac地址
     *
     * @return MAC - mac地址
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置mac地址
     *
     * @param mac mac地址
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * 获取1:WEB,2:IOS,3:ANDROID,4:WIFI,5:管理系统, 0:未知
     *
     * @return SOURCE - 1:WEB,2:IOS,3:ANDROID,4:WIFI,5:管理系统, 0:未知
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置1:WEB,2:IOS,3:ANDROID,4:WIFI,5:管理系统, 0:未知
     *
     * @param source 1:WEB,2:IOS,3:ANDROID,4:WIFI,5:管理系统, 0:未知
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取激活，1：激活，0：未激活
     *
     * @return ACTIVATE - 激活，1：激活，0：未激活
     */
    public String getActivate() {
        return activate;
    }

    /**
     * 设置激活，1：激活，0：未激活
     *
     * @param activate 激活，1：激活，0：未激活
     */
    public void setActivate(String activate) {
        this.activate = activate;
    }

    /**
     * 获取激活类型，0：自动，1：手动
     *
     * @return ACTIVATE_TYPE - 激活类型，0：自动，1：手动
     */
    public String getActivateType() {
        return activateType;
    }

    /**
     * 设置激活类型，0：自动，1：手动
     *
     * @param activateType 激活类型，0：自动，1：手动
     */
    public void setActivateType(String activateType) {
        this.activateType = activateType;
    }
}