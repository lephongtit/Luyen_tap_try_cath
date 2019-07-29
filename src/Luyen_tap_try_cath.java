import java.util.Scanner;
public class Luyen_tap_try_cath {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        try {

            System.out.print("Nhập độ dài cạnh 1: ");
            int a = sr.nextInt();
            System.out.print("Nhập độ dài cạnh 2: ");
            int b = sr.nextInt();
            System.out.print("Nhập độ dài cạnh 3: ");
            int c = sr.nextInt();
             if ( a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a ){
                 System.out.println("Độ dài 3 cạnh hợp lệ !");
             } else {double temp = 0/0;}
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.err.println("Độ dài 3 cạnh không hợp lê!");
        }
    }
}
