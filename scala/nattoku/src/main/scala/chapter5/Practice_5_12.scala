object Practice_5_12 {
  
  case class Point(x: Int, y: Int)

  def main() = {
    List(1).flatMap(x => 
        List(-2, 7).map(y => 
            Point(x, y)
            )
          ) 
  }
}
