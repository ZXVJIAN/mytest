package com.itheima.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 4.4.1 基本类型和 String 类型作为参数
     */
    @RequestMapping("save.do")
    public String save(int id,String name){
        System.out.println(id+","+name);
        return "success";
    }

    /**
     * 4.4.2 POJO类型作为参数
     * 请求地址：/user/update.do?id=999&name=Jet
     * 封装对象：user
     * 注意：   请求的参数要与对象的属性一致，否则封装不了数据。
     */
    @RequestMapping("update.do")
    public String update(User user){
        System.out.println(user.getId()+","+user.getName());
        return "success";
    }

    /**
     * 4.4.3	POJO 类中包含集合类型参数
     */
    @RequestMapping("edit.do")
    public String edit(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * 4.4.4	中文乱码解决
     */
    @RequestMapping("saveUser.do")
    public String saveUser(User user){
        System.out.println(user.getName());
        return "success";
    }

    /**
     * 细节：
     * （1） 请求参数要与方法形参名称一致
     *       http://localhost:8080/save2.do?id=1000
     *  (2) 请求参数要与方法形参名称 不一致
     *       http://localhost:8080/save2.do?userId=1000
     *  (3) 使用@RequestParam注解，建立：请求参数与方法形参的映射关系
     *  @RequestParam(
     *     name = "userId",   对应请求参数名称
     *     required = true,   请求参数必须要有userId
     *     defaultValue = "1" 默认值
     *  )
     */
    @RequestMapping("save2.do")
    public String save2(@RequestParam(name = "userId",required = true,defaultValue = "1") int id){
        System.out.println(id);
        return "success";
    }

    /**
     * 细节：提交的日期封装
     */
    @RequestMapping("save3.do")
    public String save3(User user){
        System.out.println(user.getBirthday());
        return "success";
    }



}
