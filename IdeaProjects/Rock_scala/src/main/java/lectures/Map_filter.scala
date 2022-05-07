package lectures

object Map_filter {
  val lst1=List(1,2,3,4,5,6)
  val myMap=Map(1->"a",2->"b",3->"c")
  def main(args:Array[String]): Unit ={
    println(lst1.map(_*2))//will aply to each element of list
   // println(lst1.map(x=>x*2))
    println(lst1.map(x=> "hi"+x))
    println(myMap.map(x=> "hi"+x))
    println(myMap.mapValues(x=> "hi"+x))
    println(myMap.mapValues(x=> x.toUpperCase()))
  }


}
