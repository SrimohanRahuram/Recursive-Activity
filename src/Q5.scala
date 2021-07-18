import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q5 extends App {

  @tailrec
  def checkEven(n:Int): Boolean ={

    if (n == 0)true
    else if (n==1)false
    else checkEven(n%2)
  }

  println("Enter a number")
  val n = readInt()

  @tailrec
  def addEven(n:Int, sum:Int = 0): Int ={
    if (n == 0) sum
    else if (checkEven(n)) addEven(n-2 , sum + n-2)
    else addEven(n-1 , sum + n-1)
  }
  println(addEven(n))
}