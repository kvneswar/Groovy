class Account{
  def balance

  Account plus(Account other){
    new Account(balance: (this.balance + other.balance))
  }

  String toString(){
    "Balance: $balance"
  }
}

def savings = new Account(balance: 100)
def checking = new Account(balance: 100)
println savings + checking
