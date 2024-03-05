import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        int b = scanner.nextInt();
        Math math1 = new Math(x,a,b);
        math1.Math_One();
        Math math2 = new Math(x,a,b);
        math2.Math_Two();
        Math math3 = new Math(x,a,b);
        math3.Math_Free();
    }
}
class Math
{
    public int x;
    public int a;
    public  int b;
    public int y;
    public  Math(int x, int a, int b) {this.x = x; this.a = a; this.b = b;}
    public void Math_One()
    {
        y = 3 * x + 5;
        System.out.printf("Результаты вычислений:\n%d\n", y);
    }
    public void Math_Two()
    {
        if (a-b != 0)
        {
            y = (a+b)/(a-b);
            System.out.printf("Результаты вычислений:\n%d\n", y);
        }
        else
            System.out.println("Решение не возможно!!!");
    }
    public  void Math_Free()
    {
        if (a*x/b != 0)
        {
            y = a*x/b;
            for (int i = 1; i < y; i++ )
            {
                y = i * (i+1);
            }
            System.out.printf("Результаты вычислений:\n%d\n", y);
        }
        else
        {
            System.out.println("Решение не возможно!!!");
        }

    }


}