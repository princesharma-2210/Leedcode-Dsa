import java.util.Scanner;

public class calculator {
    void add(int a,int b){
        int c= a+b;
        System.out.println("add "+c);
    }
    void substraction(int a,int b){
        int c= a-b;
        System.out.println("subtraction "+c);
    }
    void mul(int a,int b){
        int c= a*b;
        System.out.println("multipication "+c);
    }
    void div(int a,int b){
        int c= a/b;
        System.out.println("division-> "+c);
    }
    public static void main(String[] args){
        calculator c= new calculator();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first Input -> ");
        int a= sc.nextInt();
        System.out.print("Enter the second Input -> ");
        int b= sc.nextInt();
        c.add(a,b);
        c.substraction(a,b);
        c.mul(a,b);
        c.div(a,b);
    }
}