package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Controller 标识控制层组件， 创建对象加入容器
 * @RequestMapping
 *     1. 作用范围
 *        类：表示访问类时候必须指定的路径，作为完整路径的一部分
 *            主要用于区分不同的模块。
 *            举例：/account       这里的/可以省略
 *        方法：表示访问方法需要的路径。
 *            举例：/findById.do   这里的/可以省略
 *     2. method 属性 ，表示限定请求方式
 *        method = RequestMethod.POST 必须式post请求才可以访问方法
 *        否则：HTTP Status 405 – Method Not Allowed
 *     3. params 属性，表示必须带着指定的请求参数，才可以访问方法
 *        params = "id=100" 表示请求必须带上参数：id=100
 *        举例：http://localhost:8080/account/update.do?id=100
 *     4.headers 属性, 表示必须带着指定的请求头，才可以访问方法
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    // 1. 作用范围
    @RequestMapping("/findById.do")
    public String findById(){
        return "success";
    }

    // 2. method属性
    @RequestMapping(value = "/save.do",method = RequestMethod.POST)
    public String save(){
        return "success";
    }

    // 3. params属性
    @RequestMapping(value = "/update.do",params = "id=100")
    public String update(){
        return "success";
    }

    // 4.headers 属性
    @RequestMapping(value = "/delete.do",headers = "Accept-Encoding=gzip, deflate, br")
    public String delete(){
        return "success";
    }
}
