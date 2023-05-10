import jdk.incubator.foreign.Addressable

object Main {

  def main(args: Array[String]) = {

   println(sumUntil(5))
   println(factorial(5))
    println(sumbtnTwoNumber(2, 4))
    println(sumbtnTwoNumbers(2, 4))

    val tuple = (1,2)

    val matchTuple = tuple match{
      case (1, x) => s"A tuple with 1 and $x"
      case (x, 2) => s"A tuple with $x and 2"
    }

    println(matchTuple)

    val nestedTuple = (1, (2,3))

    val matchNestedTuple = nestedTuple match {
      case (x, (2, y)) => s"A nested tuple with values $x, 2 and $y"
      case (1, (2, y)) => s"A tuple with $y and 2"
    }

    println(matchNestedTuple)

//    val elizabeth = Person(
//      "Elizabeth",
//      java.time.LocalDate.of()
//      Address
//    )
//
//    val personWithNameElizabeth = elizabeth match {
//      case Person("Elizabeth",_,_) => "Found"
//    }
//
//    val byPostCode = elizabeth match{
//      case Person(name, _, Address(_,_,_"SW1AA")) => s"$name has address with postcode SWIAA"
//    }

    val list = List(1,2,3,4)

    val matchingList = list match{
      case List(1, , , ) => ""
      case List(1, _*) => " "
      case 1 :: tail => s"Any list starting with 1 but with access to everything else, j.e. $tail"
      case List(1, *) :+4 => "List ends with 4"
      case head :: tail => s"Any list split into first element $head and the rest $tail"
    }

    val unknownType:Any = 23

    val matchedType = unknownType match {
      case anInt: Int => s"I matched with an Int so lets double it: ${anInt * 2}"
      case aString: String =>"Matched a string"
      case _: Double => "It's a double"
    }

    val myNumber: Int = 23

    val myNumberMatched = myNumber match {
      case x if x < 23 => s"My number is less than 23"
      case x if x == 23 => "My number is equal to 23"
      case _=> s"My number is bigger than 23"
    }

  }

  //RECURSION

  def newSumUntil (n : Int):Int = {
    if (n <= 0)0
    else n + sumUntil(n-1)
  }

  def sumUntilTailRec(n:Int):Int = {
    def sumUntilAcc(n:Int, acc:Int): Int ={
      if (n <= 0) acc
      else  sumUntilAcc(n-1, acc+n)
    }
    sumUntilAcc(n, 0)
  }

  def sumbtnTwoNumber( smaller:Int, bigger:Int):Int= {
//    if(smaller > bigger) {
//      val temp = small
//    }

    def loop(n:Int):Int = {
      if(n < smaller) 0
      else n + loop(n-1)
    }
    loop(bigger)

  }

  def fib(number:Int):Int = {
    //0, 1, 1, 2, 3, 5, 8, 13, 21
    if(number < 2) number
    number + (fib(number-1) + fib(number - 2))
  }





















  def sumbtnTwoNumbers(smaller: Int, bigger: Int): Int = {

        if(bigger <= smaller) 0
        else bigger + sumbtnTwoNumber(smaller, bigger - 1)

  }

  def sumUntil(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUntil(n - 1)
  }

  def factorial(n : Int ): Int = {
    if(n <= 1)1
    else n*factorial(n - 1)
  }

  //REECURSION

  def sumUntil2(n:Int):Int = {

    def loop(n:Int, acc:Int):Int = {

      if (n <= 0) acc
      else loop(n-1, acc + n)
    }
    loop(n, 0)
  }
}