import java.util.*;

public class NumberSorting {
    public static void main(String[] args){

        Scanner kbd = new Scanner(System.in);
        List<Integer> numList = new ArrayList<Integer>();

        System.out.println("Enter integers to be sorted separated by spaces.\nEnter any letter when finished.");
        while(kbd.hasNextInt()){
            numList.add(kbd.nextInt());
        }
        int[] numArray = numList.stream().mapToInt(Integer::intValue).toArray();
        QuickSort.quickSort(numArray);
        System.out.print("Sorted list: ");
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }
    }
}
