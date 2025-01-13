object Practice_4_56 {

  def numberOfS(word: String): Int = {
    word.size - word.replaceAll("s", "").size
  }

  def main() = {
    System.out.println("Practice1: " + List(5, 1, 2, 4, 100).foldLeft(0)((total, num) => total + num))
    System.out.println("Practice2: " + List("scala", "rust", "ada").foldLeft(0)((total, word) => total + word.length))
    System.out.println("Practice3: " + List("scala", "rust", "rust", "ada").foldLeft(0)((total, word) => total + numberOfS(word)))
    System.out.println("Praciece4: " + List(5, 1, 2, 4, 15).foldLeft(0)((total, num) => Math.max(total,num)))
  }
}
