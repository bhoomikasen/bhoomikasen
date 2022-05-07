package exercises

class ExceptionExample {
  def divide(a: Int, b: Int) = {
    try {
     a / b   // Exception occurred here

    }catch {
      case e:ArithmeticException=>
        println(e)
      case ex:Throwable=>
      println("Unknown Exception found"+ex)

    }
    finally {
      println("finally block always executes")
    }
    println("Rest of the code is executing...")
  }
}


  object Exceptions  {
    def main(args: Array[String]) {
      var e = new ExceptionExample()
      e.divide(100, 0)

    }


  }


