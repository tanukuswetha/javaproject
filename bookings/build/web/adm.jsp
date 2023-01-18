<%-- 
    Document   : adm
    Created on : 08-Jun-2022, 1:11:50 pm
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <style>
             div.apple{
                text-align: left;
        float: left;
        
            }
            a.tom{
                color:black;
                font-family: Brush Script MT, Brush Script Std, cursive;
                font-size: 25pt;
                text-decoration: none;
                margin-left: 20px;
            }
            div.zero{
                text-align: center;
                position: center;
                margin-top: 170px;
            }
            div.first{
                text-align: center;
                position: center;
                
            }
            div.second{
                text-align: center;
                position: center;
            }
            div.third{
                text-align: center;
                position: center;
            }
            div.fourth{
                text-align: center;
                position: center;
            }
            b.jan{
                font-family: Verdana, Geneva, Tahoma, sans-serif;
                font-size: larger;
            }
            b.feb{
                font-family: Verdana, Geneva, Tahoma, sans-serif;
                font-size:15pt;
            }
            a.one{
                font-size: 14pt;
                color: black;
                
            }
            a.two{
                font-size: 14pt;
                color: black;
            }
            a.three{
                text-decoration: none;
                color:black;
            }
            input{
                width:200px;
                height: 30px;
            }
            button.a{
                width: 100px;
                height: 30px;
            }
            h1{
                font-size: 32pt;
            }
            hr{
                height: 2px;
                border-width: 0;
                width: 300px;
                color:black;
                background-color:black;
            }
        </style>
    </head>
    <body>
         
      <div class="zero">
            <h1>Admin Login</h1>
      </div><br>
      <div class="first">
          <form action="admin" method="post">
          <b class="feb">Admin Id</b>&emsp;
          <input type="tel" placeholder="Enter Admin Id" name="adminid"><br><br>
          <b class="feb">Username/EmailId</b>&emsp;
        <input type="text" placeholder="Enter Username" name="aname" size="30" ><br><br>
        <b class="feb">Password</b>&emsp;
        <input type="password" placeholder="Enter Password" name="password" size="30"><br><br>
         <button class="a" type="submit" target="_self" ><b class="jan">Log in</b></button>
         </form>
      </div>
    </body>
</html>
