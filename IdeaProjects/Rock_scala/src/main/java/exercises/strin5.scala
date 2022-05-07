package exercises

object strin5 {
  def strpat(str1:String,str2:String):Boolean={
    var temp=str1.contains(str2)
    temp
  }
  def strcount(str3:String):Unit={

    for(i <-0 to str3.length-1){
      var count=0
      var t=str3(i)
      for(j <-0 to str3.length-1){
        if(str3(j)==str3(i)){
           count=count+1
        }
      }
      println(str3(i)+" appeared "+ count+" times " )
    }
    var t1=str3.reverse
    println(t1)

  }

  def main(args: Array[String]): Unit = {
    println(strpat("hello how are you","are"))
    strcount("hello")
  }

}
