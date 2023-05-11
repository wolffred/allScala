import java.util.Date
import scala.annotation.tailrec

object Main {


  //RECURSION

  def main(args: Array[String]) = {

    println(factorial(5))
    println(gcd(5, 8))
    //println(newFactorial(5))
    println(newNewFactorial(5))
    println(newNewNewFactorial(5))
    println(showTime(new Date()))
    println(showTimeByName(new Date()))
    println(mult(2,3))
    println(curryMult(2)(3))
    println(curryMult(2)_)
    println(newCurryMult(4))
    println(pf.isDefinedAt(2))
    println(pf isDefinedAt(3))
    println(pf isDefinedAt(4))
    println(pf(2))
    println(SquareRoot isDefinedAt(4))
    println(SquareRoot (4))
    println(squares isDefinedAt(3))
    println(squares(6))
    println(moreSquares(9))




  }

  def factorial(n: Int): BigInt = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  def gcd(a: Int, b: Int): Int = {
    if (b==0) a
    else gcd(b, a % b)
  }

//  @tailrec
//  def newFactorial(n: Int):BigInt = {
//    if(n == 0) 1
//    else n * newFactorial(n - 1)
//  }

  //tailrec
  def newNewFactorial(n: Int, holder: BigInt = 1): BigInt = {
    if (n == 0) holder
    else newNewFactorial(n - 1, n * holder)
  }

  def newNewNewFactorial(n: Int): BigInt = {
    @tailrec
    def fact(n: Int, holder: BigInt): BigInt = {
      if (n == 0) holder
      else fact(n - 1, n * holder)
    }
    fact(n, 1)
  }


  // pass by value vs pass by name

  def showTime(t: java.util.Date) = {
    println(s"The time is $t")
    Thread.sleep(1000)
    println(s"The time is $t")
  }

  def showTimeByName(t: => java.util.Date) = {
    println(s"The time is $t")
    Thread.sleep(1000)
    println(s"The time is $t")
  }

  //CURRYING METHODS

  def mult(a:Int, b:Int) = {
    a * b
  }

  def curryMult(a:Int)(b:Int) = {
    a * b
  }


  //PARTIAL FUNCTION APPLICATION

  def newCurryMult = {
    curryMult(2)_
  }


  //PARTIAL FUNCTION
  //defining a partial function

  val pf: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  object SquareRoot extends PartialFunction[Int, Double] {
    override def isDefinedAt(x: Int): Boolean = (x >= 0)

    override def apply(v1: Int): Double = if ( v1 > 0 ) Math.sqrt(v1) else
      throw new IllegalArgumentException(" ")
  }


  //MAP AS PARTIAL FUNCTION

  val squares : Map[Int, Int] = Map(1 -> 1, 2 -> 4, 3 -> 9, 4 -> 16, 5 -> 25, 6 -> 36)


  // Composing partial functions

  val moreSquares = squares orElse Map( 7 -> 49, 8 -> 64, 9 -> 81)


}
