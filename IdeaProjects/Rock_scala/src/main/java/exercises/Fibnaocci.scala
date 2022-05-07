package exercises

class Fibnaocci {
  println("enter first number")
  var a = scala.io.StdIn.readInt()
  println("enter second number")
  var b = scala.io.StdIn.readInt()
  println("enter Range:")
  var n=scala.io.StdIn.readInt()

  def fib(): Unit = {
    var c = a + b
    print(a+" ")
    print(b+" ")
    print(c+" ")
    for (i <- 1 to n) {
      a = b;
      b = c;
      c = a + b
      print(c+" ")

    }
  }
}
  object Main{
    def main(args:Array[String]): Unit ={
      var obj1=new Fibnaocci;
      obj1.fib()
    }



}
