package amazon;
/*
 * Problem statement:
There is a colony of 8 cells arranged in a straight line where each day every cell competes with its adjacent cells(neighbour). Each day, for each cell, if its neighbours are both active or both inactive, the cell becomes inactive the next day,. otherwise it becomes active the next day.

Assumptions: The two cells on the ends have single adjacent cell, so the other adjacent cell can be assumsed to be always inactive. Even after updating the cell state. consider its pervious state for updating the state of other cells. Update the cell informationof allcells simultaneously.

Write a fuction cellCompete which takes takes one 8 element array of integers cells representing the current state of 8 cells and one integer days representing te number of days to simulate. An integer value of 1 represents an active cell and value of 0 represents an inactive cell.

 */
public class CellStatusCheck2 {

	static boolean[] findCellStatus(int cellArray[], int days) {
		boolean[] cells = convertToBoolean(cellArray);
		boolean temp[] = new boolean[cellArray.length];
		for (int i = 0; i < cellArray.length; i++)
			temp[i] = cells[i];
		while (days-- > 0) {
			temp[0] = false ^ cells[1];
			temp[cellArray.length-1] = false ^ cells[cellArray.length-2];
			for (int i = 1; i <= cellArray.length-2; i++)
				temp[i] = cells[i - 1] ^ cells[i + 1];
			for (int i = 0; i < cellArray.length; i++)
				cells[i] = temp[i];
		}
		int active = 0, inactive = 0;
		for (int i = 0; i < cellArray.length; i++)
			if (cells[i] == true)
				active++;
			else
				inactive++;
		return cells;
	}
     public static boolean[] convertToBoolean(int[] input)
     {
    	 boolean inp[]=new boolean[input.length];
    	 int index=0;
    	 for (int i : input) {
    		 if(i==1)
			inp[index]=true;
    		 else
    			 inp[index]=false;
    		 index++;
		}
    	 return inp;
     }
	public static void main(String[] args) {
		//int [] array = { 1, 1, 1, 0, 1, 1, 1, 1 };
		int [] array = { 1, 0, 0, 0, 0, 1, 0, 0 };
		int days = 1;
		 boolean[] arra = findCellStatus(array, days);
		 System.out.println("\n");
		for (int i = 0; i < arra.length; i++) {
			if(arra[i]==true)
			System.out.print("1");
			else
				System.out.print("0");
		}
	}
}