package exercises

object String3 {

  println("enter string 1:");
  var str1 =scala.io.StdIn.readLine();
  println("enter string 2:");
  var str2=scala.io.StdIn.readLine();

  def main(args: Array[String]): Unit = {


    if (str1.length >str2.length) {
      println(str1 + " is greater than " + str2);}
    else if (str1.length < str2.length) {
        println(str2 + " is greater than " + str1);

      }
    else if(str1.length==str2.length & str1==str2) {
      println("both are equal");
    }
    else{println("!!!!!!!!!!!")}
    //println(str2.concat(str1));
  }

}
