package sumJavaProblem;

import java.util.Scanner;

//5으 배수의 합과 개수 구하기 - 알고리즘
public class problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int sum =0;
		int a =0;
		int b =0;
		
		System.out.println("최댓값을 입력하세요:");
		int j = sc.nextInt();
		
		for(int i =1; i<j+1; i++) {
			a = i/5;
			b = i -(a*5);
			if( b==0) {
				count ++;
				sum =sum +i;
			}
		}
		System.out.println("5의 배수의 개수:"+count);
		System.out.println("5의 배수의 합:"+sum);

	}

}
