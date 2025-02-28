document.getElementById("login-form").addEventListener("submit", function (event) {
    event.preventDefault();

    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    fetch("http://localhost:8080/api/auth/login", {  // Backend Login API
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ username, password })
    })
    .then(response => response.json())
    .then(data => {
        if (data.token) {
            localStorage.setItem("jwt", data.token);  // Store JWT Token
            alert("Login Successful!");
            window.location.href = "index.html";  // Redirect to Homepage
        } else {
            alert("Invalid Credentials");
        }
    })
    .catch(error => console.error("Login Error:", error));
});
