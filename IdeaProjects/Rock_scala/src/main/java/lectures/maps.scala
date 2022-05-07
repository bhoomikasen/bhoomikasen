package lectures
//map are key value pair
object maps {
  val mymap:Map[Int,String]=Map(810->"max",802->"jack",804->"helly");

  def main(args: Array[String]): Unit = {
    println(mymap(802))
    println(mymap)
    println(mymap.keys)
    println(mymap.values)
    mymap.keys.foreach{
      key=> println("key "+ key);
      println("value "+ mymap(key));
        println(mymap.contains((303)));
    }
  }
}
