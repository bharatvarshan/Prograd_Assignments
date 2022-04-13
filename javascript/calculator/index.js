let display = document.getElementById("display");

let buttons = Array.from(document.getElementsByClassName("button"));
console.log(buttons);

buttons.map((button) => {
  button.addEventListener("click", calculate);
});

// Button Press Handler
function calculate(e) {
  switch (e.target.innerText) {
    case "C":
      display.innerText = "";
      break;
    case "=":
      try {
        display.innerText = eval(display.innerText);
      } catch {
        alert("Invalid Expression");
        display.innerText = "";
      }
      break;
    case "←":
      if (display.innerText != "") {
        display.innerText = display.innerText.slice(0, -1);
      }
      break;
    default:
      display.innerText += e.target.innerText;
  }
}

// Keyboard Events
document.addEventListener("keydown", function (event) {
  if (event.key === "Enter" && display.innerText != "") {
    document.getElementById("equal").click();
  } else if (event.key == "Escape") {
    document.getElementById("clear").click();
  } else if (event.key == "Backspace") {
    document.getElementById("backspace").click();
  }
});
