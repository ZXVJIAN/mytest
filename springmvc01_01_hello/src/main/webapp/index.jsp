<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h3>1. springMVC的第一个请求</h3>
    <a href="http://localhost:8080/hello.do">访问控制器：HelloController</a>

    <h3>2. @RequestMapping</h3>
    <a href="/account/findById.do">@RequestMapping作用范围</a><br>
    <a href="/account/save.do">@RequestMapping请求方式属性(GET)</a>
    <form action="/account/save.do" method="post">
        <input type="submit" value="post">
    </form>
    <a href="/account/update.do?id=100">固定请求参数</a>
    <a href="/account/delete.do">请求头</a>

    <h3>3. 请求参数绑定</h3>
    <a href="/user/save.do?id=999&name=Jet">请求1</a>
    <a href="/user/update.do?id=999&name=Jerry">请求2:pojo</a>

    <form action="/user/edit.do" method="post">
        用户名：<input type="text" name="name">         <br>
        省份：<input type="text" name="address.province">         <br>
        城市：<input type="text" name="address.city">         <br>

        地址list集合1：<input type="text" name="list[0].province">
        地址list集合1：<input type="text" name="list[0].city">       <br>

        地址map集合2：<input type="text" name="map['one'].province">
        地址map集合2：<input type="text" name="map['one'].city">     <br>

        <input type="submit" value="提交集合数据">
    </form>

    <%--测试GET提交--%>
    <a href="/user/saveUser.do?name=杰克">中文数据GET</a>
    <%--测试POST提交--%>
    <form action="/user/saveUser.do" method="post">
        <input type="text" name="name">
        <input type="submit" value="post">
    </form>

    <h3>@RequestParam</h3>
    <a href="/user/save2.do?userId=1123">测试</a>
    <a href="/user/save2.do">测试</a>

    <h3>Date Converter 日期转换</h3>
    <a href="/user/save3.do?birthday=1998-09-09">测试</a>

    <h3>RequestBody注解</h3>
    <form action="/test/requestBody.do" method="post">
        用户名称：<input type="text" name="name"> <br>
        用户地址：<input type="text" name="address"> <br>
        <input type="submit">
    </form>
</body>
</html>
