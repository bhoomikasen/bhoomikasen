package LinkedIN

class ArrayEg1 {

  def find1n2Largest(a1:Array[Int]){
    var a2=a1.sorted
    println("first largest number is "+ a2(a2.length-1) +" second largest number is " + a2(a2.length-2))


}}

object ArrayEg1Obj{
  def main(args:Array[String]){
    val obj1=new ArrayEg1
    obj1.find1n2Largest(Array(6,2,1,4,3,100,89,55,77,33))

}
}
