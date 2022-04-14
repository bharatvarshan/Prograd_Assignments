// Object
var userOne = {
  name: "bharat",
  email: "bv@bv.com",
  // Before ES6
  //   login: function () {
  //     console.log(this.email, "is logged in");
  //   },
  //After ES6 shorter version to define a function inside an object.
  login() {
    console.log(this.email, "is logged in");
  },
};

// Read Object properties
console.log(userOne.name); // Returns bharat
console.log(userOne["name"]); // Returns bharat

// We can modify a property

userOne.email = "bv@presidio.com";
console.log(userOne.email); // Returns bv@presidio.com

// Add a property
userOne.age = 22;
console.log(userOne);
