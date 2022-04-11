// Will deal with only positive numbers and accepts parameter numbers in any order to provide positive output

function smart_calculate(operation_function, number1, number2) {
  if (number1 >= 0 && number2 >= 0) {
    if (number1 > number2) {
      return operation_function(number1, number2);
    } else {
      return operation_function(number2, number1);
    }
  } else {
    return (
      "Numbers Should be positive. If positive the output would be:" +
      operation_function(Math.abs(number1), Math.abs(number2))
    );
  }
}

function add(number1, number2) {
  if (number1 >= 0 && number2 >= 0) {
    return number1 + number2;
  } else {
    return "Numbers Should be positive";
  }
}

function substract(number1, number2) {
  if (number1 >= 0 && number2 >= 0) {
    if (number1 > number2) {
      return number1 - number2;
    } else {
      return number2 - number1;
    }
  } else {
    return "Numbers Should be positive";
  }
}

function multiply(number1, number2) {
  if (number1 >= 0 && number2 >= 0) {
    return number1 * number2;
  } else {
    return "Numbers Should be positive";
  }
}

function divide(number1, number2) {
  if (number1 >= 0 && number2 >= 0) {
    if (number1 > number2) {
      return number1 / number2;
    } else {
      return number2 / number1;
    }
  } else {
    return "Numbers Should be positive";
  }
}

function smart_add(number1, number2) {
  return number1 + number2;
}

function smart_substract(number1, number2) {
  return number1 - number2;
}

function smart_multiply(number1, number2) {
  return number1 * number2;
}
function smart_divide(number1, number2) {
  return number1 / number2;
}

console.log(add(2, 4));
console.log(smart_calculate(smart_add, 2, 4));

console.log(substract(2, 4));
console.log(smart_calculate(smart_substract, 2, 4));

console.log(multiply(2, 4));
console.log(smart_calculate(smart_multiply, 2, 4));

console.log(divide(2, 4));
console.log(smart_calculate(smart_divide, 2, 4));
