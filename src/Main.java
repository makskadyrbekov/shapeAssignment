public class Main {
    public static void main(String[] args) {
        /***
         * Task :  shapeAssignment
         * Author: Maksat Kadyrbekov
         * This program prompts the user to enter two numbers, swaps their values,
         * and then displays the swapped values to the console.
         */

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);
        Shape triangle = new RightTriangle(3, 4);
        Shape isoTriangle = new IsoscelesRightTriangle(5);

        System.out.println("Circle: Area=" + circle.getArea() + ", Perimeter=" + circle.getPerimeter());
        System.out.println("Rectangle: Area=" + rectangle.getArea() + ", Perimeter=" + rectangle.getPerimeter());
        System.out.println("Square: Area=" + square.getArea() + ", Perimeter=" + square.getPerimeter());
        System.out.println("Right Triangle: Area=" + triangle.getArea() + ", Perimeter=" + triangle.getPerimeter());
        System.out.println("Isosceles Right Triangle: Area=" + isoTriangle.getArea() + ", Perimeter=" + isoTriangle.getPerimeter());


    }
}


