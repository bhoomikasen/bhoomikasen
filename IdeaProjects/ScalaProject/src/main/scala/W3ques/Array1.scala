package main.scala.W3ques

import scala.util.control.Exception.noCatch.desc

class Array1{
/*11. Write a Scala program to create
a new array taking the middle element from three arrays of length 5*/

    def test(x: Array[Int], y: Array[Int], z: Array[Int]): Array[Int] = {
      if (x.length != 5 || y.length != 5 || z.length != 5)
        throw new IllegalArgumentException("Array length not matched!")
      else Array(x(2), y(2), z(2))//updating array and adding 2nd value from all the arrays
    }
/*
  Write a Scala program to find the common elements between two arrays of strings.
*/
  def common(a1:Array[String],a2:Array[String]): Unit ={
    for(i <- 0 to a1.length-1){
      for (j<-0 to a2.length-1){
        if(a1(i)==a2(j)){
          println("\n"+"common elements from both the Arrays are : "+a1(i),a2(j))
        }
      }
    }
  }
  }

object objArray1 extends App{
  val o1=new Array1
    var result1 = o1.test(Array(1,2,3,4,5),Array(2,3,4,5,6),Array(3,4,5,6,7))
    // Print all the array elements
    println("New array:")
    for ( x <- result1 ) {
      print(s"${x}, ")
    }
  o1.common(Array("hey","hi","hello"),Array("hey","hh","hello"))
}
