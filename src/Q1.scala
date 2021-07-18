import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q1 extends App {
  println("Enter a number")
  val n = readInt()

  @tailrec
  def isPrime(n:Int, i:Int = 2):Boolean = {
    n match {
      case x if x <= 1 => false
      case x if x == i => true
      case x if x%i==0 => false
      case _ => isPrime(n,i+1)
    }
  }
  println(isPrime(n,2))
}