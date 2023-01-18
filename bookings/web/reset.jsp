<%-- 
    Document   : reset
    Created on : 11-Jun-2022, 1:50:53 am
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset Page</title>
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
                margin-top: 120px;
            }
            div.first{
                text-align: center;
                position: center;
                
            }
            div.third{
                text-align: center;
                position: center;
            }
            input{
                width:200px;
                height: 30px;
            }
            a.three{
                text-decoration: none;
                color:black;
            }
            b.feb{
                font-family: Verdana, Geneva, Tahoma, sans-serif;
                font-size: larger;
            }
            button.a{
                width: 100px;
                height: 30px;
            }  
        </style>
    </head>
    <body>
        <div class="zero">
            <h1>Password Reset Page</h1>
        </div>
        <div class="zero">
       <form method="post" action="set">
            
            <b class="feb">Email Id</b>&emsp;<input type="text" name="mail" placeholder="Enter Email Id"><br><br>
            
            <b class="feb">New Password</b>&emsp;<input type="password" placeholder="set new password" name="pwd"><br><br>
            <b class="feb">Confirm Password</b>&emsp;<input type="password" placeholder="Re-enter password" name="pwd1"><br><br>
            <button class="a" type="submit"><b>Reset</b></button>
    </div>
    </body>
</html>
