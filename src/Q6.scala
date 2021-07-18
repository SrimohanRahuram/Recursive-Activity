import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q6 extends App {
  println("Enter a number")
  val n = readInt()

  @tailrec
  def printFibonacci(n:Int, x:Int = 0, y:Int = 1):Unit = {
    println(x)
    if (n==1)()
    else printFibonacci(n-1 , y , x+y)
  }
  printFibonacci(n)
}