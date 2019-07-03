object fibonacci {
  def fib(n: Int): Int = {

    def go(n: Int, acc: Int, bcc: Int): Int = {
      if (n == 3) acc + bcc
      else go(n-1, bcc, acc+bcc)
    }

  go(n, 0, 1)

  }

  def print(n: Int):String = {
    val msg = "fibonacci number of %d is %d"
    msg.format(n, fib(n))
  }

  def main(args: Array[String]): Unit = {
    println(print(8))
  }
}
