package sumJavaProblem;
// 1부터 100까지 합계 구하기
//while
//for
// do_while 문으로 
public class Problem2 {

	public static void main(String[] args) {
		int sum =0;
		int i =1;
		while(i<100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
     }
}
public class problem{
	public static void main(String[]args) {
		int sum =0;
		for(int i =1; i<101; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
public class Problem2{
	public static void main(String[]args) {
		int sum =0;
		int i =1;
		do {
			sum +=i;
			i++;
		}while(i<101);
		System.out.println(sum);
	}
}