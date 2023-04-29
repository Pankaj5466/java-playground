package com.springframework.study.springframework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Case 3: Let SpringFramework manage the depedency
@Component
public class SortNumber {

   @Autowired
    private SortAlgorithm sortAlgorithm;

    SortNumber(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }
}