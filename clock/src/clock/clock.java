package clock;
import java.util.Scanner;

public class clock {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner scan = new Scanner(System.in);
				System.out.println("시간 입력: ");
				int hour = scan.nextInt();
				double minute = 60*hour;
				
				if(hour == 12)
					System.out.println("0.0000000000");
				if(hour == 11)
					System.out.println("CAN'T SEE!");
				else
					minute = minute / 11;
					System.out.println(+ hour +"시와 일치하는 분은 " + minute);
					
			}



	}


