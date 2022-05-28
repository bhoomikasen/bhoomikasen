package LogicQues

import scala.collection.mutable.ListBuffer

class List4 {

  def ListEg(l1:ListBuffer[Int]): Unit ={
    l1+=1//add elements
    l1+=2
    l1+=3
    l1-=8//remove elements
    val listEg=l1.toList
    for(i<-0 to listEg.length-1){
      println(listEg(i))
    }
  }
}
object ListEgObj extends App{
  val obj1=new List4
  obj1.ListEg(ListBuffer(9,8,90,99,888))
}
