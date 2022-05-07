package exercises

object array7 {

  def demo(inp:Int)={

    var arr1 =Array("a","b","c","d");
    arr1(inp)="null";
    for (i<-  arr1){

      print(s"${i}, ");

    }
  }
  def main(args: Array[String]): Unit = {
    demo(1);
  }


}
