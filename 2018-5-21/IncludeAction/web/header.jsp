<%--
  Created by IntelliJ IDEA.
  User: maayanpolitzer
  Date: 21/05/2018
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery.js"></script>
    <style>
        .active {
            font-weight: bold;
            color:#00f;
            background-color: pink;
        }

        ul {
            list-style: none;
        }

        li {
            display: inline-block;
            border: 1px solid #000;
            margin:0 10px;
        }

        a {
            text-decoration: none;
        }
    </style>
</head>
<body>

<ul>
    <li><a href="index.jsp">main</a></li>
    <li><a href="profile.jsp">profile</a></li>

    <button onclick="logout()">logout</button>
</ul>

    <script>
        var active = <%=request.getParameter("active")%>;
        console.log(active);
        var li = document.getElementsByTagName("li");
        for(var i = 0; i < li.length; i++){
            if(i ==active){
                li[i].classList.add("active");
                break;
            }

        }

        function logout(){
            $.ajax({
                url:"/logout",
                method: "GET",
                success: function(data){
                    alert(data);
                },
                failure: function(e){
                    console.log(e);
                }
            });
        }
    </script>

</body>
</html>
