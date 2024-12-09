class Coffee_1 {
  public static int calculateScore(String word) {
    int score = 0;
    for(char c: word.toCharArray()) {
      if(c == 'a') continue;
      score++;
    }
    return score;
  }
  
  public static int wordScore(String word) {
    return word.replace("a","").length();
  }

  public static void main(String[] args) {
    System.out.println("calculateScore('imperative') == " + calculateScore("imperative") + " is 9");
    System.out.println("calculateScore('no') == " + calculateScore("no") + " is 2");
    System.out.println("wordScore('decalrative') == " + wordScore("decalrative") + " is 9");
    System.out.println("wordScore('yes') == " + wordScore("yes") + " is 3");
  }
}
