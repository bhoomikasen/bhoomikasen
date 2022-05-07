package lectures

/*
Currying:is a technique of transforming a function
that takes multiple args into a function
that takes a single arg
 */

object currying {
  def add(x:Int,y:Int)=x+y;
  def add2(x:Int)=(y:Int)=>x+y;


  def main(args: Array[String]): Unit = {
    println(add(20,20));
    println(add2(20)(10))
    val sum=add2(40);
    println(sum(100));
  }

}
