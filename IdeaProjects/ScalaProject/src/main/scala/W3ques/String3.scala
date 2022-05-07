package main.scala.W3ques

class String3 {
/*  35. Write a Scala program to repeat a specific number of characters
  for specific number of times from the last part of a given string. Go to the editor*/
  def RepeatString(str1:String,str2:String): Unit ={
    for(i<-0 to str1.length-1)
        {
          print(str1(i))
        }
    println()
    for(i<-0 to str2.length-1){
      print(str2)
    }
  }
}
object mainString3 extends App {
  val obj1=new String3
  obj1.RepeatString(str1 = scala.io.StdIn.readLine("Enter you Complete String : "),str2 = scala.io.StdIn.readLine("Enter the String you want to repeate : "))

}
