//1.�������ҵ�Scanner��
import java.util.Scanner;
public class ScannerDemo
{
    public static void main(String[] args)
    {
        //2.�������󣬱�ʾ������׼��Ҫ��Scanner�����
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ������");
        //3.��������
        int i = sc.nextInt();

        System.out.println(i);
    }
}