import java.util.*;
public class DigitSum{
	 static  public void main(String args[]){
		DigitSum ds = new DigitSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n =sc.nextInt();
		System.out.println(ds.sumDigit(n));
	}
	int sum = 0;
	public int sumDigit(int n){
		if(n == 0){
			return sum;
		}else{
			sum += n%10;
			sumDigit(n/10);
		}
		return sum;
	}
}