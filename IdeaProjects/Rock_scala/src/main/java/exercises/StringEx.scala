package exercises

class StringEx(s1:String,s2:String) {

  def stringfun(){
    val StringConcat=s1.concat(s2)

    if(StringConcat.contains(s2)){
      println("Strings are reverse of each other")
    }
    else{
      println("not reverse")
    }

  }

}

object obj1 {
  def main(args: Array[String]) {
    val ob1 = new StringEx("Bhoomi",scala.io.StdIn.readLine("Enter 2nd string"))
    ob1.stringfun()

  }
}
