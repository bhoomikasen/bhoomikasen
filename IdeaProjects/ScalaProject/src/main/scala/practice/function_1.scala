package practice

object function_1 {

  def main(args: Array[String]): Unit = {
    println(fun_1(100))
    println(fun_1(101))
    println(fun_2(List(1,9,3,5,5)))
    println(fun_3(List(7,7,2,3,4)))

  }

  def fun_1(a: Int): Boolean = {
    return a % 2 == 0


  }

  def fun_2(list1: List[Int]): Boolean = {
    for(i<-list1) {
      if (i % 2 == 0) {
        return true
      }
    }


    return false
  }

  def fun_3(list2:List[Int]):Int={
    var sum=0

    for(i<-list2){
      sum=sum+i
      if(i==7){
        sum=sum+i
      }
    }
    return sum
  }
}