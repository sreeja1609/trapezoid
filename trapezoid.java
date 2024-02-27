import java.util.*;
class Trapezoid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int res=add(a, b);
    }
    public static int add(int a, int b){
        int addi=a+b;
        return division(addi);
    }
    public static int division(int num){
        int val=num/2;
        multiplication(val, h);

    }
    public static int multiplication(int a, int b){
        System.out.println(a*b);
    }
}