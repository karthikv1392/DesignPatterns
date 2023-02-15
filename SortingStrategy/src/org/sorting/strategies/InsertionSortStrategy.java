package org.sorting.strategies;

import java.util.ArrayList;

import org.sorting.SortingStrategy;

public class InsertionSortStrategy implements SortingStrategy {
    public void sort(ArrayList<Integer> listOfItems) {
        int n = listOfItems.size();
        for (int i=1; i<n; ++i)
        {
            int key = listOfItems.get(i);
            int j = i-1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j>=0 && listOfItems.get(j) > key)
            {
                listOfItems.set(j+1, listOfItems.get(j));
                j = j-1;
            }
            listOfItems.set(j+1, key);
        }
        System.out.println("Sorting using insertion sort");
    }
}