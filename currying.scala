package scala
object currying {

 /*
  1.인수가 두 개인 함수 f를 인수 하나로 받고 그것으로 f를 부분 적용하는
  함수로 변환하는 커링(currying)이 컴파일되는 구현은 단 한가지이다.
  그러한 구현을 작성하라.
  */
  def curry[A, B, C](f: (A, B) => C): A => B => C = {
    a: A => (b: B) => f(a:A, b:B)
  }

  /*
  2. curry의 변환을 역으로 수행하는 고차 함수 uncurry를 구현하라. =>는 오른쪽으로 묶이므로,
  A=>(B=>C)를 A=>B=>C라고 표기할 수 있음을 주의할 것
   */
  def uncurry[A, B, C](f: A=>B=>C):(A,B) => C ={
    (a:A, b:B) => f(a:A)apply(b:B)
  }
  /*
  3. 두 함수를 합성하는 고차함수를 구현하라.
  */
  def compose[A, B, C](f: B=>C, g: A=>B): A=>C={
    a:A => f(g(a:A))
  }
}
