package inheritance

abstract class Polygon {
def area:Double

}

object Polygon{
  def main(args: Array[String]): Unit = {
    var poly = new Polygon;
    println(poly.area)
    var  rect =new Rectangle(55.2,30.0);
    println(rect.area)
    var  tri =new Triangle(55.2,30.0);
    printArea(tri)
    //println(poly);

  }
  def printArea(p:Polygon): Unit ={
    println(p.area);
  }
}
