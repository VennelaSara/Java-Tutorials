class Hello {
    public static void main(String args[]) {
        int num = 3;
        System.out.println(2 + 3);
        System.out.println("Hello");

        // Intermediate Code ByteCode(JVM Can Understand it since it is near to OS) that
        // is independent of OS and Hardware and
        // can only be run by JVM which is Platform dependent
        // javac - Compilation , java - To tell JVM to run ByteCode
        // File - main Only one file is given to JVM to Run that must Contain Main
        // Method.

        // Temaporary Storage - Variables.

        // DataTypes

        int num1 = 0;
        int a = 12;
        byte b = 127;
        short s = 34;
        long l = 234l;
        float f = 23.3f; // 'f'used to mention float since by default java use double for point values
        double d = 5.6;
        char c = 'k';
        boolean b1 = true;
        int num3 = 0b1010;
        int num2 = 10_00_00_000; // For Clarity between Zeros
        double d2 = 56;
        int num4 = 0x231;
        double num5 = 12e10;
        // boolean num = 1; error
        char c2 = 'a'; // Literals(character,String,Hexadecimal,Binary,exponential,etc).
        // Only Single Quotes - UNICODE Format.
        c2++;
        System.out.println(c2);

        // TypeConversions and Casting

        // b = a; error-dataloss narrowing size
        // a = b; widening size - Implicit Conversion - Automatic
        // If value less like byte b = 127 and int a = 12 (b = a )can store but not
        // allowed.
        // So Explicitly TypeCasting convert using
        // Boolean can't Store Characters since it only has True or False.
        b = (byte) a;
        // float f = 5.6f; ->int x = (int)f; ->x = 5 cuts value after Point
        // In case of Byte ->byte b = 127 and int a = 257; ->b = (byte)a;->Beyond Range
        // Here it uses Concept of Modulo(with its Range) - 257%256

        // Type Promotion:-
        // byte a = 10; byte b = 30; int result = a*b ->byte*byte ->Out of Range of Byte
        // so promoted to Integer.

        // Arithmetic Operations
        // Preincrement - fetch the value and then increment
        // Postincrement - increment and then Fetch value.
        // a+b,a-b,a*b,a/b,a%b

        // = ->Assignment.

        // Relational Operations - Comparision ->Output - Boolean value
        // >,<,>=,<=,==,!=

        // Logical Operations
        // To Combine Comparisions.
        // Short Circuit Concept - &&,||.

        // Conditional Statements - Flow Based on Condition.
        int x = 18;
        if (x > 10 && x < 20)
            System.out.println("Hello");
        else
            System.out.println("Bye");

        int y = 12;
        int z = 14;
        if (y > z) {
            System.out.println(y);
            System.out.println("Thank You");
        } else if (x > y)
            System.out.println(x); // all ifs - independent
        else // if-else if-else - Dependent.
            System.out.println(z);
        // ; ->Statement Ends.
        // Ternary Operator - result =
        // n%2==0?System.out.println("True"):System.out.println("False");

        // Switch , Break , Default.

        // Samething Multiple times - loops
        int i = 1;
        while (i <= 4) {
            System.out.println("Hi" + i); // i->1,2,3,4 Printed
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i); // i -> 5 Printed.

        // for loop - For Finite Iterations we know them(Example - 1 to 100
        // Printing),while - we dont know iterations(File Reading Example)
        // depends on Condition,
        // do while - atleast Once Other Same as While.
        // String with Number Concatenated so to avoid ().
        for (int i2 = 1; i2 <= 5; i2++) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(" " + (j + 8) + " - " + (j + 9));
            }
        }
        for (int i1 = 1; i1 <= 5;) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println(" " + (j + 8) + " - " + (j + 9));
            }
            i1++;
        }

    }
}