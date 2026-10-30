const menus = {

    REC_MART: [
        { name: "Chips", price: 20 },
        { name: "Chocolate", price: 30 },
        { name: "Biscuits", price: 15 }
    ],

    REC_CAFE: [
        { name: "Burger", price: 50 },
        { name: "Sandwich", price: 40 },
        { name: "Juice", price: 30 }
    ],

    REC_HUTCAFE: [
        { name: "Pizza", price: 80 },
        { name: "French Fries", price: 50 },
        { name: "Coffee", price: 25 }
    ]

};

let selectedShop = "";
let cart = [];

function showMenu(shop) {

    selectedShop = shop;

    cart = [];

    document.getElementById("shopName").innerText =
        shop + " Menu";

    let output = "";

    menus[shop].forEach((food, index) => {

        output += `
            <div class="food-card">

                <h3>${food.name}</h3>

                <p>Price: ₹${food.price}</p>

                <button onclick="addToCart(${index})">
                    Add to Cart
                </button>

            </div>
        `;

    });

    document.getElementById("menuItems").innerHTML = output;

    document.getElementById("confirmation").innerHTML = "";

    displayCart();

}

function addToCart(index) {

    let food = menus[selectedShop][index];

    let existing = cart.find(item =>
        item.name === food.name
    );

    if (existing) {

        existing.quantity++;

    } else {

        cart.push({
            name: food.name,
            price: food.price,
            quantity: 1
        });

    }

    displayCart();

}

function displayCart() {

    let output = "";

    let total = 0;

    cart.forEach((item, index) => {

        let amount = item.price * item.quantity;

        total += amount;

        output += `
            <div class="cart-item">

                <h3>${item.name}</h3>

                <p>Price: ₹${item.price}</p>

                <p>Quantity: ${item.quantity}</p>

                <button onclick="changeQuantity(${index}, 1)">
                    +
                </button>

                <button onclick="changeQuantity(${index}, -1)">
                    -
                </button>

                <button onclick="removeItem(${index})">
                    Remove
                </button>

                <p>Amount: ₹${amount}</p>

            </div>
        `;

    });

    document.getElementById("cartItems").innerHTML = output;

    document.getElementById("total").innerText =
        "Total: ₹" + total;

}

function changeQuantity(index, value) {

    cart[index].quantity += value;

    if (cart[index].quantity <= 0) {

        cart.splice(index, 1);

    }

    displayCart();

}

function removeItem(index) {

    cart.splice(index, 1);

    displayCart();

}

function checkout() {

    let name = document.getElementById("studentName").value.trim();

    let register = document.getElementById("registerNo").value.trim();

    if (!name || !register) {

        alert("Please enter your student details.");

        return;

    }

    if (!selectedShop || cart.length === 0) {

        alert("Please select a shop and add food items.");

        return;

    }

    let total = cart.reduce(
        (sum, item) => sum + item.price * item.quantity,
        0
    );

    let reference =
        "CB" + Date.now().toString().slice(-6);

    document.getElementById("confirmation").innerHTML = `

        <h2>Booking Successful!</h2>

        <p>Student Name: ${name}</p>

        <p>Register Number: ${register}</p>

        <p>Shop: ${selectedShop}</p>

        <p>Total Amount: ₹${total}</p>

        <h2>Reference Code: ${reference}</h2>

        <p>Status: PENDING</p>

        <p>Show your reference code at the selected shop.</p>

    `;

    cart = [];

    displayCart();

}