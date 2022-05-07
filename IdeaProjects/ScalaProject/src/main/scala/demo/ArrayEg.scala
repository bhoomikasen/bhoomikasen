package demo

class ArrayEg {

  def show(): Unit ={
    println("enter the size of array:")
    var s:Int=scala.io.StdIn.readInt()
    var arr=new Array[Int](s)
    for(a<-0 to (s-1)){
      println("enter "+ a +" element :")
      var num = scala.io.StdIn.readInt()
      arr(a) = num



    }
    for(a<-arr){
      println(a)
    }
    println(arr)
  }
}
object arrobj{
  def main(args: Array[String]): Unit = {
    var o=new ArrayEg()
    o.show()
  }
}
