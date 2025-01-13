object Practice_4_33 {
  
  def len(word: String): Int = {
    word.length
  }

  def countOfS(word: String): Int = {
    word.size - word.replaceAll("s", "").size
  }

  def oddNum(number: Int): Boolean = {
    number % 2 == 1
  }

  def main() = {
    System.out.println("Practice1: " + List("scala", "rust", "ada").filter(w => len(w) < 5))
    System.out.println("Practice2: " + List("rust", "ada").filter(w => countOfS(w) >= 3))
    System.out.println("Practice3: " + List(5, 1, 2, 4, 0).filter(oddNum))
    System.out.println("Practice4: " + List(5, 1, 2, 4 ,0).filter(_ > 4))
  }
}
