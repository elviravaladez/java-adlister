<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pizza Order Page" />
    </jsp:include>
</head>
<body>
<div class="container">
    <h1>Pizza Builder</h1>

    <form action="/pizza-order" method="POST">
        <div class="form-group">
            <label for="crust">Crust</label>
            <select class="form-control" id="crust" name="crust">
                <option selected value="hand-tossed">Hand Tossed</option>
                <option value="stuffed">Stuffed Crust</option>
                <option value="thin-crust">Thin Crust</option>
            </select>
        </div>

        <div class="form-group">
            <label for="sauce">Sauce</label>
            <select class="form-control" id="sauce" name="sauce">
                <option selected value="marinara">Marinara Sauce</option>
                <option value="alfredo">Alfredo Sauce</option>
                <option value="honey-bbq">Honey BBQ Sauce</option>
            </select>
        </div>

        <div class="form-group">
            <label for="size">Size</label>
            <select class="form-control" id="size" name="size">
                <option selected value="large">Large</option>
                <option value="medium">Medium</option>
                <option value="small">Small</option>
            </select>
        </div>

        <div>Toppings</div>
        <div class="form-group form-check">
            <input class="form-check-input" type="checkbox" value="bell-peppers" id="bell-peppers" name="toppings">
            <label class="form-check-label" for="bell-peppers">
                Bell Peppers
            </label>
        </div>
        <div class="form-group form-check">
            <input class="form-check-input" type="checkbox" value="onion" id="onion" name="toppings">
            <label class="form-check-label" for="onion">
                Onion
            </label>
        </div>
        <div class="form-group form-check">
            <input class="form-check-input" type="checkbox" value="olives" id="olives" name="toppings">
            <label class="form-check-label" for="olives">
                Black Olives
            </label>
        </div>
        <div class="form-group form-check">
            <input class="form-check-input" type="checkbox" value="mushrooms" id="mushrooms" name="toppings">
            <label class="form-check-label" for="mushrooms">
                Mushrooms
            </label>
        </div>
        <div class="form-group form-check">
            <input class="form-check-input" type="checkbox" value="vegan-cheese" id="vegan-cheese" name="toppings">
            <label class="form-check-label" for="vegan-cheese">
                Vegan Cheese
            </label>
        </div>

        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" class="form-control" id="address" placeholder="1234 Main St" name="address">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="city">City</label>
                <input type="text" class="form-control" id="city" name="city">
            </div>
            <div class="form-group col-md-4">
                <label for="state">State</label>
                <select id="state" class="form-control" name="state">
                    <option selected>Choose...</option>
                    <option value="AK">Alaska</option>
                    <option value="AL">Alabama</option>
                    <option value="AR">Arkansas</option>
                    <option value="AZ">Arizona</option>
                    <option value="CA">California</option>
                    <option value="CO">Colorado</option>
                    <option value="CT">Connecticut</option>
                    <option value="DC">District of Columbia</option>
                    <option value="DE">Delaware</option>
                    <option value="FL">Florida</option>
                    <option value="GA">Georgia</option>
                    <option value="HI">Hawaii</option>
                    <option value="IA">Iowa</option>
                    <option value="ID">Idaho</option>
                    <option value="IL">Illinois</option>
                    <option value="IN">Indiana</option>
                    <option value="KS">Kansas</option>
                    <option value="KY">Kentucky</option>
                    <option value="LA">Louisiana</option>
                    <option value="MA">Massachusetts</option>
                    <option value="MD">Maryland</option>
                    <option value="ME">Maine</option>
                    <option value="MI">Michigan</option>
                    <option value="MN">Minnesota</option>
                    <option value="MO">Missouri</option>
                    <option value="MS">Mississippi</option>
                    <option value="MT">Montana</option>
                    <option value="NC">North Carolina</option>
                    <option value="ND">North Dakota</option>
                    <option value="NE">Nebraska</option>
                    <option value="NH">New Hampshire</option>
                    <option value="NJ">New Jersey</option>
                    <option value="NM">New Mexico</option>
                    <option value="NV">Nevada</option>
                    <option value="NY">New York</option>
                    <option value="OH">Ohio</option>
                    <option value="OK">Oklahoma</option>
                    <option value="OR">Oregon</option>
                    <option value="PA">Pennsylvania</option>
                    <option value="PR">Puerto Rico</option>
                    <option value="RI">Rhode Island</option>
                    <option value="SC">South Carolina</option>
                    <option value="SD">South Dakota</option>
                    <option value="TN">Tennessee</option>
                    <option value="TX">Texas</option>
                    <option value="UT">Utah</option>
                    <option value="VA">Virginia</option>
                    <option value="VT">Vermont</option>
                    <option value="WA">Washington</option>
                    <option value="WI">Wisconsin</option>
                    <option value="WV">West Virginia</option>
                    <option value="WY">Wyoming</option>
                </select>
            </div>
            <div class="form-group col-md-2">
                <label for="zipcode">Zip</label>
                <input type="text" class="form-control" id="zipcode" name="zipcode">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
