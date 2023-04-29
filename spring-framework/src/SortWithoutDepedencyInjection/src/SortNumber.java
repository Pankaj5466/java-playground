/*
//Case 1: Plugin the sortAlgrithm depedency directry in the class (HardCoding)
public class SortNumber {

    private SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }
}
*/

//Case 2: Plugin the sortAlgrithm depedency via constructor (somewhat flexible code)
public class SortNumber {

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
