package lectures

case class StudentCase(name:String, age:Int)
  object Main{
    def main(args:Array[String]): Unit ={
      var s1=StudentCase("Aryan",23)
      println(s1.name+" age: "+s1.age)

      //copied object
      var s2=s1.copy()
      var s3=s1.copy(age = 24)
      println(s2.name+" age: "+s2.age)
      println(s3.name+" age: "+s3.age)
    }
  }


