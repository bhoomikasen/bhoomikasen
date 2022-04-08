package main.scala.practice

class ExceptionExample4 {
@throws(classOf[NumberFormatException])// It provides information to the caller function that this method may throw this exception. It helps to caller function to handle and enclose that code in try-catch block to avoid abnormal termination of program.
  def validate(): Unit ={
    "abc".toInt
  }

}
object throwsMain{
  def main(args:Array[String]): Unit ={
    try {
      val obj1=new ExceptionExample4
      obj1.validate()
    }
    catch {
      case ex:NumberFormatException=>println("Exception handled here")
    }
    println("Rest of code is running fine...........")
  }
}
