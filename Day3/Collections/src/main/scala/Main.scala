import java.util
import scala.collection.LinearSeq

object Main {
  def main(args: Array[String]): Unit = {

    //TUPLE
    val myTup = (1,3)
    println(myTup)

    val tup2 = ("John", "Doe", 21)
    println(tup2)

    val tup3 = "John" -> 21
    println(tup3)
    println(tup3._1)
    println(tup3._2)
    //println(tup3._3)


    //VECTOR

    val vec1 = Vector(1,2,3,4, "Tom")
    println(vec1)


    //SEQUENCE

    val seq1 = Seq(1, 2, 3, 4, "Tom", "Mot")
    println(seq1)


    //ARRAY

    val arr = Array(1,2,3, "Tom")
    val arra = Array(1,2,3)
    println(arr)

    arr(1) = "Mot"
    println(arr)

    val seq2: Seq[Int] = arra
    println(seq2)

    seq2.toArray
    println(seq2.toArray)

    val newArr = Array(1,2,3,4,5)
    println(newArr)


    //SEQUENCE

    val s  = Seq(1,2,3,4,5)

    println(s.length)
    println(s.indices)
    println(s(0))
    println(s.reverse)
    println(s.contains(4))
    println(s:+6)
    println(0+:s)
    println(s++ Seq(7,8,9))
    println(s.count(_>2))

    println(List("Steve", "John").sortWith(_.compareTo(_) < 0))
    println(List("Steve", "John").sortWith(_.compareTo(_) < 0).reverse)


    //LINEAR SEQUENCE

    val ls = LinearSeq(1,2,3,4,5)
    println(ls)
    println(ls.head)
    println(ls.tail)

    val is = IndexedSeq(1, 2, 3, 4, 5)
    println(is)
    println(is.head)
    println(is.tail)


    //MUTABLE SEQUENCES

//    var newList = scala.collection.mutable.LinkedList(1,2,3)
//    newList(1) = 22
//    println(newList)

    
  }
}