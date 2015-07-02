//Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.

def fibCreate(valueBelow: Int) = {
  def build(list: List[Int]): List[Int] =
    list.last match {
      case x if x < valueBelow => build(list :+ list.takeRight(2).sum)
      case _ => list
    }
  build(List(1, 2, 3))
}

val fibEven = fibCreate(4000000).filter(_ % 2 == 0)
val result = fibEven.sum

//def fibCreate(valueBelow: Int) = {
//    var list = List(1, 2, 3)
//    while (list.last<valueBelow) {
//      val l = list.takeRight(2).sum
//      list = list :+ l
//    }
//  list
// }
//
//val result = fibCreate(4000000).filter(_ % 2 == 0).sum
//
