import jdk.incubator.foreign.Addressable

import scala.annotation.tailrec

object Main {

  def main(args: Array[String]) = {

    println(sumUntilTailRec(5))

    //PATTERN MATCHING

    //matching on constants

    val someValue:Any = "Scala"
    val constants = someValue match {
      case 42 => "Meaning of life"
      case "Scala" => "Scala is nice"
      case _ => "Some default"
    }

    println(constants)


    //matching on tuples

    val tuple = (1, 2)
    val matchTuple = tuple match {
      case (1, x) => s"A tuple with 1 and $x"
      case (x, 2) => s"A tuple with $x and 2"
    }

    println(matchTuple)

    //matching on nested tuple

    val nestedTuple = (1, (2, 3))
    val matchNestedTuple = nestedTuple match {
      case (x, (2, y)) => s"A nested tuple with values $x, 2 and $y"
      case (1, (2, y)) => s"A tuple with $y and 2"
    }

    println(matchNestedTuple)

    //matching on case classes

    val elizabeth = Person(
      "Elizabeth",
      java.time.LocalDate.of(1926, 4, 26),
      "Buckingham Palace"
    )

    val personWithNameElizabeth = elizabeth match {
      case Person("Elizabeth", _, _) => "Found"
    }

    val byAddress = elizabeth match {
      case Person(name, _, "Buckingham Palace") => s"$name has address Buckingham Palace"
    }

    println(personWithNameElizabeth)
    println(byAddress)

    //matching on lists

    val list = List(1, 2, 3, 4)

    val matchingList = list match {
      case List(1, _, _, _) => "List with 4 elements"
      case List(1, _*) => " list starting with 1"
      case 1 :: tail => s"Any list starting with 1 but with access to everything else, j.e. $tail"
      case List(1, _*) :+ 4 => "List ends with 4"
      case head :: tail => s"Any list split into first element $head and the rest $tail"
    }

    println(matchingList)

    //matching on data types

    val unknownType: Any = 23

    val matchedType = unknownType match {
      case anInt: Int => s"I matched with an Int so lets double it: ${anInt * 2}"
      case aString: String => "Matched a string"
      case _: Double => "It's a double"
    }

    println(matchedType)

    //Guards
    val myNumber: Int = 23

    val myNumberMatched = myNumber match {
      case x if x < 23 => s"My number is less than 23"
      case x if x == 23 => "My number is equal to 23"
      case _ => s"My number is bigger than 23"
    }

    println(myNumberMatched)

    //You can use a | to match on multiple criteria, e.g. “a” | “b” will match both the
    //string “a” or the string “b”

    //binding a var name to pattern(Type)

    val lisst = List(1, 2, 3, 4, 5, 6)
    val x = lisst match {
      case lisst@List(1, _*) => lisst
      case _ => 2
    }

    println(x)

    //be careful

    val listt: List[Int] = List(1, 2, 3, 4)
    listt match {
      case myList: List[String] => "I'm a list of strings"
      case myList: List[Int] => "I'm a list of ints"
    }
//    ● Pattern matching runs at runtime using reflection
//      ● Type erasure of generic types on the JVM
//    , i.e.List[String] is considered List
//    , List[Int] is
//      considered List


  }

  //uses in scala

//  catch statements
//  , use pattern matching
//  for the
//  catch statements
//  ●
//  for comprehensions(coming later) use pattern matching in generators
//    ● Used in partial functions
//  ● Improved syntax:
  val aTuple = (1, 2, 3)
  val (a, b, c) = aTuple
  val tuples = List((1, 2), (3, 4))
  val head :: tail = tuples



  //RECURSION

  //NOT STACK SAFE
  def sumUntil(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUntil(n - 1)
  }

  //STACK SAFE
  def sumUntilTailRec(n: Int): Int = {
    @tailrec
    def sumUntilAcc(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else sumUntilAcc(n - 1, acc + n)
    }
    sumUntilAcc(n, 0)
  }

}