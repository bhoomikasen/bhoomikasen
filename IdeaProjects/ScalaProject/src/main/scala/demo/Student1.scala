package demo

import javax.naming.spi.DirStateFactory.Result
import javax.swing.JTable.PrintMode

class example {
  var scores = new Array[Int](6)
  var scores1 = new Array[Int](6)
  var sum1:Int=0
  println("enter the number of students in your class:")
  var n=scala.io.StdIn.readInt()

  def input(): Unit = {
    println("enter your marks:")
    for(i<- 1 to scores1.length-1){
      println("enter " + i +" subject marks: ")
      scores1(i)=scala.io.StdIn.readInt()

    }

   for(i<-1 to n){
     println()
     println("enter "+i+" student's marks")
     println()
     for(i<- 1 to scores.length-1){
       println("enter " + i +" subject marks: ")
       scores(i)=scala.io.StdIn.readInt()

     }
     calculate()
   }
    println("No of students scored more than you: "+ sum1)
  }


  def calculate(){
    var result1=scores1.sum
    var result=scores.sum
    println("Total marks: "+result)
    if (result1 > result) {
      println()
    }
    else if (result > result1) {
      sum1 = sum1 + 1
    }

    println("your Total marks: "+result1)
  }

}
  object m{
    def main(args: Array[String]): Unit = {
      var c=new example()
      c.input()

    }
  }

