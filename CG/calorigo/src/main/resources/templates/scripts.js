document.addEventListener("DOMContentLoaded", function () {
    fetchFoodItems();
});

function fetchFoodItems() {
    fetch("http://localhost:8080/api/food-items")  // Update API URL
        .then(response => response.json())
        .then(data => {
            const container = document.getElementById("food-container");
            container.innerHTML = "";  // Clear previous data

            data.forEach(item => {
                const foodCard = `
                    <div class="food-card">
                        <img src="assets/images/${item.name.toLowerCase()}.jpg" alt="${item.name}">
                        <h3>${item.name}</h3>
                        <p>Calories: ${item.calories} | Protein: ${item.protein}g</p>
                        <p>${item.description}</p>
                        <button class="btn">Add to Cart</button>
                    </div>
                `;
                container.innerHTML += foodCard;
            });
        })
        .catch(error => console.error("Error fetching food items:", error));
}
