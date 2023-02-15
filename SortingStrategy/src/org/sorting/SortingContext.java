package org.sorting;

import java.util.ArrayList;

class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(ArrayList<Integer> listOfItems) {
        sortingStrategy.sort(listOfItems);
    }
}