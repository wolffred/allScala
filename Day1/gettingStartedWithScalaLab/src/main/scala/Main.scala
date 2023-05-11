import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalQueries.localDate

object Main {

  def main(args: Array[String]) = {

    println(temperatureConverter(34))
    println(times2(3))
    println(getDate("05/05/05"))
    //println(getPassword("pdo"))
    //println(getPassword("Pass:word"))

    println(getPassword("root:\u200Bx:0:0:root:/root:/bin/bash"))

    println(parseUnixPassword("root:\u200Bx:0:0:root:/root:/bin/bash"))

    }

  def times2(i: Int):Int = {
     i * 2
  }

  def temperatureConverter(temp: Double): Double = {
    val newTemp:Double =  ((temp * 9 / 5) + 32)
    newTemp
  }

  //OR
  //def celsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) +  32

  def getDate(newdate: String): String = {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yy")
    val finalDate = LocalDate.parse(newdate, formatter)

    val day = finalDate.getDayOfMonth
    val month = finalDate.getMonth.toString.toLowerCase().capitalize
    val year = finalDate.getYear

    s"$day  $month  $year"
  }

  def getPassword(password: String): Map[String, String] ={
    val split = password.split(":")

    Map(
      "username" -> split(0),
      "password" -> split(1),
      "userId" -> split(2),
      "groupId" -> split(3),
      "description" -> split(4),
      "home directory" -> split(5),
      "shell to use" -> split(6),
    )

  }

  def parseUnixPassword(pwd: String): Unit = {
    val passwdMatcher = raw"(.*):(.*):([0-9]*):([0-9]*):(.*):(.*):(.*)".r
    val passwdMatcher(username, password, userid, groupId, description, homeDirectory, shell) = pwd
    // print out the values if you want
  }


}

