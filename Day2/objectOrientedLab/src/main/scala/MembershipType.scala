abstract class MembershipType {



}
object MembershipType{
  def assignMembership(points: Int):MembershipType = {

    if(points < 10){
      return new Bronze
    }
    else if (points >= 10){
      return new Silver
    }else{
      return new Silver
    }

  }

   def canTrade() = {}
}