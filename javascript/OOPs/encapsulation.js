class Bank {
  constructor(input_balance) {
    this.balance = input_balance;
  }

  getBalance() {
    return this.balance;
  }

  setBalance(input_balance) {
    if (input_balance > 100) {
      this.balance = input_balance;
    } else {
      console.log("Minimum Balance 100");
    }
  }
}

var bank = new Bank(600);
bank.setBalance(1000);
console.log(bank.getBalance());
