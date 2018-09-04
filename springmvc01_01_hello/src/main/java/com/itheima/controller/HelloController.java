package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理请求的控制器类
 */
@Controller // 创建对象
public class HelloController {

    // 单例，启动时候执行控制器的默认构造函数
    public HelloController(){
        System.out.println("创建HelloController！");
    }

    /**
     * 访问地址：http://localhost:8080/hello.do
     * 请求地址：/hello.do
     * 对用的处理请求的方法：hello();
     */
    @RequestMapping("/hello.do")
    public String hello(){
        System.out.println("springMVC的控制器HelloController处理请求!");
        // 返回的字符串，就是跳转的页面的名称
        // 最终跳转到： http://localhost:8080/pages/success.jsp
        // ---->  "/pages/" + "success" + ".jsp"
        return "success";
    }
}
