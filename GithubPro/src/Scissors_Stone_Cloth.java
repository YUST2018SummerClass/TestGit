
import java.util.Scanner;

public class Scissors_Stone_Cloth {

    public static void main(String[] args) {
            //�ж��Ƿ�����ı�־
            int k = 1;
            do {
                System.out.println("��ȭ��Ϸ���ڿ�ʼ"+"\n"+"���� 0 :ʯͷ   1 :����    2 :��");
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                //�ж��������ʯͷ���ǲ�
                if (n==0) {
                    System.out.print("���ʯͷ");
                }else if(n==1){
                    System.out.print("�������");
                }else {
                    System.out.print("�����");
                }
                //���������
                int x=0+(int)(Math.random()*2);
                //�жϵ��Գ����Ǽ���ʯͷ���ǲ�
                if (x==0) {
                    System.out.println("VS���Գ�ʯͷ");
                }else if(x==1){
                    System.out.println("VS���Գ�����");
                }else {
                    System.out.println("VS���Գ���");
                }
                //�ж�˭Ӯ
                if ((n==0&&x==1) || (n==1&&x==2) || (n==2&&x==0)) {
                    System.out.println("��Ӯ��");
                }else if(n == x){
                    System.out.println("��ƽ");
                }else {
                    System.out.println("����Ӯ��");
                    
                }
                System.out.println("�Ƿ������Ϸ?        1 : ����        2 : �ر�");
                Scanner ab = new Scanner(System.in);
                k = ab.nextInt();
            } while (k==1);
            
    }

}


