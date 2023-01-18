<%-- 
    Document   : middle
    Created on : 08-Jun-2022, 11:32:38 am
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arena</title>
        <style>
            div.a{
        text-align: left;
        float: left;
    }
     div.b{
                text-decoration: none;
                text-align: right;
            }
       div.first{
           text-align: center;
           position: center;
           border-style: none;
           height: 110px;

       }
       
       div.third{
           
           float: left;
           margin-left: 300px;
           margin-top: 50px;
       }
       div.fourth{
           
           float:right;
           margin-right: 340px;
           margin-top: 50px;
       }
       div.second{
        text-align: center;
           position: center;
           border-style:none;
           margin-top: 140px;
       }
       a.one{
           color: black;
           font-family: Verdana, Geneva, Tahoma, sans-serif;
           font-size: 14pt;
           text-decoration: none;
       }
       sub{
           font-size: 14pt;
       }
        a.jan{
               color:black;
        font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        text-decoration: none;
        font-size: 17.5pt;
        text-align: right;
        position: right; 
            }
            button.a{
                width: 190px;
                height: 50px;
            }
            a.feb{
                       color:black;
                font-family: Brush Script MT, Brush Script Std, cursive;
                font-size: 25pt;
                text-decoration: none;
                margin-left: 20px;
            }
            i{
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
        <div class="third">
            
            <button  class="a" type="submit"><a class="one" href="adding.jsp"> Add Match</a></button>
           
        </div>
        <div class="fourth">
            
                <button  class="a" type="submit"><a class="one" href="deleting.jsp">Remove Match</a></button>

        </div>
        <div class="second">
            <form action="admpage" method="post">
                <button  class="a" type="submit"><i>Show the Matches</i></button>
            </form>
        </div> 
    </body>
</html>

