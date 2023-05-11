import java.lang
import java.text.NumberFormat

object Main {

  def main(args: Array[String]) = {

    //NORMAL EXCEPTIONS

    try {
      val i: Int = "123".toInt
      val j: Int = "foobar".toInt
    }catch {
      case e: lang.NumberFormatException => println("mistake")
    }


    //ISSUES ( RETURN TYPE)

    println(try {
      val i: Int = "123".toInt
    } catch {
      case e: lang.NumberFormatException => 0
    }
    )

    println(try {
      val i: Int = "123".toInt
      val j: Int = "foobar".toInt
    } catch {
      case e: lang.NumberFormatException => 0
    }
    )


    //USING OPTION[T]

    val k = try{
      Some("123".toInt)
    } catch{
      case e: NumberFormatException => None
    }

    val l = try {
      Some("xyz".toInt)
    } catch {
      case e: NumberFormatException => None
    }

    val m =List("0", "1", "2")

    println((m.flatMap( s =>
      try{
        Some(s.toInt)
      } catch {
        case e: Exception => None
      }
    )).flatMap( t =>
      try {
        Some(12/t)
      } catch{
        case e2: Exception => None
      }

    ))

    val n =List("0", "1", "2", "cv", "5")

    n: List[String] = List(0, 1, 2, "xx", 4)

    println(for (
      a <- n;
      b <- try {
        (Some(a.toInt))
      } catch {
        case e: Exception => None
      };
      c <- try {
        Some(12 / b)
      } catch {
        case e2: Exception => None
      }
    )
    yield ((a, c)))



  }

}
