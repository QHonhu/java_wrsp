package zdsp;

import java.util.Scanner;

public class Zidsp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//����Ͷ�ҽ��
		System.out.print("��Ͷ�ң�");
		int amount=in.nextInt();
		//System.out.print(amount>10);
		if(amount>=10)
		{
					//��ӡ������Ʊ
					System.out.println("***************");
					System.out.println("*    ��ָ����λƱ    *");
					System.out.println("*    Ʊ�ۣ�10Ԫ      *");
					System.out.println("***************");
					//���㲢��������
					System.out.println("���㣺"+(amount-10));
		}
	}

}
