package exercises

class prac1 {
  def pattern(): Unit = {
    for (i <- 0 to 5) {
      for (j <- 1 to i ) {
        print("*")

      }
      println()
    }
  }
}

object fibObj{
    def main(args: Array[String]): Unit = {
      var obj1=new prac1()
      obj1.pattern()

    }

  }


