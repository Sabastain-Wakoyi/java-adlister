<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/pizza-order" method="post">
    <%--@declare id="pepperoni"--%><label for="crustType">Crust Type</label>
    <select name="crustType" id="crustType">
        <option value="Aseh">Aseh</option>
        <option value="subway-tossed">Subway Tossed</option>
        <option value="stuffed">Stuffed</option>
    </select>
    <br> <br>
    <label for="sauceType">Sauce</label>
    <select name="sauceType" id="sauceType">
        <option value="egusi soup">Egusi Soup</option>
        <option value="eru">Eru</option>
        <option value="mboogochobi">Mbogochobi</option>
    </select>
    <br> <br>
    <label for="size">Size</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="med">Medium</option>
        <option value="lg">Large</option>
    </select>
    <br><br>
    <label for=" pepper soup">Pepper Soup</label>
    <input type="checkbox" id=" pepper soup" value="pepper soup">
    <br>
    <label for="fufu corn">Fufu Corn</label>
    <input type="checkbox" id="fufu corn" value="fufu corn">
    <br>
    <label for="Water fufu">Water fufu</label>
    <input type="checkbox" id="water fufu" value="water fufu">
    <br>
    <label for="address">Delivery Address</label>
    <input type="text" id="address">
    <button type="submit" value="Submit">Order</button>
</form>
