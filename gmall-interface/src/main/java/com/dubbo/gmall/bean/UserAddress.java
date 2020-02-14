package com.dubbo.gmall.bean;

import java.io.Serializable;

/**
 * @author 邢立伟20165939
 * @create 2020/2/13 - 9:18
 */
public class UserAddress  implements Serializable{
private Integer id;
private String userAddrss;
private String userId;
private String consignee;
private String phoneNum;
private String isDefault;

    public UserAddress(Integer id, String userAddrss, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddrss = userAddrss;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddrss() {
        return userAddrss;
    }

    public void setUserAddrss(String userAddrss) {
        this.userAddrss = userAddrss;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
