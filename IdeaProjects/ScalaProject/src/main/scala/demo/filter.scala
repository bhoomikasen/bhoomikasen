package demo

object filter {
  def f(delim: Int, arr: List[Int]): List[Int] = {
    var l1:List[Int]=Nil
    println()
    println("filtered items less then delimiter:")

    for (i <- 0 to (arr.length-1)) {
      if (arr(i) < delim) {
        l1= List(arr(i))

        l1.foreach(println)
      }
    }
    l1

  }
  def main(args: Array[String]): Unit = {
    val line=List(0,10,3,5,2,9,45,8,33)
    val d:Int=10
    println("delimiter:" +d)
    println("list elements:")
    line.foreach(println)

    f(d,line)


  }

}
