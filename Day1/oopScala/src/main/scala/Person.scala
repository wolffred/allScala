class Person(first:String, last:String, age:Int, year:Int = 2023){

  //println(s"Making object for $first and $last")

  def this(f: String, l: String) = {
    this(f, l, 21);
    println("Age defaulting to 21")
  }

}
