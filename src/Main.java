import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("y=ax(平方)+bx+c");
        Scanner imput=new Scanner(System.in);
        int a,b,c,x,y;
        System.out.print("請輸入a:");
        a=imput.nextInt();
        System.out.print("請輸入b:");
        b=imput.nextInt();
        System.out.print("請輸入c:");
        c=imput.nextInt();
        System.out.print("請輸入x:");
        x=imput.nextInt();
        y=a*x*x+b*x+c;
        System.out.printf("%d*%d*%d+%d*%d+%d=%d",a,x,x,b,x,c,y);
        imput.close();
    }
}