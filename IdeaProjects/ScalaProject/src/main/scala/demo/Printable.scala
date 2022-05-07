package demo

trait Printable {
  def print()

}
trait Showable {
  def show()

}
 class A6 extends Printable with Showable{
   def print: Unit ={
     println("this is printable")
   }
   def show: Unit ={
     println("this is showable")
   }
 }
object Mainobj4{
  def main(args: Array[String]): Unit = {
    var a=new A6()
    a.print()
    a.show()
  }
}