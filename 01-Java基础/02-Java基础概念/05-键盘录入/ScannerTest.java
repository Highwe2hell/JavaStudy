//1.����
import java.util.Scanner;
public class ScannerTest
{
    public static void main(String[] args)
    {
        //2.��������
        Scanner sc = new Scanner(System.in);

        //3.������
        System.out.println("�������һ������");
        int n1 = sc.nextInt();
        System.out.println("������ڶ�������");
        int n2 = sc.nextInt();

        System.out.println(n1 + n2);
    }
}