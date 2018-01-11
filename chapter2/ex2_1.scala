def fib(n: Int): Int = {
  def go(n: Int, res: Int, temp: Int): Int = {
    if (n == 0) res
    else go(n-1, temp, res+temp)
  }
  go(n, 0, 1)
}
