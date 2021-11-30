import scala.annotation.tailrec
import scala.io.StdIn

object Palindrome extends App {
  println("Enter your String")

  @tailrec
  def palindromo(s: String): String = {
    if (s.length <= 1 )
      "palindrome"
    else

      if(s.charAt(0) == s.charAt(s.length - 1))
        palindromo(s.substring(1,s.length -1 ))
      else
        "not palindrome"
  }

  var s:String =StdIn.readLine()
  println(palindromo(s))

}
