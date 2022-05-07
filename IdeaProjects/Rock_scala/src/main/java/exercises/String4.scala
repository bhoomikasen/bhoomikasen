package exercises

object String4 {
  def common(a1:Array[String],a2:Array[String]): Unit ={

    println("Common elements of array are: ")
    for(i <- 0 to a1.length-1){
      for(j <- 0 to  a2.length-1) {
        if (a1(i) == a2(j)) {
          print( a1(i)+" ")

        }

      }

    }



  }
  def main(args: Array[String]): Unit ={
    var a1=Array("sql","py","java","R","hive")
    var a2=Array("sql","py","java","hadoop")
    common(a1,a2)

    val a="hey"
    val b="hi"

    val c=a.concat(b)
    println("\n"+c)

  }
}
