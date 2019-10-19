public class Dis1{
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		if (n == 1){
			return 0;
		}
		else if (n == 2){
			return 1;
		}
		else if (n == 3){
			return 1;
		}
		else{
		int[] a = new int[]{0, 1, 1};
		for(int i = 0; i < n-3; i++){
			a[0] = a[1];a[1] = a[2];a[2] = a[0] + a[1];
		}
		return a[2];
	}	
		}
}