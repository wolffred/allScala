class Bronze(val maxTrades: Int) extends MembershipType{

  def canTrade(numberOfTrades: Int):Boolean ={
    return numberOfTrades >= maxTrades
  }


}
