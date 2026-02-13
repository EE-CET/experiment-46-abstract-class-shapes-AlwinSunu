abstract class Shape {
    // TODO: Abstract method numberOfSides()
   abstract int numberOfSides();
}
class Rectangle extends Shape{
int numberOfSides(){
    System.out.println("4");
    }
}
class Triangle extends Shape{
int numberOfSides(){
    System.out.println("3");
    }
}
class Hexagon extends Shape{
int numberOfSides(){
    System.out.println("6");
    }
}
// TODO: Create class Rectangle extends Shape
// Implement numberOfSides() to print "Rectangle has 4 sides"

// TODO: Create class Triangle extends Shape
// Implement numberOfSides() to print "Triangle has 3 sides"

// TODO: Create class Hexagon extends Shape
// Implement numberOfSides() to print "Hexagon has 6 sides"

public class AbstractShapes {
    public void main(String args[]){

        Rectangle a=new Ractangle;
        Triangle b=new Triangle;
        Hexagon c=new Hexagon;

        a.numberOfSides();
        b.numberOfSides();
        c.numberOfSides();
    }
        // TODO: Create objects for Rectangle, Triangle, and Hexagon
        // TODO: Call numberOfSides() for each object in the order: Rectangle, Triangle, Hexagon
    
}
