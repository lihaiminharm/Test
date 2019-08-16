<%--
  Created by IntelliJ IDEA.
  User: wth
  Date: 2019/7/23
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page  isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>404页面</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        h3{
            color: #5eabd1;
        }
        #img-404{
            width: 60%;
        }
        #haima-img{

        }
        .box{
            width: 100%;
            height: 720px;
            background-color: #f2f2f2;
            padding: 96px 24px;
            box-sizing: border-box;
        }
        .header{
            width: 48%;
            margin: 36px auto 12px auto;
            text-align: center;
        }
        .center{
            width: 48%;
            margin: 24px auto;
        }
        .footer{
            width: 48%;
            margin: 24px auto;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="box">
    <%--<div class="header"><img id="img-404" src="img/404.png"></div>--%>
    <!--    http://r.photo.store.qq.com/psb?/V12PEH4e02CC5z/5Pxrm0d.yVqmYQXn05Zsw9r73h3e1kGiqXsCepbVKI4!/r/dJ8AAAAAAAAA-->
    <div class="center" align="center"><img id="haima-img" src="http://r.photo.store.qq.com/psb?/V12PEH4e02CC5z/u.62eQn67h9zKibK4z6opzonKVfeDRjkJUvhOApSM98!/r/dBkBAAAAAAAA"></div>
    <div class="footer"><h3>请您用微信扫描此二维码,谢谢!</h3></div>
</div>
</body>
</html>
