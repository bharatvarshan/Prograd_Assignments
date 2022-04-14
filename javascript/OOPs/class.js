// Classes cannot be hoisted

// Class Declaration

class NewClassDeclaration {
  display() {
    console.log("class Declaration");
  }
}

var newClassDeclarationObject = new NewClassDeclaration();
newClassDeclarationObject.display();

// class NewClassName {}   --> throws error class already declared.

var NewClassExpression = class {
  constructor() {}
  display() {
    console.log("class Expression");
  }
};

// var newClassExpressionObject = new NewClassExpression().display();
// newClassExpressionObject.display();
// or
new NewClassExpression().display();

// function test() {
//   console.log("cool");
// }

console.log(typeof NewClassDeclaration);
// console.log(typeof NewClassExpression);
