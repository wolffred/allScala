class Trade(val id:String, val symbol: String, val quantity:Double, var price:Double ) {

//  def price = _price //getter method
//  def price_=(value: Double) = { if (value >= 0) _price = value }

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

  def calcDividend() = {}

  def value: Double = {
    return price * quantity
  }


  override def toString = s"Trade($id, $symbol)"
}
