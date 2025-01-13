object Practice_4_50 {
  
  // 分からなかった1番、問題の正答
  def largerThan(n: Int)(i : Int): Boolean = {
    i > n
  }

  // 2番 元の
  def oddNum(number: Int): Boolean = {
    number % 2 == 1
  }

  // 2番 new
  def devideBy(n: Int)(i: Int):Boolean = {
    i % n == 0
  }

  // 3番 before
  def len(word: String): Int = {
    word.length
  }

  // 3番 new
  def underLengthWords(n: Int)(word: String): Boolean = {
    word.length < n
  }

  // 4番 before
  def numberOfS(word: String): Int = {
    word.size - word.replaceAll("s", "").size
  }

  // 4番 new
  def countOfS(n: Int)(word: String): Boolean = {
    word.size - word.replaceAll("s", "").size >= n
  }

  // 4番 正答
  def containsS(moreThan: Int)(s: String): Boolean = {
    numberOfS(s) >= moreThan
  }

  def main() = {  
    System.out.println("Practice1_before: " + List(5, 1, 2, 4 ,0).filter(largerThan(4)))
    System.out.println("Practice1_after : " + List(5, 1, 2, 4, 0).filter(largerThan(1))) 
    System.out.println("Practice2_before: " + List(5, 1, 2, 4, 15).filter(devideBy(5)))
    System.out.println("Practice2_after : " + List(5, 1, 2, 4, 15).filter(devideBy(2)))
    System.out.println("Practice3_before: " + List("scala", "ada").filter(underLengthWords(4)))
    System.out.println("Practice3_after : " + List("scala", "ada").filter(underLengthWords(7)))
    System.out.println("Practice4_before: " + List("rust", "ada").filter(countOfS(3)))
    System.out.println("Practice4_after : " + List("rust", "ada").filter(countOfS(1)))
    System.out.println("Practice4_correct:" + List("rust", "ada").filter(containsS(1)))
  }
}
