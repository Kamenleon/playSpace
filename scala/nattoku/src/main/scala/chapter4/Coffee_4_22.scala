object Coffee_4_22 {

  def score(word: String):Int = word.replaceAll("a", "").length

  def bonus(word: String): Int = if(word.contains("c"))  5 else 0

  def penalty(word: String): Int = if(word.contains("s")) 7 else 0

  def solid(word: String): Int = 1

  def rankedWords(wordScore: String => Int, words: List[String]): List[String] = {
    words.sortBy(wordScore).reverse;
  }

  def wordScores(wordScore: String => Int, words: List[String]): List[Int] = {
    words.map(wordScore)
  }

  def main() = {
    val wordSet = List("ada", "haskell", "scala", "java", "rust")
    System.out.println("only Score                 : " + rankedWords(w => score(w), wordSet)) // ここは無名関数ではない方が分かりやすいのかなぁ？
    System.out.println("Score and Bonus            : " + rankedWords(w => score(w) + bonus(w), wordSet))
    System.out.println("Score and Bonus and Penalty: " + rankedWords(w => score(w) + bonus(w) - penalty(w), wordSet))

    System.out.println("Score ~ penalty by map     : " + wordScores(w => score(w) + bonus(w) - penalty(w), wordSet))
    System.out.println("Score lock                 : " + wordScores(solid, wordSet))
  }
}
