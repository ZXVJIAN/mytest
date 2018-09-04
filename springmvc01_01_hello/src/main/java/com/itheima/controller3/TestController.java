package com.itheima.controller3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 标识控制层的组件
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 1. servlet api作为方法参数
     * 访问地址：
     * http://localhost:8080/test/servletApi.do
     */
    //@RequestMapping("/servletApi.do")
    @RequestMapping("/servletApi")
    public String servletApi(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }

    /**
     * 2.RequestHeader 根据指定的请求头，获取请求头对用的值
     * 访问地址：
     * http://localhost:8080/test/requestHeader.do
     */
    @RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader("Accept-Language") String headValue){
        // 这里直接获取请求头：Accept-Language内容
        System.out.println(headValue);
        return "success";
    }

    /**
     * 3. @CookieValue 获取cookie的value信息
     */
    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue("JSESSIONID") String sessionId){
        // 获取cookie中指定的key（JSESSIONID）对应的值
        System.out.println(sessionId);
        return "success";
    }


    /**
     * 4. @CookieValue 获取cookie的value信息
     */
    @RequestMapping("/requestBody")
    public String requestBody(@RequestBody String requestData){
        // 请求数据:name=xx&address=gz
        System.out.println(requestData);
        return "success";
    }

}
