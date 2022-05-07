package lectures

object Demo {

  def fun1(x:Int=3,y:Int=3):Int=x+y;
  def square(a:Int):Int=a*a;
  def -(x:Int,y:Int):Int=x-y;//operators can be used as functions

  def main(args: Array[String]): Unit = {
    println(fun1())
    println(Demo square 3);//syntactic sugars
    println(Demo -(2,2))
    var add=(x:Int,y:Int)=>x+y;//anonymous function in scala
    println(add(4,4))
  }

}
