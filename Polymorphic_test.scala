package scala
/*
Array[A]가 주어진 비교함수에 의거해서 정렬되어 있는지 점검하는
isSorted 함수를 구현하라.
 */
object Polymorphic_test {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean):Boolean={
    def loop(n: Int): Boolean={
      if(n >= as.length - 1) true
      else if(ordered(as(n), as(n+1))) loop(n+1)
      else false
    }
    loop(0)
  }

  def main(args: Array[String])={
    val arr = Array(1, 2, 3, 9)
    println(isSorted[Int](arr, (a,b)=>if(a<b) true else false))
  }
}
