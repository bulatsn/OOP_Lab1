class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass(5, 3);
        
        System.out.println(o.or());  
        
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setI1(i);      
                o.setI2(j);      
                System.out.print(o.or());  
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


class MySecondClass {
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