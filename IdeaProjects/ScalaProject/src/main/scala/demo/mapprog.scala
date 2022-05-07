package demo

object mapprog{
  def main(args: Array[String]): Unit = {
    var map=Map(("A","Apple"),("B","Bat"))
    println("map is"+ map)
    var newmap=map+("C"->"Cat")
    println((newmap))
    println(map.size)
  }
}


