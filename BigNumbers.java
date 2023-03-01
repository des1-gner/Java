/*
*/


public class BigNumbers{

	public static void bigNumbers(int[] arr){
		int total = 0;
		//calculate average
		double ave = 0.0;
		for(int i = 0; i < arr.length; i++){
			total = total + arr[i];
		}
		ave = (double)total/arr.length;
		System.out.println("Average = " + ave);

		//print elements that are greater then average
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > ave)
			System.out.println(arr[i]);
		}
	}

	//test the method in main
	public static void main(String[] args){
        //array declaration and initialization
		int [] numbers = {45, 123, 56, 8, 23, 53, 145, 78, 34, 88, 12, 15, 7};
		//void method call
		bigNumbers(numbers);
	}
}