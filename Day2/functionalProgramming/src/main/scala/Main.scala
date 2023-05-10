object Main {
  def main(args: Array[String]): Unit = {

    //DEFINING FUNCTIONS

    val doubleIt = (n: Int) => n * 2
    println(doubleIt(3))


    //PASSING FUNCTIONS AS PARAMETERS

    val doIt = (n: Int, f : (Int => Int)) =>f(n)
    println(doIt(100, doubleIt))

    val squareIt = (n:Int) => n * n
    println(doIt(100, squareIt))


    //ANONYMOUS FUNCTIONS

    //using function literals = (n:Int) => n * n

    println(doIt(100, (n => n * n)))
    println(doIt(100, (x => x + 1)))
    println(doIt(100, (_ + 1)))


    //RETURNING FUNCTIONS

    val multBy = (n:Int) => ( (x: Int) => x + n)

    val double = multBy(2)
    println(double)
    println(multBy(2))


    //FUNCTION COMPOSITION

    val f = (x:Int) => x + 2
    val g = (x:Int) => x * 3
    println(f(2))
    println(g(2))

    val h = f compose g
    println(h(2))

    val j = g compose f
    println(j(2))

    val  k = f andThen g
    println(k(2))


    //CLOSURES

    var extVal = 100

    def foo(i:Int) = i * extVal

    println(foo(2))

    extVal = 200

    println(foo(2))


    //FUNCTIONS AND METHODS

    //methods can be passed as arguments to functions

    val room = new MyClass("Foobar")
    val student:Int => String = room.aMethod

    println(student(10))









  }
}