package sumJavaProblem;
//1부터 10까지 합계구하기
public class Problem1 {

	public static void main(String[] args) {
		int i =1;
		int sum =0;
		
		while (i <= 10) {
			sum +=i;
			
			i++;
		}
		System.out.println("1부터 10까지 합은 "+sum+"입니다");

	}

}
