package lectures

object strings {
  val str1:String="Hello world";
  var marray:Array[Int]=new Array[Int](4);
  var marray1=new Array[Int](5)
  var array2= Array(1,2,3,4,5);
  val mylist:List[Int]=List(1,2,3);//lists are immutable

  def main(args: Array[String]): Unit = {
    marray(0)=10;
    marray(1)=20;
    marray(2)=30;
    marray(3)=40;
    println(str1.length);
    val result =Array.concat(marray,array2);
    for (x<- result){
      println(x);
    }
    for (x<- marray){
      println(x)
    }
    println(mylist);
    println(0::mylist);
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.reverse)
    println(List.fill(5)(2))
    mylist.foreach(println);
    var sum:Int=0;
    mylist.foreach(sum+=_);
    println(sum);
  }

}
