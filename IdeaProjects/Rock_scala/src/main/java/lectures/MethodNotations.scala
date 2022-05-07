package lectures

object MethodNotations extends App {

  class Person(val name:String,favMovie:String){
    def likes(movie:String):Boolean=movie==favMovie
    def +(person:Person):String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary =new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")//equivalent infix notation

  //operators in scala
  val tom =new Person("tom","Joker")
  println(mary.+(tom))


}
