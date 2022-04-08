package demo

object Function1 {
  def main(args: Array[String]): Unit = {
    functioneg(10,multiplyBy2)

  }
  def functioneg(a:Int,b:Int=>AnyVal)= {


    println(b(a))

  }
  def multiplyBy2(a:Int):Int={
  a*2
  }


}
