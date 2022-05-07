package lectures

object reduce {
  val lst =List(1,2,3,4,5);
  val lst1 =List("hello","hii","bye");

  def main(args: Array[String]): Unit = {
    println(lst.reduceLeft(_+_));
    println(lst.reduceLeft((x,y)=>{println(x+" , "+y);x+y}));
    println(lst1.reduceLeft(_+_));
    println(lst.foldRight(3)(_+_));
    println(lst.scanLeft(3)(_+_));
  }

}
