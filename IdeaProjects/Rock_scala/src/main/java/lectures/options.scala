package lectures

object options {
  val opt:Option[Int]= Some(5);
  val opt1:Option[Int]= None;
  val lst = List(1,2,3,4,5);
  val mymap = Map(1->"Tom",2->"Max",3->"bob");


  def main(args: Array[String]): Unit = {
    println(opt1.isEmpty);
    println(opt.get);
    println(lst.map(_*2));
    println(lst.map(x=>x/0.2));
    println(lst.map(x=>"hi"*x));
    println(mymap.map(x=>"hi"+x))
    println(mymap.mapValues(x=>"hi"+x));
    println("hello".map(_.toUpper));
    println(List(List(1,2,3),List(4,5,6)).flatten);//combines the list
    println(lst.flatten(x=> List(x,x+1)));
    println(lst.flatMap(x=> List(x,x+1)));//flatmap acta as shorthand of map
    println(lst.filter(x=>x%2==0));
  }

}
