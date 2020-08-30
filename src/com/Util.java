//package anyting;

public class Util {
	public void sort2D(int [][] array, int row,int col) {
		int dimension;
		dimension=row*col;
		int [] linearArray=new int[dimension];
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				for (int k=0;k<dimension;k++) {
					linearArray[k]=array[i][j];
				}
			}
		}
		int[] newArray=SelectionSort(linearArray);
		//System.out.println(linearArray);
		for (int i=0;i<dimension;i++) {
			//for(int j=0;j<col;j++) {
				
				System.out.println(newArray[i]);
			
		}
	}
public int[] SelectionSort(int[] arr) {
	int c=0,temp=0,min=999,minindex=0;
	System.out.println("Sorted by Slection Sort for the following purposes \n1.Not Stable \n2.Out place \n3.Meant for minimum swaps");
	System.out.println("4.Select the min and swap at the first non-sorted position");
	for (int i=0;i<arr.length;i++) {
		//System.out.println("flag");
		for (int j=i+1;j<arr.length;j++) {
			//System.out.println("flag");
			
			  //=findmin(arr,j,arr.length);
			if(arr[j]<min) {
				min=arr[j];
				 minindex=j;
			}
			//System.out.println("flag");
			temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
			c++;
		}
	}
	System.out.println("no.of swaps"+c);
	return arr;
}
public int findmin(int[] arr, int low, int high) {
	int min=9999,minindex=0;
	
	for (int i=low;i<high;i++) {
		if(arr[i]<min) {
			min=arr[i];
			 minindex=i;
		}
	}
	return minindex;
}
public void swap(int i,int j) {
	int temp;
	temp=i;
	i=j;
	j=temp;
}
}

