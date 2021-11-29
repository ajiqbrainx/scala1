import scala.io.StdIn

object OddEven extends App{
  def oddeven (): Unit ={
    println("Enter the number")
    val a=StdIn.readLine().toInt
    if (a%2==0)println("It is even")
    else println("It is Odd")
  }
  println(oddeven)
}