import java.util.Date

object Main {

  def main(args: Array[String]) = {

    //PRIMITIVE TYPES
    println(123)
    println(123.toString)
    println(123 + 456)
    //println(123.<TAB>)
    //123.<TAB>

    //DEFINING A NEW CLASS
    val c = new Myclass
    println(c)
    println(c.toString)
    //println(javap MyClass)

    val john = new Person("John", "Yaw", 32)
    println(john)

    val kwame = new NewPerson("Kwame", "Yaw", 23)
    val kwamee = new NewPerson("Kwame", "Yaw")
    println(kwame.name)


    //METHODS
    println(kwame.isOlder(56))
    println(kwame.proc("word"))


    //OVERRIDING METHODS
    println(kwame)

    //VAL VS DEF
    //def only exectued once its called


    //LAZY VAL
    //lazy val evaluated only when needed
    println(kwame.today)
    println(kwame.now)
    println(new Date().toString)
    Thread.sleep(10000)
    println(kwame.rightNow)
    Thread.sleep(10000)
    println(kwame.rightNow)

    val comp = new Complex(12,34)
    val oldComp = new Complex(12,34)
    val newComp : Complex = comp.+(oldComp)
    //val newComp : Complex = comp + oldComp
    println(newComp)


    //SINGLETON
    //singleton used to create static or singleton like in java
    MySingleton.sayHello

  }

}
