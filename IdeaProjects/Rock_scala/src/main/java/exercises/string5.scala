package exercises

object string5 {
  def check1(s1:String,s2:String):Boolean={
    var result=s1.contains(s2);
    result

  }

  def main(args: Array[String]): Unit = {
    println(check1("hello hiiiii hey","hey"))
  }

}
