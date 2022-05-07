package exercises

object String27 {

  def StringPrac(s1:String):Boolean=
    {
      val len=s1.length
   /* for(i<-0 to s1.length)
      val a1=s1()
    }*/
      val a1:String="ng"
      if(a1.equals(s1.substring(len-2,len))){
        true
      }
      else{
        false
      }
  }
  def main(args:Array[String]): Unit ={
    println(StringPrac("String"))
  }


}
