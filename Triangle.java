package Chapter4Homework;

import ExceptionDemo.BinaryToDecimal.InvalidBinaryNumberException;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleSideException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleSideException{
        setTriangle(side1);
        setTriangle(side2);
        setTriangle(side3);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    private void setTriangle(double side1) throws IllegalTriangleSideException {
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){

        }else{
            throw new IllegalTriangleSideException("Enter correct length of triangle");
        }
    }

}
