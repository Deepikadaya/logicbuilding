package Excersice;

public class arraySmallestBiggest {

	public static void main(String[] args) {
		int arr[]={34,65,12,61,1,78};
		int small=arr[0];
		int big=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]<small){
				small=arr[i];
			}
			if(arr[i]>big){
				big=arr[i];
			}
		}
		System.out.println("The smallest number in the given array is: "+small);
		System.out.println("The biggest number in the given array is: "+big);

	}

}
