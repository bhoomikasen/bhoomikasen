package LogicQues

class ArrayTriplets {

  def Triplet(a1:Array[Int]): Unit ={
    var s=0
    for(i<-0 to a1.length-1){
      for(j<-0
        to a1.length-1){
        s=s+a1(j)
        if(s==a1(i)){
          println("triplets are :" + a1(i),a1(j),s)
        }
      }
    }

  }

}
object tripletsObj{
  def main(args:Array[String]): Unit ={
    val o1=new ArrayTriplets
    o1.Triplet(Array(1,2,3))
  }
}
