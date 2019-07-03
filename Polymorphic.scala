package scala

object Polymorphic {
  // 단형적 함수
  def monomorphic(ss: Array[String], key: String): Int = {
    def loop(n: Int): Int = {
      if(n > ss.length) -1
      else if (ss(n) == key) n
      else loop(n+1)
    }
    loop(0)
  }

  // 다형적 함수
  def polymorphic[A](as: Array[A], p: A=> Boolean): Int = {
    def loop(n: Int): Int = {
      if (n> as.length) -1
      else if (p(as(n))) n
      else loop(n+1)
    }
    loop(0)
  }

  def main(args: Array[String])={
    val arr = Array("a","b","c","d")
    println(monomorphic(arr, "c"))
    println(polymorphic(arr, (x: String) => x=="c"))
  }
}
