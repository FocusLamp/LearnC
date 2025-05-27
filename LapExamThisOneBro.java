package lab1;

import java.util.Scanner;

public class LapExamThisOneBro {

    public static void main(String[] args) {
        
        // Lab 1 
        System.out.println("my neam is yazan");
        
        // Lab 2
        // لكتابه الارقام الصحيحه
        float A = 1;
        byte B = 2;
        short C = 3;
        long D = 4;
        System.out.println("A=" + A);
         
        // boolean
        boolean b = true;
        boolean t = false;
        System.out.println(b);
        System.out.println(t && b);
         
        // لكتابه الارقام العشريه
        double x = 1.5;
        System.out.println("x=" + x);
        
        // لكتابه النصوص
        String A1 = ("yazan ali almalki");
        
        // char يسجل حرف واحد بس
        char y = ('A');
        System.out.println(y);
         
        // عمليات حسابيه 
        int calc = (int) (A + C);
        int cc = (int) (A * C);
        int xx = (int) (A += A);
        
        System.out.println(C < A);
        System.out.println("xx=" + xx);
        System.out.print("cc=" + cc);
        System.out.println(calc);
        
        System.out.println("s=" + (int)++A);
        
        // تحويل انواع البيانات
        int H = 10;
        char ch = (char) H;
        System.out.println(ch);
         
        // جمل الشرط(lab3)
        if(1 < 0)
            System.out.println("no");
        else 
            System.out.println("yes");
         
        // جمل switch
        int dayy = (4);
        
        switch(dayy) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("werk");
                break;
            case 6:
            case 7:
                System.out.println("week end");
                break;
        }
        
        // lab4
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        if(num > 5) {
            System.out.println("up");
        } else if(num == 5) {
            System.out.println("good");
        } else if(num < 5) {
            System.out.println("no");
        }
          
        Scanner s = new Scanner(System.in);
        System.out.println("كم عمرك");
        int age = s.nextInt();
        
        if(age < 18)
            System.out.println("out");
        else if(age >= 18)
            System.out.println("welcom");
         
        // lab5
        int num1 = 1;
        while(++num1 >= 20) {
            System.out.println("yzn");
        }
         
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.println("i = " + i + ", j = " + j);
            }
        }
         
        // lab6
        byte[] grades = {92, 67, 88, 90, 73, 95};

        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = (double) sum / grades.length;
        System.out.println("المعدل المئوي = " + average + "%");

        // lab7 - calling methods
        int result = sum(5, 7);
        System.out.println("Sum: " + result);

        printMessage();

        System.out.println("Multiply int: " + multiply(3, 4));
        System.out.println("Multiply double: " + multiply(2.5, 4.0));

        showScope();
        
        int[] testArray = {1, 2, 3, 4, 5};
        printArray(testArray);
        
        int[] returnedArray = getArray();
        printArray(returnedArray);
        
        traceExample();
        
        methodA();
        
        handleException();
        
        // Close scanners
        in.close();
        s.close();
    }

    // lab7 method definitions
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printMessage() {
        System.out.println("Hello from a void method!");
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void showScope() {
        int localVar = 10;
        System.out.println("Local variable: " + localVar);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] getArray() {
        return new int[] {10, 20, 30, 40};
    }

    public static void traceExample() {
        System.out.println("Inside traceExample()");
    }

    public static void methodA() {
        System.out.println("In methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("In methodB");
    }

    public static void handleException() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}    