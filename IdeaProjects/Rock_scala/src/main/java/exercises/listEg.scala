package exercises

/*
que:print the sunm of the list but 7 is a lucky number it should be counted twice
 */

object listEg {

  def LuckyNo7(l1:List[Int]): Unit ={
    var sum=0
    for(i<-0 to l1.length-1){
      if(l1(i)==7){
        sum=sum+l1(i)+l1(i)
      }
      else {
        sum = sum + l1(i)
      }
    }
    println(sum)


  }
  def main(args:Array[String]): Unit ={
    LuckyNo7(List(1,2,7))
  }



}
