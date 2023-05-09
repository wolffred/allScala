class Client(firstName: String, lastName: String, var membershipType: MembershipType, points:Int) {

  def setMembershipType = {
    membershipType = MembershipType.assignMembership(points)
  }

  def addPoints = {
    points +=1
    setMembershipType
  }



}
