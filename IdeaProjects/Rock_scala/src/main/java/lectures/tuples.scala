package lectures
//tuples have elements if diffrent types,r immutable
object tuples {
  val mytuple=(1,2,3,"hello,true");
  val mytupl2=new Tuple2(1,"hello");
  val tupl3=new Tuple3(1,"hello",(2,3));

  def main(args: Array[String]): Unit = {
    println(mytuple._2);
    println(mytupl2._1);
    mytuple.productIterator.foreach({
      i=>println(i);
    })
    println(tupl3._3._2);
    println(tupl3._3);



  }
}
