object Practice_4_28 {

  def len(word: String): Int = {
    word.length
  }

  def numberOfS(word: String): Int = {
    word.size - word.replaceAll("s", "").size
  }

  def darkSide(number: Int): Int = {
    -number
  }

  def twoTimes(number: Int): Int = {
    number * 2
  }

  def main() = {
    System.out.println("Practice1: " + List("scala", "rust", "ada").map(len))
    System.out.println("Practice2: " + List("rust", "ada").map(numberOfS))
    System.out.println("Practice3: " + List(5, 1, 2, 4, 0).map(darkSide))
    System.out.println("Pracitce4: " + List(5, 1, 2, 4, 0).map(twoTimes))
  }
}
