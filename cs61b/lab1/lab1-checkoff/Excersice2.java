public class Excersice2{
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
		}
	public static int max(int[] m) {
		int j = m.length - 1;
		for (int i = 0; i < j ; i++){
			if (m[i] > m[i+1]){
				m[i + 1] = m[i];
			}
		}

		return m[6];
	}

}