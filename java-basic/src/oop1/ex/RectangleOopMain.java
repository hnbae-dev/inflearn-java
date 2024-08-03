package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 8;
        r.height = 8;

        int area = r.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = r.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = r.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
