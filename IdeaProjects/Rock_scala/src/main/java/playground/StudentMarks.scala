package playground

class StudentMarks(ID:Int,Sname:String,Marks:Int){
  def Marks(): Unit ={
    println(ID+" ,"+Sname+" ,"+Marks)
    if(Marks>=100){
      println("Excellent")
    }
    else if(Marks<=90 && Marks>=60){
      println("Good")
    }
    else{
      println("fail")
    }
  }

}
object Mainobj{
  def main(args: Array[String]): Unit = {
    var s1=new StudentMarks(1,"Ravi",100)
    var s2=new StudentMarks(2,"Rani",65)
    var s3=new StudentMarks(3,"Soni",5)
    s1.Marks()
    s2.Marks()
    s3.Marks()

  }
}
