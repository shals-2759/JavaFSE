// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");

window.onload = () => {
  alert("Page fully loaded");
};

// 2. Syntax, Data Types, and Operators
const eventName = "Tech Expo";
const eventDate = "2025-06-10";
let seats = 50;

console.log(`Upcoming: ${eventName} on ${eventDate}. Seats left: ${seats}`);

// 3. Conditionals, Loops, and Error Handling
const eventList = [
  { name: "Tech Expo", date: "2025-06-10", seats: 10, category: "Tech" },
  { name: "Music Fiesta", date: "2025-05-20", seats: 0, category: "Music" },
  { name: "Food Fest", date: "2024-12-01", seats: 30, category: "Food" }
];

eventList.forEach(evt => {
  const isUpcoming = new Date(evt.date) > new Date();
  const hasSeats = evt.seats > 0;

  if (isUpcoming && hasSeats) {
    console.log(`${evt.name} is open for registration.`);
  } else {
    console.warn(`${evt.name} is either full or past.`);
  }
});

function registerEvent(evt) {
  try {
    if (evt.seats <= 0) throw new Error("No seats left");
    evt.seats--;
    console.log(`Registered! Remaining: ${evt.seats}`);
  } catch (err) {
    console.error(`Registration failed: ${err.message}`);
  }
}

// 4. Functions, Closures, Higher-Order Functions
function addEvent(name, date, seats, category) {
  eventList.push({ name, date, seats, category });
}

function filterEventsByCategory(cat) {
  return eventList.filter(evt => evt.category === cat);
}

function createCategoryCounter() {
  let count = 0;
  return () => ++count;
}
const techCount = createCategoryCounter();

// 5. Objects and Prototypes
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const myEvent = new Event("Dance Night", "2025-07-01", 20);
console.log(Object.entries(myEvent));

// 6. Arrays and Methods
const events = ["Baking Workshop", "Tech Talk", "Music Jam"];
events.push("Yoga Session");

const musicEvents = eventList.filter(e => e.category === "Music");

const displayCards = events.map(e => `🎉 ${e}`);
console.log(displayCards);

// 7. DOM Manipulation
const container = document.querySelector(".container");

eventList.forEach(evt => {
  const div = document.createElement("div");
  div.className = "event-card";
  div.innerHTML = `
    <h3>${evt.name}</h3>
    <p>Date: ${evt.date}</p>
    <p>Seats: ${evt.seats}</p>
    <button onclick="registerEventFromDOM('${evt.name}')">Register</button>
  `;
  container.appendChild(div);
});

function registerEventFromDOM(name) {
  const evt = eventList.find(e => e.name === name);
  registerEvent(evt);
  alert(`You registered for ${name}`);
}

// 8. Event Handling
document.addEventListener("DOMContentLoaded", () => {
  const filterSelect = document.getElementById("eventType");
  if (filterSelect) {
    filterSelect.onchange = () => {
      const cat = filterSelect.value;
      console.log("Filtered:", filterEventsByCategory(cat));
    };
  }

  document.addEventListener("keydown", (e) => {
    if (e.key === "s") {
      console.log("Quick search triggered");
    }
  });
});

// 9. Async JS
async function fetchEvents() {
  try {
    document.body.classList.add("loading");
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log("Fetched events:", data.slice(0, 3));
  } catch (err) {
    console.error("Failed to fetch:", err);
  } finally {
    document.body.classList.remove("loading");
  }
}
fetchEvents();

// 10. Modern JS Features
function greet(name = "Guest") {
  console.log(`Hello, ${name}`);
}

const [first, ...others] = events;
const cloned = [...eventList];

// 11. Working with Forms
const form = document.querySelector("#registerForm");
if (form) {
  form.addEventListener("submit", function (e) {
    e.preventDefault();
    const { name, email, event } = form.elements;
    if (!name.value || !email.value) {
      alert("All fields are required!");
      return;
    }
    console.log(`Registered: ${name.value} for ${event.value}`);
  });
}

// 12. AJAX & Fetch API
function submitRegistration(data) {
  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(data),
    headers: { "Content-Type": "application/json" }
  })
    .then(res => res.json())
    .then(data => {
      setTimeout(() => {
        alert("Registration successful!");
        console.log("Server Response:", data);
      }, 1500);
    })
    .catch(err => alert("Registration failed: " + err.message));
}

// 13. Debugging
console.log("Form submission started");
// Use breakpoints in Chrome DevTools and watch variables during this stage

// 14. jQuery
$(document).ready(function () {
  $("#registerBtn").click(() => {
    alert("jQuery: Registered!");
  });

  $(".event-card").fadeIn();

  // Benefit of using frameworks:
  // React and Vue make dynamic UI updates easier with component-based architecture.
});
