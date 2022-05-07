package playground

object prac1 {
  def main(args: Array[String]): Unit = {

      println("Enter any String")
      val inputString: String = scala.io.StdIn.readLine()
      if (inputString.startsWith("if")) {
        println(inputString)
      }

      else if (inputString.startsWith("IF")) {
        println(inputString)
      }
      else if (inputString.startsWith("If")) {
        println(inputString)
      }
      else {
        println("here you go" + " : " + "If" + inputString)

      }




    }


}