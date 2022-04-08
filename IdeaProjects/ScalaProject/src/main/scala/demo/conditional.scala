package demo

object conditional {
  def main(args: Array[String]): Unit = {
    println("Enter your marks:")
    var marks:Int=scala.io.StdIn.readInt()
    if(marks>=60){
      println("Pass with first divisiov")
    }
    else if(marks<=60 && marks>=50){
      println("Pass with Second division")
    }
    else if(marks<=50 && marks>=40){
      println("Pass with Third division")
    }
    else if(marks<=40 && marks>=30){
      println("Pass with Fourth division")
    }
    else{
      println("Fail")
    }
  }

}
