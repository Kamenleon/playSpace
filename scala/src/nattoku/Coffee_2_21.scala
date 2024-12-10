object Coffee_2_21 {

  def increment(x: Int): Int = {
    x + 1;
  }

  increment(4) == 5
  increment(-1) == 0
  increment(0) == 1
  increment(Integer.MAX_VALUE -1) == Integer.MAX_VALUE

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def wordScore(word: String): Int = {
    word.replaceAll("a", "").length
  }

  def getTipPercentageScore(names: List[String]): Int = {
    if(names.size > 5) 20
    else if(names.size > 0) 10
    else 0
  }

  def getFirstCharacter(s: String): Char = {
    if (s.length > 0) s.charAt(0)
    else ' '
  }
}

