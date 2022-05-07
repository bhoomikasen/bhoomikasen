package demo


object Collection {
  def main(args:Array[String]): Unit ={
    var a1 = Set("bhoomi", "seema", "ravi", "teena")
    var a2=Set("A","bhoomi","c","ravi")
    var setintersect=a1.intersect(a2)
    var setunion=a1.union(a2)
    a1 +="rajeev"
    println("values are"+"=" +a1)
    println(a1.head)
    println(a1.tail)
    println(a1.isEmpty)
    for (a1<-a1){
      println(a1)
    }
    println(setintersect)
    println(setunion)

  }
}
