package zdsp;

import java.util.Scanner;

public class Zidsp {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//读入投币金额
		System.out.print("请投币：");
		int amount=in.nextInt();
		//System.out.print(amount>10);
		if(amount>=10)
		{
					//打印出来车票
					System.out.println("***************");
					System.out.println("*    无指定做位票    *");
					System.out.println("*    票价：10元      *");
					System.out.println("***************");
					//计算并找零出余额
					System.out.println("找零："+(amount-10));
		}
	}

}
