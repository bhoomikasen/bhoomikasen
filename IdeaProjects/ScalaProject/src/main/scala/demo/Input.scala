package demo

object Input {
  def main(b:Array[String]): Unit ={
    println("enter first number")
    var p:Int=scala.io.StdIn.readInt()
    println("enter secont number")
    var q:Int=scala.io.StdIn.readInt()
    println("product is"+"="+p*q)
  }

}
