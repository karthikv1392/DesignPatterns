package org.sorting;

import org.sorting.strategies.BubbleSortStrategy;
import org.sorting.strategies.InsertionSortStrategy;

import java.util.ArrayList;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Create list of items to be sorted
        ArrayList<Integer> listOfItems = new ArrayList<Integer>(){
            {
                add(3);
                add(5);
                add(2);
                add(4);
                add(1);
            }
        };

        // Create a sorting strategy
        SortingStrategy sortingStrategy = new BubbleSortStrategy();
        // sortingStrategy = new InsertionSortStrategy();

        // Create a context object
        SortingContext sortingContext = new SortingContext(sortingStrategy);

        // Sort the items
        sortingContext.sort(listOfItems);

        // Print sorted list
        System.out.println("Sorted list: " + listOfItems);
    }
}
