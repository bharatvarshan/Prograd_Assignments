class Main {
  printCool() {
    console.log("Cool");
  }
}

var mainObject = new Main();
mainObject.printCool();

Main.prototype.printSuper = function () {
  console.log("Super");
};

mainObject.printSuper();
