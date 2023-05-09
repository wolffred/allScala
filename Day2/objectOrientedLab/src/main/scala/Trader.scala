class Trader (var account: Account) {

  def getAccount:Account = {
    return account
  }

  def setAccount(newAccount: Account) = {
        account = newAccount
  }

  def addTrade(trade: Trade) = {
    account.setTotalValueOfTrades((trade.getPrice * trade.getQuantity) + account.getTotalValueOfTrades)
  }

}
