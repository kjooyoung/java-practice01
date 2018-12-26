package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int val = sc.nextInt();
		int result = 0;
		if((val%2)==0) {
			for(int i=0; i<=val; i++) {
				if((i%2)==0) result = result + i;
			}
		}
		else {
			for(int i=0; i<=val; i++) {
				if((i%2)!=0) result = result + i;
			}
		}
		System.out.println("결과 값 : "+result);
		sc.close();
	}
}
