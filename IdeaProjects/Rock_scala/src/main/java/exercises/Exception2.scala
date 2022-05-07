package exercises

class Exception2 {
  def age(a:Int): Unit ={
    if(a<18) {
      throw new ArithmeticException("you are not eligible")
    }
    else{println("eligible")}

  }

}

object exc1{
  def main(args: Array[String]): Unit = {
    val a1=new Exception2()
    a1.age(17)
  }
}
