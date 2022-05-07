package demo

class Bank {
  def getInterset():Int ={
    0
  }

}
class SBI extends Bank {
  override def getInterset(): Int ={
    8
  }
}
class ICICI extends Bank {
  override def getInterset(): Int ={
    9
  }
}
object Mainobj{
  def main(args: Array[String]): Unit = {
    var b=new Bank()
    var s=new SBI()
    var c=new ICICI()
    println("bank interst: "+ b.getInterset());
    println("sbi bank interst: "+ s.getInterset());
    println("icici bank interst: "+ c.getInterset());
  }
}
