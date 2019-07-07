package amazon;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem statement:
There is a colony of 8 cells arranged in a straight line where each day every cell competes with its adjacent cells(neighbour). Each day, for each cell, if its neighbours are both active or both inactive, the cell becomes inactive the next day,. otherwise it becomes active the next day.

Assumptions: The two cells on the ends have single adjacent cell, so the other adjacent cell can be assumsed to be always inactive. Even after updating the cell state. consider its pervious state for updating the state of other cells. Update the cell informationof allcells simultaneously.

Write a fuction cellCompete which takes takes one 8 element array of integers cells representing the current state of 8 cells and one integer days representing te number of days to simulate. An integer value of 1 represents an active cell and value of 0 represents an inactive cell.

 */
public class CellStatusCheck {

	static void activeAndInactive(boolean cells[], int n, int k) {
		// copy cells[] array into temp [] array
		boolean temp[] = new boolean[n];
		for (int i = 0; i < n; i++)
			temp[i] = cells[i];

		// Iterate for k days
		while (k-- > 0) {

			// Finding next values for corner cells
			temp[0] = false ^ cells[1];
			temp[n - 1] = false ^ cells[n - 2];

			// Compute values of intermediate cells
			// If both cells active or inactive, then
			// temp[i]=0 else temp[i] = 1.
			for (int i = 1; i <= n - 2; i++)
				temp[i] = cells[i - 1] ^ cells[i + 1];

			// Copy temp[] to cells[] for next iteration
			for (int i = 0; i < n; i++)
				cells[i] = temp[i];
		}

		// count active and inactive cells
		int active = 0, inactive = 0;
		for (int i = 0; i < n; i++)
			if (cells[i] == true)
				active++;
			else
				inactive++;

		System.out.print("Active Cells = " + active + ", " + "Inactive Cells = " + inactive);
	}

	// Driver code
	public static void main(String[] args) {
		boolean cells[] = { false, true, false, true, false, true, false, true };
		int k = 3;
		int n = cells.length;
		activeAndInactive(cells, n, k);
	}
}