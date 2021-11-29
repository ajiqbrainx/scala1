import scala.annotation.tailrec

object Fibonacci extends App
{
  @tailrec
  final def fib(aa:Int, prv:Int, cur:Int, index:Int):Int =
  {
    if(index==aa)  cur
    else fib(aa,cur,prv+cur,index+1)
  }
  println(fib(aa=10,prv = 0, cur = 1,index = 1))
}