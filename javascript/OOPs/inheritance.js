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

// Admin class inheriting from the User Class
class Admin extends User {
  deleteUser(user) {
    users = users.filter((u) => {
      return u.email != user.email;
    });
  }
}

var userOne = new User("bv", "bv@bv.com");
var userTwo = new User("test", "test@bv.com");
var admin = new Admin("admin", "admin@bv.com");
users = [userOne, userTwo, admin];

// admin.deleteUser(userOne);
console.log(users);
