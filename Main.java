public class Main {
    public static void main(String[] args) {
        //Shape
        Shape shape = new Shape("Red", "Rough");
        System.out.println("The color of the shape: " + shape.getColor());
        System.out.println("The texture of the shape: " + shape.getTexture () + "\n");
        //Circle
        Circle circle = new Circle("Black", "Rough", 5.0);
        System.out.println("The area of the circle: " + circle.getArea());
        System.out.println("The color of the circle: " + circle.getColor());
        System.out.println("The texture of the circle: " + circle.getTexture ()+ "\n");
        //Cylinder
        Cylinder cylinder = new Cylinder("Blue", "Shiny", 5.0, 5.0);
        System.out.println("The volume of the cylinder: " + cylinder.getVolume());
        System.out.println("The color of the cylinder: " + cylinder.getColor());
        System.out.println("The texture of the cylinder: " + cylinder.getTexture ()+ "\n");
        //Rectangle
        Rectangle rectangle = new Rectangle("White", "Matte", 5.0, 5.0);
        System.out.println("The area of the rectangle: " + rectangle.getArea());
        System.out.println("The color of the rectangle: " + rectangle.getColor());
        System.out.println("The texture of the rectangle: " + rectangle.getTexture ()+ "\n");
        //Box
        Box box = new Box("Silver", "Glossy", 5.0, 5.0, 5.0);
        System.out.println("The volume of the box: " + box.getVolume());
        System.out.println("The color of the box: " + box.getColor());
        System.out.println("The texture of the box: " + box.getTexture ()+ "\n");
        //Triangle
        Triangle triangle = new Triangle("Obsidian Black", "Polished", 5.0, 5.0);
        System.out.println("The area of the triangle: " + triangle.getArea());
        System.out.println("The color of the triangle: " + triangle.getColor());
        System.out.println("The texture of the triangle: " + triangle.getTexture ()+ "\n");
        //Pyramid
        Pyramid pyramid = new Pyramid("Purple", "Wavy", 5.0, 5.0, 5.0);
        System.out.println("The volume of the pyramid: " + pyramid.getVolume());
        System.out.println("The color of the pyramid: " + pyramid.getColor());
        System.out.println("The texture of the pyramid : " + pyramid.getTexture ()+ "\n");
        //Square
        Square square = new Square("Passion Orange", "Striped", 5.0);
        System.out.println("The area of the square: " + square.getArea());
        System.out.println("The color of the square: " + square.getColor());
        System.out.println("The texture of the square: " + square.getTexture ()+ "\n");
        //Cube
        Cube cube = new Cube("Taffeta White", "Grainy", 5.0);
        System.out.println("The volume of the cube : " + cube.getVolume());
        System.out.println("The color of the cube : " + cube.getColor());
        System.out.println("The texture of the cube: " + cube.getTexture ()+ "\n");
        
    }
}
