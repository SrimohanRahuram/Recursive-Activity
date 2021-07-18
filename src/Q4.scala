import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q4 extends App {
  println("Enter a number")
  val n = readInt()

  @tailrec
  def checkEven(n:Int): Boolean ={

    if (n == 0)true
    else if (n==1)false
    else checkEven(n%2)
  }

  if (checkEven(n) == true)println("Even number")
  else println("Odd number")
}