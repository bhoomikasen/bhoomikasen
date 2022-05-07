package lectures

object closures {
  /*
  A closure is a function which
  uses one or more variable declared outside this function.
   */
  /*
  impure closure-when var variable is used which can be changed
  pure closure-when val variable is used which can not be changed
   */
  var number =10;
  val add=(x:Int)=>{
    number=x+number;
    number;
  };

  def main(args: Array[String]): Unit = {
    number=100;
    println(closures add 10);
    println(number);
  }


}
