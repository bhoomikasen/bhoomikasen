package main.scala.W3ques

class String1
{
/*  Write a Scala program to create a new string from a given string swapping the last two characters of the given string. The length of the given string must be two or more. Go to the editor
  Sample Output:*/
def swapStrings(s1:String): String ={
   if(s1.length<2){
     return s1
   }
  else{
  val s2=s1.substring(0,s1.length-2)
  return s2+s1.charAt(s1.length-1)+s1.charAt(s1.length-2)
   }
}}


object mainObj1{
  def main(args:Array[String]): Unit ={
    val obj1=new String1
    println(obj1.swapStrings("abcd"))

  }
}
