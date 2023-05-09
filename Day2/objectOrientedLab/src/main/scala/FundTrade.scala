class FundTrade(override val id: String, override val symbol: String, override val quantity: Int, override val price: Int, var dividendRate: Double) extends Trade(id, symbol, quantity, price) {

  def calcDividend:Double = {
    return dividendRate*price
  }
}