object Practice_3_19 {

  def firstTwo(list: List[String]): List[String] = {
    list.slice(0,2)
  }

  def lastTwo(list: List[String]): List[String] = {
    list.takeRight(2)
    // 解答を見る限り以下でも良かったらしい. そりゃそうだ.
    // list.slice(list.size - 2, list.size);
  }

  def movedFirstTwoToTheEnd(list: List[String]): List[String] = {
     list.slice(2, list.size).concat(firstTwo(list))

     // 解答  私のアクロバティックより読みやすいな.
     // val firstTwo = list.slice(0,2)
     // val withoutFirstTwo = list.slice(2, list.size)
     // withoutFirstTwo.appendedAll(firstTwo)
  }

  def insertedBeforeLast(list: List[String],element: String): List[String] = {
     list.slice(0, list.size - 1).appended(element).concat(list.takeRight(1))

     // 解答 凄いぞ、足されているのが論理的に分かりやすい！！ ワンライナー縛りしているな…
     // val last = list.slice(list.size - 1, list.size);
     // val withoutLat = list.slice(0, list.size - 1);
     // withoutLast.appended(element).appendedAll(last)
  }

  def main() = {
    System.out.println(firstTwo(List("a", "b", "c")) == List("a", "b"))
    System.out.println(lastTwo(List("a", "b", "c")) == List("b", "c"))
    System.out.println(movedFirstTwoToTheEnd(List("a", "b", "c")) == List("c", "a", "b"))
    System.out.println(insertedBeforeLast(List("a", "b"), "c") == List("a", "c", "b"))
  }
}
