package com.dubbo.gmall.service;

import com.dubbo.gmall.bean.UserAddress;

import java.util.List;

/**
 *
 * @author 邢立伟20165939
 * @create 2020/2/13 - 9:27
 *
 *
 *
 * 1、将服务提供者注册到注册中心（暴露服务）
 *    1)、导入dubbo依赖（2.6.2）
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 */
public interface OrderService {
    /**
     * 初始化订单
     */
    public List<UserAddress> initOrder(String userId);
}
