package exercises

object CaseClass extends App {

  case class Person(name:String,age:Int)

    //class parameters are fields

    val p1=new Person("Jim",22)
    //1.class parameters are fields
    println("name is "+p1.name)

    //2.sensible toString
   //print instance=print(instance.toString)
    println(p1)
    println(p1.toString)

   //3.equals to hashcode implmented ootb
   val p2=new Person("Jim",22)
   println(p1==p2)
   //ccs have handy copy method
   val p3=p1.copy(age = 45)
   println(p3)

   //we dont use new keyword for cclass
   val p4=Person("Mary",23)
   println(p4)







}
