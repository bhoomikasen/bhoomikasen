package exercises
/*
There are N users registered on a website CuteKittens.com. Each of them have a unique password represented by pass[1],
pass[2], ..., pass[N]. As this a very lovely site, many people want to access those awesomely cute pics of the kittens.
But the adamant admin don't want this site to be available for general public. So only those people with passwords can access it.
Yu being an awesome hacker finds a loophole in their password verification system. A string which is concatenation of one or more passwords,
in any order, is also accepted by the password verification system. Any password can appear 0 or more times in that string.
He has access to each of the N passwords, and also have a string loginAttempt, he has to tell whether this string be accepted by the password verification system of the website.
For example, if there are 3 users with password {"abra", "ka", "dabra"},
then some of the valid combinations are "abra" (pass[1]), "kaabra" (pass[2]+pass[1]),
"kadabraka" (pass[2]+pass[3]+pass[2]), "kadabraabra" (pass[2]+pass[3]+pass[1]) and so on.
 */

object string38  {
  def main(args: Array[String]): Unit = {
  pswdCracker()
  }


  def pswdCracker(): Unit = {

    var ac=Array()
    var ar=Array("bhoomi","bhoomi123","123abcd","123","abc")

    //concatenating all the array elements in forward direction
    val a1=ar.reduce { (accumulator, elem) => accumulator + elem }

    //reversing  array and concatenating in reverse direction
    val a2=ar.reverse
    a2.foreach{ i=>print(i)}
    val a3=a2.reduce { (accumulator, elem) => accumulator + elem }//concatenate


    println("\n"+"enter your password:-")
    val pswd = scala.io.StdIn.readLine()
    println(pswd)
    if(ar.contains(pswd)){
      println("logging in.......")
    }
    else if(a1.contains(pswd)){
      println("logging in.......:)")
    }
    else if(a3.contains(pswd)){
      println("logging in.......:)")
    }

    //else {
     // println("oops wrong password:(")
    //}

      for(i <- 0 to ar.length-1) {
        for (j <- 0 to ar.length - 1) {
          var aaa = ar(i).concat(ar(j))
          if (aaa==pswd) {
            println("heloooooooo")
          }
          else{println()}
         //println(aaa)


        }

    }
    println(ac)











  }
}

/*
testcases:
1. normal one pswd should enter
2.combination of any two--not
3.reverse combi of any two or more

 */


