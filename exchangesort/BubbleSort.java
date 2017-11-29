
public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = new int[]{ 10,7,90,23,1,92,28,75,12,8,13};
		System.out.println("origin:");
		print(arr);
		sort(arr);
		System.out.println("sorted:");
		print(arr);
		
	}

	public static void sort(int[] arr){
		int index = 0;
		while(index < arr.length){
			for (int i = 1; i < arr.length-index; i++) {
				if(arr[i-1] < arr[i] ){
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
			}
			index++;
		}
	}

	public static void print(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1){
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}