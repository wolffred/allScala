object Main {

  def main(args: Array[String]) = {

    println(len("boy", "bot", "dog", "fed", "cat"))

    val newLen = (str1: String, str2: String) => str1.length + str2.length
    println(newLen("tom", "mot"))

    val takeArg = (num: Int) => newLen(num.toString, num.toString)
    println(takeArg(5))


  }

  def len(str1: String, str2: String, str3: String, str4: String, str5: String): Int ={
    return str1.length + str2.length + str3.length + str4.length + str5.length
  }

}
