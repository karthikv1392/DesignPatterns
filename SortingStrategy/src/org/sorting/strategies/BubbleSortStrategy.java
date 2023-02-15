package org.sorting.strategies;

import java.util.ArrayList;

import org.sorting.SortingStrategy;

public class BubbleSortStrategy implements SortingStrategy {
    public void sort(ArrayList<Integer> listOfItems) {
        // Implement bubble sort
        int n = listOfItems.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (listOfItems.get(j) > listOfItems.get(j+1))
                {
                    // swap temp and arr[i]
                    int temp = listOfItems.get(j);
                    listOfItems.set(j, listOfItems.get(j+1));
                    listOfItems.set(j+1, temp);
                }
        System.out.println("Sorting using bubble sort");
    }
}

