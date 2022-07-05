public class Stock {
  private String symbol, name;
  private double previousClosingPrice;
  private double currentPrice;

  public Stock(String sym, String nm) {
    symbol = sym;
    name = nm;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public void setPreviousClosingPrice(double previousClosingPrice) {
    this.previousClosingPrice = previousClosingPrice;
  }

  double getChangePercent() {
    return (previousClosingPrice - currentPrice) * 100;

  }

  public static void main(String[] args) {
    Stock orcl = new Stock("ORCL", "orace cororation");
    orcl.setCurrentPrice(34.35);
    orcl.setPreviousClosingPrice(34.5);
    System.out.println(orcl.getChangePercent());

  }
}
