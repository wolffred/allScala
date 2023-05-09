abstract class Trade(val id:String, val symbol: String, val quantity:Double, val price:Double ) {

  def getId: String = {
    return id
  }

  def getSymbol: String = {
    return symbol
  }

  def getQuantity:Double = {
    return quantity
  }

  def getPrice:Double ={
    return price
  }

  def calcDividend()


  override def toString = s"Trade($id, $symbol)"
}
