import java.util.Date

class NewPerson (first: String, last: String, val age: Int){

  val name = s"$first $last"

//  def isOlder(newAge: Int) = {
//    age >= newAge
//  }
//
  def isOlder(newAge: Int):Boolean = {
    return age >= newAge
  }

  def proc(args: String* ):String = {
    return args.toString().toUpperCase()
  }

  override def toString = s"$first $last is $age years old"

  val today = new Date().toString
  lazy val rightNow = new Date().toString
  def now = new Date().toString

}
