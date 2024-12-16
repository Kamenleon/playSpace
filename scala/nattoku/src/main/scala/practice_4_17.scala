object practice_4_17 {

  def score(word: String): Int = {
    word.replace("a", "").length();
  }
  
  def length(word: String): Int = {
    word.length
  }

  def decending(i: Int): Int = {
    -i
  }
 
  def rankedWords(word: String): Int = {
    -(word.length - word.replaceAll("s", "").length)
  }


  def main() = {
    val wordList = List("scala", "rust", "ada")
    System.out.println("入力: List(\"scala\", \"rust\", \"ada\")");
    System.out.println("出力: " + wordList.sortBy(length));

    val numList = List(5, 1, 2, 4, 3)
    System.out.println("入力: List(5, 1, 2, 4, 3)");
    System.out.println("出力: " + numList.sortBy(decending))

    val wordList2 = List("ada", "rust")
    System.out.println("入力: List(\"ada\", \"rust\")")
    System.out.println("出力: " + wordList2.sortBy(rankedWords))
  }
}
