import java.util.ArrayList;
import java.util.Collections;

public class arrList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // Adding elements in ArrayList
        nums.add(3);
        nums.add(2);
        nums.add(2);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(3);
        // Normally printig ArrayList
        System.out.println("Initial ArrayList "+nums);
        // itrating through an ArrayList using for-each loop
        System.out.print("Itrating arrayList using for-each loop ");
        for (Integer i : nums) {
            System.out.print(i + " "); // printig arrayList
        }
        System.out.println();
        // itrating through an ArrayList using for loop
        System.out.print("Itrating ArrayList using for loop ");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " "); // printing arrayList
        }
        System.out.println();
        // update element in arrayList
        nums.set(2, 4);
        System.out.println("Updating ArrayList "+nums);
        // Remove element from arrayList
        nums.remove(5);
        System.out.println("Removing elements form ArrayLsit "+nums);
        // size of arrayList
        System.out.println("Size of ArrayList "+nums.size());
        // Remove all elements from arrayList
        nums.clear();
        System.out.println("Removing all elements form array list "+nums);
        // Inserting elements form array to a arrayList
        int[] arr = { 5, 3, 8, 9, 2, 0 };
        for (int i : arr) {
            nums.add(i);
        }
        System.out.println("Printing arrayList after inserting elements form arry "+nums);
        //Adding 2nd array to arrayList
        int [] arr1 = {15, 12, 13, 45, 78};
        for (int i : arr1) {
            nums.add(i);
        }
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        // Searching in ArrayList
        int element = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (element == nums.get(i)) {
                System.out.println("Searching an element in an ArrayList and returning index "+i);
            }
        }
        // sorting an ArrayList
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = 0; j < nums.size()-i-1; j++) {
                if (nums.get(j) > nums.get(j+1)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, temp);
                }
            }
        }
        System.out.println("sorted arraylist"+nums);
    }
}
