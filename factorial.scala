object factorial {
  def factorial(x: Int): Int = {
    def go(x: Int, acc: Int): Int =
      if (x <= 0) acc
      else go(x-1, x*acc)
    go(x, 1)

  }

  private def fac(x:Int): String = {
    val msg = "the factorial of %d is %d"
    msg.format(x, factorial(x))
  }

  def main(args: Array[String]): Unit = {
    println(fac(7))
  }
}
