package demo

class class1(id:Int,name:String) {
  def show(): Unit ={
    println(id+" "+name)
  }


}
object Mainobject{
  def main(args: Array[String]): Unit = {
    var s=new class1(100,"bhoomi")
    s.show()
  }
}
