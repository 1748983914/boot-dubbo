package com.dubbo.gmall.controller;

import com.dubbo.gmall.bean.UserAddress;
import com.dubbo.gmall.service.OrderService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author 邢立伟20165939
 * @create 2020/2/14 - 11:35
 */
@Controller
public class OrderController {
   @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initorder(String userId) {
        return orderService.initOrder( userId);
    }
}
