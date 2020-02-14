package com.dubbo.gmall.service;

import com.dubbo.gmall.bean.UserAddress;

import java.util.List;

/** 用户服务
 * @author 邢立伟20165939
 * @create 2020/2/13 - 9:22
 */
public interface UserService {
    /**
     * 根据用户id返回收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);
}
