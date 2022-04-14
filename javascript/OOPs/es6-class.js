class User {
  constructor(name, email) {
    this.name = name;
    this.email = email;
  }
  login() {
    console.log(this.name, "just logged in!");
  }
}

var userOne = new User("bv", "bv@bv.com");

console.log(userOne);
userOne.login();
