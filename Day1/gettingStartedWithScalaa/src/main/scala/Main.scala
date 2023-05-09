object Main {

  def main(args: Array[String]) = {

    //VALUES

//    val myVal = 10
//    println(myVal)

//    myVal += 20
//
//    val newVal:Int = "Hello"

//    val lastVal = {val a = 5; a + 25}
//    println(lastVal)


    //VARIABLES

    var myVar = 10
    println(myVar)

    myVar += 20
    println(myVar)

    val myVal = 20
    println(myVar + myVal)


    // METHODS/FUNCTIONS

    println(double(3))

    println(upper("word"))

    println(sayHello())
    sayHello()
    //sayHi()
    println(sayHi())


    // NAMES

    //**, ? can be used as method and variable names
    // . cannot be used


    //STRINGS

    val str1 = "1\t2\t3"
    println(str1)

    val str2 =
      """1\t2\t3
        | 3
        |""".stripMargin

    println(str2)

    val a = 1
    val b = 2
    val c = 3

    val str3 = s"$a + $b = ${a + b}"
    println(str3)


    //REGULAR EXPRESSIONS

    val order = "Glass of beer"

    println(order.matches(".* beer"))
    println(order.matches(".* wine"))

    val order2 = "Glass of beer, I do not like beer"
    println(order2.replaceAll("Beer", "coke"))
    println(order2.replaceAll("[bB]eer", "coke"))

    println(order2.replaceFirst("[bB]eer", "coke"))

    //ADD SOMETHING


    //IF
    println(abs(-3))

    val x = 12

    if(x % 2 == 0) println("Even") else println("odd")


    //MATCH

    val month = 5

    month match {
      case 1 => println("January")
      case 2 => println("February")
      case 3 => println("March")
      case _ => println("Oops")
    }

    println(season(3))
    println(state(5))


    //WHILE

    var j = 1

    while(j <= 5){
      println(j)
      j+=1
    }


    //FOR LOOP

    for(a <- 1 to 5)println(a)

    1 to 5 foreach(println(_))





  }

  def double(i: Int): Int = {
    return i * 2
  }

//  def upper( words : String*): Seq[String] = {
//    return String.map(_.toUpperCase())
//  }

  def upper(word:String) = {
    word.toUpperCase()
  }

  def sayHello() = println("Hello everyone")
  def sayHi():String = return "Hi everyone"





  def abs(i:Int) = {
    if( i >= 0) i else -i
  }



  def season(m:Int) = {
    m match {
      case 1 | 2 | 3 => "Winter"
      case 4 | 5 | 6 => "Summer"
      case _ => "Nothing"
    }
  }

  def state(t: Int) = {
    t match {
      case i if(i < 0 ) => "ICE"
      case i if(i > 0 ) => "WATER"
    }
  }
}
