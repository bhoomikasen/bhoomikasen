package exercises

object string30 {
  def test(str1: String, str2: String): Boolean = {
    var temp = str1.contains(str2);
    //println(temp)
    temp
  }
  def main(args: Array[String]): Unit = {
    println(test("bhoomika","bhoomi"));
  }


}

