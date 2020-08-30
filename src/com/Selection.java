//import Util;
import java.util.*;
public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Util utility=new Util();
		final int row=10;
		final int col=10;
		int [][] array= new int[row][col];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int randint= rand.nextInt(100);
				array[i][j]=randint;
			}
		}
		/*for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.println(array[i][j]);
			}
		}*/
		System.out.println(array);
		utility.sort2D(array,row,col);
		
	}

}

