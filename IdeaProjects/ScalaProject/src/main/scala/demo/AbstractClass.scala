package demo

abstract class AbstractClass {
  def run()


}
class Hero extends AbstractClass{
  def run(): Unit ={
    println("running in abs class...")
  }
  def runHero(): Unit ={
    println("Running fine...")
  }
}
object Mainobj1{
  def main(args: Array[String]): Unit = {
    var a=new Hero()
    a.run()
    a.runHero()

    }

}
