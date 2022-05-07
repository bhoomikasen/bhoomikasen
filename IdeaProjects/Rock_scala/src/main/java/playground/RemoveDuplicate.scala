package playground


class RemoveDuplicate{
  //find sum of array &
  // check if a given number is present in first or last position of a given array of length 1 or more

  def SumOfArr(arr:Array[Int]): Unit ={
    println(arr.sum)
    val last=arr.length-1
    println("enter a number whose position you want to see : ")
    var inp1=scala.io.StdIn.readInt()

      if(arr(0)==inp1){
        println("its present in firt position")
      }
      else if(arr(last)==inp1){
        println("its present in the end")
      }
      else println("its present in the middle")
    }

  //remove duplicates from array
  def FindDuplicate(arr1:Array[String]): Unit ={
   //grouping the elements and applying map function which removes duplicates
   var aar=arr1.groupBy(identity).map(t => (t._1)).toArray
    for(i <-0 to aar.length-1){
    println(aar(i))}
    }
  def RemoveElement(arr3:Array[String]): Unit ={
    arr3.patch(1,Array(1),0)
    for (i<-0 to arr3.length-1){
      println(arr3(i))
    }
  }

  def StringOccurance(str1:String,inputChar:String): Unit ={
    var count=0
    for(i<-0 to str1.length-1){
      println(str1(i))
      if(str1(i)==inputChar){
        println(count=count+1)

      }

    }


  }

}

object objForthisClass{
  def main(args:Array[String]): Unit ={
    var obj1=new RemoveDuplicate()
    obj1.FindDuplicate(Array("a","a","c","h","k"))
    obj1.SumOfArr(Array(1,2,3,4,7))
    obj1.RemoveElement(Array("a","b","f","g"))
    obj1.StringOccurance("BBBBHHjj","H")

  }
}
