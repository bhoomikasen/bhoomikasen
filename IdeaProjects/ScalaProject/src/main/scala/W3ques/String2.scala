package main.scala.W3ques

class String2 {
  /* 33. Write a Scala program to count how many times the substring 'life' present at anywhere in a given string.
    Counting can also happen for the substring 'li?e',any character instead of 'f'*/

   def countStr(s1: String) {
     println("enter the word you want to check the no of occurance for : ")
     val inp = scala.io.StdIn.readLine()
     var count = 0
     //println(s1.length)
     //split string using whitespaces
     var word = s1.split(" ")
     try {
       for (i <- 0 to word.length) {//not putting lenght-1 to handle through exception
         println(word(i))
         if (word(i) == inp) {
           count = count + 1
         }
       }
     }
     catch {
       case ex: Exception => println(ex)
         println(ex.getMessage)}
     finally{
         println("Rest of the ocde is running fine....")
         println("the word \"" + inp + "\" occurs " + count + " times...")     }
     }


}
object mainObj2 {
  def main(args: Array[String]) {
    println("enter more that one word : ")
    val obj1 = new String2
    obj1.countStr(s1 = scala.io.StdIn.readLine())

  }
}

