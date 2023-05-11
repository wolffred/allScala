object Main {

  def main(args: Array[String]) = {


    //1)

    println(len("boy", "bot", "dog", "fed", "cat"))

    val newLen = (str1: String, str2: String) => str1.length + str2.length
    println(newLen("tom", "mot"))


    //2)

    val takeArg = (num: Int) => newLen(num.toString, num.toString)
    println(takeArg(5))


    //4)
    println(addThreeeNumbers(1,2,3))
    println(newAddThreeeNumbers(1)(2)(3))


  }

  //1)
  def len(str1: String, str2: String, str3: String, str4: String, str5: String): Int ={
    return str1.length + str2.length + str3.length + str4.length + str5.length
  }


  //3)
  val a = (str1: String) => str1.toInt

  val b = (num1: Int, func1: (String => Int)) => num1 * func1

  val c = ( str2: String, func2: (Int, (String => Int)) ) => str2.toInt * func2

  val d = (num2: Int) => num2 * num2



  //4)

  val addThreeeNumbers = (x: Int, y: Int, z: Int) => x + y + z

  def newAddThreeeNumbers(x: Int)(y: Int)(z: Int) = {
    x + y + z
  }


  //5)

  def concatenate(str1: String, str2: String, str3: String) = {

  }


}
