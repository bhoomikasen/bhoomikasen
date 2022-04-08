package demo



class Student(n:Int) {
  var scores = List[Int]()
  var sum1:Int=0
  var sum :Int=0
  var ksum:Int=0

  def input(): Unit = {
    println("enter your marks:")
    println("enter 1 sub marks")
    var k1: Int = scala.io.StdIn.readInt()


    println("enter 2 sub marks")
    var k2: Int = scala.io.StdIn.readInt()


    println("enter 3 sub marks")
    var k3: Int = scala.io.StdIn.readInt()

    println("enter 4 sub marks")
    var k4: Int = scala.io.StdIn.readInt()

    println("enter 4 sub marks")
    var k5: Int = scala.io.StdIn.readInt()
    scores=List(k1,k2,k3,k4,k5)
    var ksum: Int = k1 + k2 + k3 + k4 + k5
    println("your total marks marks" + ksum)

    scores.foreach(println)



    for (i <- 1 to n) {
      println(i +" "+"students marks")
      println("enter first sub marks")
      var s1: Int = scala.io.StdIn.readInt()
      scores :+ s1
      println("enter second sub marks")
      var s2: Int = scala.io.StdIn.readInt()
      scores :+ s2
      println("enter 3 sub marks")
      var s3: Int = scala.io.StdIn.readInt()
      scores :+ s3
      println("enter 4 sub marks")
      var s4: Int = scala.io.StdIn.readInt()
      scores :+ s4
      println("enter 5 sub marks")
      var s5: Int = scala.io.StdIn.readInt()
      scores :+ s5
      var sum:Int=(s1+s2+s3+s4+s5)
      if (ksum > sum) {
        println(0)
      }
      else if (sum > ksum) {
        sum1 = sum1 + 1
      }


      }




    }


    println(sum1)





}
  object Mainob{
    def main(args: Array[String]): Unit = {
      var s=new Student(2)
      s.input()

    }
  }



