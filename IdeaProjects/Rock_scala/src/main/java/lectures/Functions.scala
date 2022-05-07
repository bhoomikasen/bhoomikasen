package lectures


import java.util.Date
//High order functions in scala:which takes functions as argument and returns functions

object Functions {

  def math(x:Double,y:Double,f:(Double,Double)=>Double):Double=
    {f(x,y)}
  def math1(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double= {
  {f(f(x,y),z)}
  }

  //LOG FUNCTION IN SCALA
  def log(date:Date,message:String)={
    println(date+" "+message)
  }

  def main(args: Array[String]): Unit = {

    //partially applied function
    val sum=(a:Int,b:Int,c:Int)=>a+b+c
    val f1=sum(20,_:Int,_:Int)
    println(f1(30,20))

    val result=math(20,50,(x,y)=>x min y)
    val result2=math1(20,50,10,(x,y)=>x + y)
    val result3=math1(20,50,10,_+_)//calling func using wildcards
    val result4=math1(20,50,10,_ max _)//calling func using wildcards
    println(result)
    println(result2)
    println(result3)
    println(result4)

    val date=new Date;
    val newlog = log(date,_:String)
    newlog("the message 1")
    newlog("the message 2")
    newlog("the message 3")
    newlog("the message 4")
  }


}
