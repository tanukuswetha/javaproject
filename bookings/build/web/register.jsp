<%-- 
    Document   : register
    Created on : 08-Jun-2022, 10:52:58 am
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration Page</title>
        
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
            <h1>User Register Page</h1>
        </div>
    </body>
    <div class="first">
        <form method="post" action="reg">
            <b class="feb">Name</b>&emsp;<input type="text" name="nam" placeholder="Enter full name"><br><br>
            <b class="feb">Email Id</b>&emsp;<input type="text" name="mail" placeholder="Enter Email Id"><br><br>
            <b class="feb">Phone number</b>&emsp;<input type="tel" placeholder="Enter Phone number" name="phn"><br><br>
            <b class="feb">New Password</b>&emsp;<input type="password" placeholder="set new password" name="pwd"><br><br>
            <b class="feb">Confirm Password</b>&emsp;<input type="password" placeholder="Re-enter password" name="pwd1"><br><br>
            <button class="a" type="submit"><b>Register</b></button>
    </div>
</html>
