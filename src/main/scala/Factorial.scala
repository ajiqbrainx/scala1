import scala.annotation.tailrec

object Factorial extends App {
  @tailrec
  final def factorial(no:Int, acc:BigInt): BigInt={
    if (no <= 1)acc
    else factorial(no -1,acc * no)
  }
  println(factorial(5,1))

}
