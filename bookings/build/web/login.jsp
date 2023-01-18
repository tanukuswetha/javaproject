<%-- 
    Document   : login
    Created on : 08-Jun-2022, 12:28:14 pm
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            
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
            div.apple{
                text-align: left;
        float: left;
        margin-top: 0px;
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
            <h1>User Login</h1>
        </div><br>
        <div class="first">
            <form method="post" action="logi">
                <b class="feb">EmailId<b>&emsp;<input type="text" placeholder="Enter Username" name="em" size="30" ><br><br>
                        <b class="feb"> Password<b>&emsp;<input type="password" placeholder="Enter Password" name="pword"><br><br>
            <button class="a" type="submit" ><b class="jan">Login</b></button> 
            </form>
        </div><br>
        <div class="second">
            <a href="reset.jsp" class="one">forgot password?</a>&emsp;
            <button class="a" type="button" target="_self" onclick="alert('Redirecting to register page')"><b class="jan"><a class="three" href="register_1.jsp" target="_self">Sign up</a></b></button>
        </div>
    </body>
</html>
