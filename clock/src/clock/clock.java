package clock;
import java.util.Scanner;

public class clock {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner scan = new Scanner(System.in);
				System.out.println("�ð� �Է�: ");
				int hour = scan.nextInt();
				double minute = 60*hour;
				
				if(hour == 12)
					System.out.println("0.0000000000");
				if(hour == 11)
					System.out.println("CAN'T SEE!");
				else
					minute = minute / 11;
					System.out.println(+ hour +"�ÿ� ��ġ�ϴ� ���� " + minute);
					
			}



	}


