package demo

class MultiArray {
  var arr1 = Array.ofDim[Int](2,2)
  arr1(0)(0)=1
  arr1(0)(1)=2
  arr1(1)(0)=2
  arr1(1)(1)=4

  def show1(): Unit ={
    for (i<-0 to 1){
      for (j<-0 to 1){
        print(" "+arr1(i)(j))
      }
      print()
    }

  }

  object arrayobj{
    def main(args: Array[String]): Unit = {
      val a=new MultiArray()
      a.show1()
    }
  }

}
