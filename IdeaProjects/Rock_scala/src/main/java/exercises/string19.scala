package exercises

object string19 {

  def str1(s1:String,s2:String):String={

   // var temp=s1.concat(s2);
    //var sl=s1.length-1;
    if(s1.charAt(s1.length()-1)==s2.charAt(0)){
      return s1+s2.substring(1);}
    return s1+s2;
  }

  def main(args: Array[String]): Unit = {
    println(str1("food","door"))
  }

}
