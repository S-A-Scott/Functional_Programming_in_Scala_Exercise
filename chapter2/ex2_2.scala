object MyModule {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean =
      if (n >= as.length-1) true
      else if (!ordered(as(n+1), as(n))) false
      else loop(n+1)
    loop(0)
  }

  def compare(n1: Int, n2: Int): Boolean = 
    if (n1 >= n2) true
    else false

  def main(args: Array[String]): Unit = {
    var studentID = Array(1, 2, 3, 4, 3)
    println(isSorted(studentID, compare))
  }
}
