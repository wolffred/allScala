class BondTrade(override val id: String, override val symbol: String, override val quantity: Int, override val price: Int, var dividend:Int) extends Trade(id, symbol, quantity, price) {

  def getDividend = println(dividend)

  def setDividend(newDividend:Int) = {
    dividend = newDividend
    dividend
  }

  def calcDividend = println(dividend)

}
