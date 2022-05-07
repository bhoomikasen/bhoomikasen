package demo

object DisString {
  def main(args: Array[String]): Unit = {
    println("enter any string")
    val n:String = scala.io.StdIn.readLine()
    var m = Map[Char, Int]().withDefault(_ => 0)
    var result= ""
    n.foreach({i =>
      if (m(i) == 0) {
        result += i
        m = m.updated(i, 1)
      }
    })
    println(result)
  }


}
