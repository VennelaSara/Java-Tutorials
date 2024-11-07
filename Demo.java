
class Calculator {
    int a;

    // Design
    public int add(int n1, int n2) {
        int r = n1 + n2;
        System.out.println("In Add");
        return r;
    }
}

public class Demo {
    public static void main(String args[]) {
        // Object Oriented Programming
        // Object - Properties and Behaviours
        // int num1 = 4,num2 = 5;
        // int result = num1+num2;
        // System.out.println(result);
        // Reference Variable - Calculator Calc;
        // int num - Primitive Variable
        // To Create Object - new Calculator() which occupies Space in Memory.
        Calculator calc = new Calculator();

        int res = calc.add(4, 5);
        System.out.println(res);

    }
}
