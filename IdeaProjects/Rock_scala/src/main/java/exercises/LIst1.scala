package exercises

import scala.::

object LIst1{
  def main(args: Array[String]): Unit = {

    //var f1 =(str1:Int,str2:Int)=>str1+str2;
    var ar = List(1, 2, 3, 4, 5);
    var a2 = List('a', 'b', 'c');
    var l = List(0);
    for (i <- 0 to ar.length - 1) {
      for (j <- 0 to 2) {
        l = l :+ ar(i);
        println(ar(i))
      }
    }
    println(l.isEmpty)
    for (i <- 0 to a2.length) {
       if(i%2==0){
         println("\n"+ar(i))
       }
      //println(a2.flatMap(n=>ar(i)))}

    }

  }}
