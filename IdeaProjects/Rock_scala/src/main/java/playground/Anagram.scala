package playground

object Anagram {

  def AnagramString(): Unit = {
    var String1:String=scala.io.StdIn.readLine("Enter String 1")
    var String2:String=scala.io.StdIn.readLine("enter String 2")
    var sum = 0
    for (i <- 0 to String1.length - 1) {
      if (String2.contains(String1(i))) {
        sum = sum + 1
      }
    }
    if (String1.length == sum) {
       println("String s are Anangram")
    }
    else{
      println("Not Anagram")
    }
  }

  def main(args:Array[String]): Unit ={
    AnagramString()
  }


  }
