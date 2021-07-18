import scala.annotation.tailrec
import scala.io.StdIn.readInt

object Q2 extends App {
  @tailrec
  def isPrime(n:Int, i:Int = 2):Boolean = {
    n match {
      case x if x <= 1 => false
      case x if x == i => true
      case x if x%i==0 => false
      case _ => isPrime(n,i+1)
    }
  }

  println("Enter A number")
  val n = readInt()
  def printPrimeNumbers(n:Int):Unit = {
    if(n<=1){
      ()
    }
    else{
      printPrimeNumbers(n-1);
    }
    if (isPrime(n)){
      println(n)
    }
  }
  printPrimeNumbers(n)
}