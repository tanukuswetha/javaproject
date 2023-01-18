    <%-- 
    Document   : paygateway
    Created on : 12-Jun-2022, 5:47:30 pm
    Author     : Tanuku Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
        <link rel="stylesheet" href="payment.css"/>
    </head>
    <body>
        <form action="">
            <h2>Payment Details</h2>
            <hr>
            <p>Accepted Cards</p>
            <img src="visa.png" alt="visa">
            <img src="mastercard.png" alt="masterd">
            <img src="upi.jpg" alt="upi">
            <p>card Number:</p>
            <input type="tel" name="cardnumber" id="cardnumber" placeholder="xxxx-0000-xxxx-0000">
            <div class="row">
                <div class="no1">
                    <p>Expire Date</p>
                    <input type="date" name="Expiredate" id="Expiredate">
                </div>
                <div class="no2">
                    <p>CVV</p>
                    <input type="password" name="cvv" id="cvv" maxlength="3">
                    
                </div>
            </div>
            <p>Card Owner Name</p>
            <input type="text" name="ownername" id="ownername">
            <input type="submit" value="confirm payment">
        </form>
    </body>
</html>
