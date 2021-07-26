package inheritance

abstract class Polygon {
def area:Double

}

object Polygon{
  def main(args: Array[String]): Unit = {
    //var poly = new Polygon;
    //println(poly.area)
    var  rect =new Rectangle(55.2,30.0);
    println(rect.area)

    var  tri =new Triangle(55.2,30.0,0);
    var tri1=new Triangle(2,3,5);
    var tri2=new Triangle(2,3)

    printArea(tri)
    println(tri1.perimeter);
    println(tri2.area2)
    //println(poly);

  }
  def printArea(p:Polygon): Unit ={
    println(p.area);
  }
}
