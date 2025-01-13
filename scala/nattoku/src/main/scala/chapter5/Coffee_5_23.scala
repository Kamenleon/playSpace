object Coffee_5_23 {
 
  case class Point(x: Int, y: Int)

  def isInside(point: Point, radius: Int): Boolean = {
    radius * radius >= point.x * point.x + point.y * point.y
  } 

  def positiveRadius(radius: Int): List[Int] = {
    if(radius > 0) List(radius) else List.empty
  }

  def main() = {

    val points = List(Point(5,2), Point(1,1))
    val riskyRadiuses = List(-10, 0, 2)

    for {
      r <- riskyRadiuses
      point <- points.filter(p => isInside(p, r))
    } yield s"$point is wihtin a radius of $r"


    // Pracrtice1 answer with filter
    System.out.println("Practice1 is " +(
    for {
      validRadius <- riskyRadiuses.filter(r => r > 0)
      point <- points.filter(p => isInside(p, validRadius))
    } yield s"$point is within a radius of $validRadius"
    ))

    // Practice2 answer with guard
    System.out.println("Practice2 is " +(
    for {
      r <- riskyRadiuses
      if r > 0
      point <- points.filter(p => isInside(p, r))
    } yield s"$point is within a radius of $r"
    ))

    // Practice3 answer with flatMap
    System.out.println("Practice3 is " +(
    for {
      r      <- riskyRadiuses
      radius <- positiveRadius(r)
      point  <- points.filter(p => isInside(p, radius))
    } yield s"$point is within a radius of $r"
    ))
  }
}
