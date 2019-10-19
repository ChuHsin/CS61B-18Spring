public class HW0Exercise4 {
	public static void main(String[] args){
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);
    System.out.println(java.util.Arrays.toString(a));
	}

	public static int[] windowPosSum(int[] a, int n){
		for (int i = 0; i < a.length; i++){
			if (a[i] < 0){
				continue;
			}
			for(int j = 1; j <= n; j++){
					if (i + j > a.length - 1){
						break;
					}
					a[i] = a[i] + a[i+j];

				}
			}
	    return a;

	}
}