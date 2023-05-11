object Main {

  def main(args: Array[String]) = {

    val noVal:Option[String] = None
    println(noVal)

    val aVal :Option[String] = Some("Yah")
    println(aVal)

    val nestedOption:Option[Option[Int]] = Some(Some(4))
    println(nestedOption)

    println(aVal.get)
    //println(noVal.get)
    println(noVal.getOrElse("Nothing here"))

    val capitals = Map("UK" -> "London",
                        "Ghana" -> "Accra"
    )

    println(capitals.get("UK"))
    println(capitals.get("France"))

    val capital = (c:String) => capitals.get(c) match {
      case Some(s) => s
      case None => "Unknown"
    }

    println(capitals("UK"))

    println(aVal)

    aVal foreach(println(_))
    noVal foreach(println(_))

    println(aVal map (_.toUpperCase()))
    println(noVal map (_.toUpperCase()))


    //FLATTEN AND FLAT MAP

    val l1 = List(Some("London"), None, Some("Washington "))
    println(l1)
    println(l1.flatten)

    val countries = List("UK", "France")
    println(countries)
    println(countries flatMap(c => capitals.get(c)))


    //FOR COMPREHENSIONS
//    val newCountries = List("UK", "France")
//    for(c < -newCountries;
//    cap <- capitals.get(c))
//    yield(c, cap)


  }
}