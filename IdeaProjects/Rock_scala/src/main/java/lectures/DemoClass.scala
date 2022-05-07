package lectures

import org.graalvm.compiler.debug.DebugOptions.PrintGraphTarget
//in var:getter setter
//val getter -------

//auxiliary constructor are the alternative constructor for class

class User(private var name:String,var age :Int){
  def printName{println(name)}
  def this(){
    this("tom",23)
  }//auxiliary constructor
  def this(name:String){
    this(name,32)
  }
}
object DemoClass {
  def main(args: Array[String]): Unit = {
    var user =new User("Max",22);
    user.printName;
    println(user.age);
    var user1=new User()//object for constructor1
    var user2=new User("max")//object for constructor2
    user1.printName
    user2.printName

  }

}
