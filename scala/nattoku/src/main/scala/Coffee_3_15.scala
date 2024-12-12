object Coffee_3_15 {

  def abbreviate (fullName: String): String = {
    val separatedName = fullName.split(" ");
    separatedName(0).substring(0,1).concat(". ").concat(separatedName(1));
  }

  def abbreviate_example(name: String): String = {
    val initial = name.substring(0, 1);
    val separator = name.indexOf(' ');
    val lastName = name.substring(separator + 1)
    initial + ". " + lastName
  }

  // 無理に行数を減らそうとしすぎてしまった気がするな
  // 下の方が読みやすい。
}
