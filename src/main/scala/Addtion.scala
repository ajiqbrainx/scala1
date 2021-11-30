import scala.annotation.tailrec

object Addtion extends App {
  def addtion(first: Int,last:Int): Int = {

    @tailrec
    def sum(first: Int, last: Int, sum1:Int): Int = {
      if(first>last)sum1
      else sum(first+1,last,sum1+first)
    }
    sum(first,last,0)
  }
  println(addtion(5,14))

}
