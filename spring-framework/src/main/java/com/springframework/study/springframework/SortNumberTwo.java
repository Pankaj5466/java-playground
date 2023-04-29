package com.springframework.study.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SortNumberTwo {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    //Construction Injection
    //Useful, in case you want to do something before Autowiring
    SortNumberTwo(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    //Setter Injection (If we do not provide it, then springframework will create on for us)
    /*
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    */
    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Search the array
        return 3;
    }
}
