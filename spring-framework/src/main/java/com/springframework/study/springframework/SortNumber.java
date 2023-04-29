package com.springframework.study.springframework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Case 3: Let SpringFramework manage the depedency
@Component
public class SortNumber {

    //way1: named autowiring
    @Autowired
    private SortAlgorithm quickSortAlgorithm; //name must match with className (with 1st char lowercase)

    //way2: manual qualifer marker
   @Autowired
   @Qualifier("quick")
   private SortAlgorithm qualifierSortAlgorithmOne;

   //way3: auto qualifer-name from spring
    @Autowired
    @Qualifier("bubbleSortAlgorithm") //NOTE: here, we use class name as Qualifier, as spring generated one for us(in case we do not specify qualifier on the class ourserlf)
    private SortAlgorithm qualiferSortAlgorithmTwo;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

//        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(quickSortAlgorithm);
        System.out.println(qualifierSortAlgorithmOne);
        System.out.println(qualiferSortAlgorithmTwo);

        // Search the array
        return 3;
    }
}