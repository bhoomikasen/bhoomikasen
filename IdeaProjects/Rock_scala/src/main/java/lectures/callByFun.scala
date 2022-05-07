package lectures

object callByFun {
  def main(args: Array[String]): Unit = {
    def callByValue(x:Long):Unit={
      println("by the value:"+x)
      println("by the value"+x)
    }

    def callByName(x: => Long):Unit={
      println("by the name:"+x)
      println("by the name"+x)

    }
    callByValue(System.nanoTime())
    callByName(System.nanoTime())
  }

}
