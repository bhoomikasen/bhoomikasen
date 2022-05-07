package lectures
//set is acollection of elements of same DT
object sets {
  val myset:Set[Int]=Set(1,2,3,4,5,4);//immutable set
  var myset2=scala.collection.mutable.Set(1,2,3,4,5,7);

  def main(args: Array[String]): Unit = {
    println(myset);
    println(myset2);
    println(myset2 + 90);
    println(myset2)
    println(myset ++ myset2)//unique values of both ses
    println(myset.&(myset2
    ))
  }


}
