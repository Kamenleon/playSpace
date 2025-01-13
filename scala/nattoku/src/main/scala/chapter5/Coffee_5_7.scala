object Coffee_5_7 {

  case class Book(title: String, authors: List[String])

  def recommendedBooks(friend: String): List[Book] = {
    val scala = List(
      Book("FP in Scala", List("Chiusano", "Bjarnason")),
      Book("Get Programming Wigh Scala", List("Sfregola")))

    val fiction = List(
      Book("Harry Potter", List("Rowling")),
      Book("The Lord of the Rings", List("Tolkien"))
      )

    if(friend == "Alice") scala
    else if (friend == "Bob") fiction
    else List.empty
  }

  def main() = {
    val friends = List("Alice", "Bob", "Charlie")
    val recommendations = friends.flatMap(recommendedBooks(_))

    System.out.println("Books: " +recommendations)

    val authors = friends.flatMap(recommendedBooks(_)).flatMap(_.authors)

    System.out.println("Authors: " + authors)
  }
}
