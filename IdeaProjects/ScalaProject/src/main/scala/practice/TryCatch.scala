package main.scala.practice

class TryCatch {

  def divide(a: Int, b: Int): Unit = {
   try {
     a / b
     var arr = Array(1, 2)
     arr(10)
   }
    catch {
      case e: ArithmeticException => println(e)
      case ex: Throwable => println("found a unknown exception" + ex)
    }
  }
  println("rest of code is executing...........")
}
object tryObj{
  def main(args:Array[String]){
    val obj1=new TryCatch()
    obj1.divide(100,10)

}
}
