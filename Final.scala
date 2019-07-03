package scala

object Final {
  // 절댓값
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  // 팩토리얼
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }
    go(n, 1)
  }

  // 피보나치
  def fib(n: Int): Int = {
    def go(n: Int, acc: Int, bcc: Int): Int = {
      if (n == 3) acc + bcc
      else go(n-1, bcc, acc+bcc)
    }
    go(n, 0, 1)
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  private def formatFactorial(x: Int): String = {
    val msg = "The factorial of %d is %d"
    msg.format(x, factorial(x))
  }
  private def formatFibonacci(x: Int): String = {
    val msg = "The fibonacci of %d is %d"
    msg.format(x, fib(x))
  }

  // 고차함수(함수인자에 다른함수를 받음)
  def formatResult(name: String, n: Int, f: Int => Int): String ={
    val msg="%s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {

    println(formatAbs(-42))
    println(formatFactorial(7))
    println(formatFibonacci(10))

    // 고차함수 결과
    formatResult("The absolute value", -42, abs)
    formatResult("The factorial", 7, factorial)
    formatResult("The fibonacci", 10, fib)


  }
}
