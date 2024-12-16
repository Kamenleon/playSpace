import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Coffee_4_10 {

  static int score(String word) {
    return word.replaceAll("a", "").length();
  }

  static int scoreWithBonus(String word){
    int base = score(word);
    if (word.contains("c")) return base + 5;
    else return base;
  }
  
  static int scoreWithBonusAndPenalty(String word){
    int base = score(word);
    int bonus = word.contains("c") ? 5 : 0;
    int penalty = word.contains("s") ? 7 : 0;
    return base + bonus - penalty;
  }

  static List<String> rankedWords(
    Function<String, Integer> wordScore, List<String> words){
    Comparator<String> wordComparator = 
      (w1, w2) -> Integer.compare(wordScore.apply(w2), wordScore.apply(w1));

    return words.stream().sorted(wordComparator).collect(Collectors.toList());
  }

  public static void main(String[] args){
    ArrayList<String> words = new ArrayList<String>();
    words.add("ada");
    words.add("haskell");
    words.add("java");
    words.add("rust");
    words.add("scala");
    System.out.println(rankedWords(w -> score(w), words));
    System.out.println(rankedWords(w -> scoreWithBonus(w), words));
    System.out.println(rankedWords(w -> scoreWithBonusAndPenalty(w) , words));
    // 別解
    System.out.println(rankedWords(w -> score(w) + bonus(w) - penalty(w), words));
  }

  // 本の別解
  static int bonus(String word) {
    return word.contains("c") ? 5 : 0;
  }
  
  static int penalty(String word) {
    return word.contains("s") ? 7 : 0;
  }
}
