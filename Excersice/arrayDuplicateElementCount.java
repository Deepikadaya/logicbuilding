package Excersice;

public class arrayDuplicateElementCount {

	public static void main(String[] args) {
	    int arr[]={11,22,33,11,44,22,55,55,12,12};
        
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	    	for(int j=i+1;j<arr.length;j++){
	    		if(arr[i]==arr[j]){
	    			count++;
	    		}
	    	}
	    }
	    System.out.println("Total count of duplicate elements: "+count);
	}

}
