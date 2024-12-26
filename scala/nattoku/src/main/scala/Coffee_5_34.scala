object Coffee_5_34 {

  case class Event(name: String, start: Int, end: Int) 

  def validateName(name: String): Option[String] = {
    if (name.size > 0) Some(name) else None
  }

  def validateEnd(end: Int): Option[Int] = {
    if (end > 0) Some(end) else None
  }

  def validateStart(start: Int): Option[Int] = {
    if (start > 0) Some(start) else None
  }

  def validateLength(start: Int, end: Int, minLength: Int): Option[Int] = {
    if (end - start > minLength) Some(end - start) else None
  }


  def parseLongEvent(name: String, start: Int, end: Int, minLength: Int): Option[Event] = {
    for {
      validName   <- validateName(name)
      validStart  <- validateStart(start)
      validEnd    <- validateEnd(end)
      validLength <- validateLength(start, end, minLength)
    } yield Event(validName, validEnd, validStart)
  }

  def main() = {
    System.out.println("Practice1: " + parseLongEvent("Apollo Program", 1961, 1972, 10))
    System.out.println("Practice2: " + parseLongEvent("World War 2", 1939, 1945, 10))
    System.out.println("Practice3: " + parseLongEvent("", 1939, 1945, 10))
    System.out.println("Practice4: " + parseLongEvent("Apollo Program", 1972, 1961, 10))
  }
}
