package LogicQues

class String6 {

  def ifPresent(s1:String): Unit ={
    val s2="if"
    if(s1.contains(s2)){
      println("IF already present "+s1)
    }
    else{
      println("if"+s1)
    }
  }

/*25. Write a Scala program to convert the last 4 characters of a given string in upper case.
If the length of the string has less than 4 then uppercase all the characters.
 */
  def LastFourToUppercase(s2:String): String ={
    if(s2.length>4){
      s2.take(s2.length-4)+ s2.drop(s2.length-4).toUpperCase()
  }
    else{
    s2.toUpperCase()}
  }

}
object String6Obj{
  def main(args:Array[String]): Unit ={
    val o1=new String6
    o1.ifPresent("hello")
    println(o1.LastFourToUppercase("python"))
    println(o1.LastFourToUppercase("item"))
  }
}
