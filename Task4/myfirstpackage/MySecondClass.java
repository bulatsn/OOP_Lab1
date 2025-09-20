
package myfirstpackage;

public class MySecondClass {
    private int i1;
    private int i2;

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI1(int newI1) {
        i1 = newI1;
    }

    public void setI2(int newI2) {
        i2 = newI2;
    }

    public MySecondClass(int num1, int num2) {
        this.i1 = num1;
        this.i2 = num2;
    }

    public int or() {
        return i1 | i2;
    }
}