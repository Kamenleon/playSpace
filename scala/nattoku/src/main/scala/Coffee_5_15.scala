object Coffee_5_15 {
  
  case class Point(x: Int, y: Int)

  case class Point3d(x: Int, y: Int, z: Int)

  def main() = {

    val xs = List(1)
    val ys = List(-2, 7)

    System.out.println(
      for {
        x <- xs
        y <- ys
      } yield Point(x, y)
    )

    val xs3d = List(1)
    val ys3d = List(-2, 7)
    val zs3d = List(3, 4)
  
    System.out.println(
      for {
        x <- xs3d
        y <- ys3d
        z <- zs3d
      } yield Point3d(x, y, z)
    )
    

    System.out.println(
      xs3d.flatMap(x => 
        ys3d.flatMap(y => 
            zs3d.map(z => 
                Point3d(x, y, z)
                )
              )
            )
    )
  }
}
