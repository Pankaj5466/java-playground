public class Main {
    public static void main(String[] args) {

        System.out.println("We will be creating SortAlgorithm Class without using any depedency Injection framework(like Spring Framework)");


        //Case 1: When sortingMethode is directly linked in the SortNumber class/ SortNumber bean itself
        //SortNumber sortNumber = new SortNumber();


        //Case 2: sortingMethode is passed via constructor
        SortNumber sortNumber  = new SortNumber(new QuickSortAlgorithm());

        int numbers[] = {1,3,4,5};
        int idx = sortNumber.binarySearch( numbers, 90);
        System.out.println("idx: ${}");
        System.out.println(idx);

    }
}