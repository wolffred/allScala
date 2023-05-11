object Main {
  def main(args: Array[String]) = {

    //FIRST CLASS
    val add = (a:Int, b: Int) => a + b
    val inc = add(_: Int, 1)


    //PURE FUNCTIONS

    val square = (x: Int) => x * x

    //myList.map(x => x * x )

//    for each(v.begin(), v.end(),
//      [] (int val) {cout << val;}
//    );


    //LAMDAS
    val factor = 3
    val multiplier = (i: Int) => i * factor

    val z = multiplier(4)
    println(z)


    //RECURSION

    def length(lst: List[Int], l: Int): Int = {
      if (lst.isEmpty) l
      else length(lst.tail, l + 1)
    }


    //DECLARATIVE STYLE

    val avg = (l: List[Int]) => l.sum/l.size
    val minAvgRating = 6
//    val result = photos.filter


    //LAZY EVALUATION

    //func(3*4)

  }
}