<%-- 
    Document   : book
    Created on : 10-Jun-2022, 5:35:03 pm
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arena Booking</title>
        <style>
            div.a{
        text-align: left;
        float: left;
    }
     div.b{
                text-decoration: none;
                text-align: right;
            }
            div.c{
                text-align: center;
                position: center;
            }
            div.d{
                text-align: center;
                position: center;
                margin-top: 80px;
            }
            b{
                font-family: Verdana, Geneva, Tahoma, sans-serif;
                font-size: larger;
            }
            a.jan{
               color:black;
        font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        text-decoration: none;
        font-size: 17.5pt;
        text-align: right;
        position: right; 
            }
            a.feb{
                       color:black;
                font-family: Brush Script MT, Brush Script Std, cursive;
                font-size: 25pt;
                text-decoration: none;
                margin-left: 20px;
            }
             button.a{
                width: 75px;
                height: 25px;
            }  
            input{
                width:100px;
                height: 20px;
            }
            i{
                font-size: 15pt;
            }
            a.mar{
                text-decoration: none;
                font-size: 14pt;
            }
        </style>
    </head>
    <body>
         <div class="a">
             <a class="feb" href="index.html" target="_self">Arena</a>
        </div>
       <div class="b">
            
            <a class="jan" href="index.html">Logout</a>
        </div>
        <div class="d">
            <h1>Seat Booking Chidambaram Stadium for</h1>
        </div>
        <div class="c">
        <form action="show" method="post">
            
                <b>Match ID</b>&emsp;<input type="text" name="id" placeholder="Enter Match Id">
                    <button class="a" type="submit">Set</button>
                    
            </div>
        
        </form>
    </body>
</html>
