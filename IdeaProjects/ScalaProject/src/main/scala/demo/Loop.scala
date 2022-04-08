package demo

object Loop {
  def main(args: Array[String]): Unit = {
    var count: Int = 0
    for (i <- 1 to 10 by 1) {
      count = count + i
    }
    println("the sum is" + count)
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }
    var list = List(1, 2, 3, 4, 5, 6)
    list.foreach(print)
  }

}
