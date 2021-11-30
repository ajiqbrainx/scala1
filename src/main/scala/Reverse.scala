
import scala.annotation.tailrec
import scala.io.StdIn

object Reverse extends App{

  def as(reverse:String):String={
    @tailrec
    def va(reverse:String, len:Int, out:String):String={

      if(len<0)out
      else va(reverse,len-1,out+reverse.charAt(len))
    }
    va(reverse,reverse.length-1,out="")

  }
  val k = StdIn.readLine()
println(as(k))
}
