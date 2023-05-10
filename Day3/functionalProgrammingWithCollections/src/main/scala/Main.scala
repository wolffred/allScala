import scala.collection.IterableOnce.iterableOnceExtensionMethods

object Main {

    def main(args: Array[String]) = {

        //BASIC SCALA

        val range1 = 1 until 10

        println(range1)
        range1.foreach(i => print(i + " "))
        println(range1.forall(i => i < 10))
        println(range1.exists(i => i == 20))


        //MAP

        val firstSquares = range1.map(i => i * i)
        println(firstSquares)

        val sList = List("one", "two", "three")
        println(sList)

        val sListUpper = sList.map(_.toUpperCase())
        println(sListUpper)

        val total = range1.foldLeft(0)((tot, curr) => tot + curr)
        println(total)

        val newTotal = range1.sum
        println(newTotal)

        val pathName = sList.foldLeft("")((s1, s2) => s1 + "/" + s2)
        val newPathName = sList.foldRight("")((s1, s2) => s1 + "/" + s2)

        println(pathName)
        println(newPathName)

        val odds = range1.filter(i =>  i % 2 !=0)
        println(odds)

        val longStrings = sList.filter(s => s.length > 3)
        println(longStrings)

        println('a' to 'z'  filter("aeiou" contains(_)))

        val word = "absolutely"
        println(word.seq.filter("aeiou" contains(_)))

        println(range1 partition (_ % 2 == 0))

        val isVowel = (c:Char) => "aeiou" contains c
        println(isVowel)
        println(word.seq partition (isVowel(_)))


        //COMBINING COLLECTIONS

        val scores = Seq(43,54,65,76)
        val students = Seq("Tom", "Tim", "Tam", "Tum")

        println(students.zip(scores))


        //FLATTENING NESTED COLLECCTIONS

        val nestedSeq = Seq ( Seq(1,2,3), Seq(4,5,6))
        println(nestedSeq)
        println(nestedSeq.flatten)

        val nestedSeq2 = Seq(Seq(1, 2), Nil, Seq(3, 4))
        println(nestedSeq2)
        println(nestedSeq2.flatten)

        val names = Seq("John", "Mary")
        println(names.flatten)


        //COMBINING MAPS AND FLATTEN

        val newNames = List("John", "Mary")
        println(newNames.flatten)

        println(names.map(_.toUpperCase()))
        println(names.flatMap(_.toUpperCase()))


        val perms = (chars: Seq[Char]) =>
          chars flatMap(a =>
            chars filter(b => b !=a)
              map (b => (a,b))
        )

        println(perms('k' to 'n'))
        println(perms('1' to '3'))


        // FOR COMPREHENSION

        val squares = for (a <- 1 to 5) yield a * a
        println(squares)

        val newSquares = (1 to 5).map(a => a * a)
        println(newSquares)


        //GUARDED FOR COMPREHENSION

        val oddSq = for (a <- 1 to 10 if (a % 2 != 0)) yield a * a
        println(oddSq)

        val newOddSq = 1 to 10 filter (_ % 2 != 0) map (a => a * a)
        println(newOddSq)


        //NESTED FOR COMPREHENSION

        println(for (a <- 1 to 3;
             b <- 4 to 6)
            yield a * b)

        println(1 to 3 flatMap(i => 4 to 6 map (m => i * m)))


        //SOPHISTICATED FOR COMPREHENSION USAGE

        println(for (a <- 1 to 3 if ( a % 2 == 1);
             b <- 4 to 6 if (b % 2 == 0))
            yield (a, b))

        def plot (a : Range, f : Int => Int) = for  ( x <- a) yield (x, f(x))
//        println(plot)

        println(plot ( 1 until 4, (a) => a * a))

        println(plot ( 1 until 5, (a) => a * 3))

        val newPerms = ( chars: Seq [Char]) => for ( a <- chars;
                                                  b <- chars if ( a != b)
                                                  ) yield (a,b)

        println(newPerms('1' to '3'))





    }
}
