public class Account {
  private int id;
  private double balance;
  private double annualInerestRate;
  private java.util.Date dateCreated;

  Account() {
    this.id = 0;
    this.balance = 0;
    this.annualInerestRate = 0;
    dateCreated = new java.util.Date();
  }

  Account(int id, double balance, double annualInerestRate) {
    this.id = id;
    this.balance = balance;
    this.annualInerestRate = annualInerestRate / 100;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnnualInerestRate(double annualInerestRate) {
    this.annualInerestRate = annualInerestRate;
  }

  public double getAnnualInerestRate() {
    return annualInerestRate;
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public double getMonthlyInterestRate() {
    return this.annualInerestRate / 12;
  }

  public double getMonthlyInterest() {
    return this.balance * getMonthlyInterestRate();
  }

  public void withdraw(double money) {
    if (this.balance - money > 0) {
      System.out.println("withdraw successfuly : " + money + "$.");
    } else {
      System.out.println("no enough crds");
    }
  }

  public void deposit(double money) {

    System.out.println("deposits successfuly");
    this.balance += money;
  }

  public static void main(String[] args) {

    Account a = new Account(1122, 20, 2.5);

    a.withdraw(2500);
    System.out.println(a.getBalance());

    a.deposit(3000);
    System.out.println(a.getBalance());

    System.out.println(a.getMonthlyInterest());

    System.out.println(a.getDateCreated());

  }
}
