class User {
  constructor(name, email) {
    this.name = name;
    this.email = email;
    this.score = 0;
  }
  login() {
    console.log(this.name, "just logged in!");
    return this;
  }
  logout() {
    console.log(this.name, "just logged out!");
    return this;
  }
  updateScore() {
    this.score++;
    console.log(this.name, "score is :", this.score);
    return this; // Without this statement it doesnot returns the instance of the object so method chaining cannot be achieved.
  }
}

var userOne = new User("bv", "bv@bv.com");

console.log(userOne);
userOne.login().updateScore().updateScore().logout();
//Output
// bv just logged in!
// bv Score is : 1
// bv Score is : 2
// bv just logged out!
