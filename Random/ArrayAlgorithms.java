import java.util.ArrayList;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        /** Fill an array with squares from zero to 10 */
        int[] nums1 = new int[11];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i * i;
            System.out.print(nums1[i] + " ");
        }

        System.out.println(""); // Separator
        System.out.println(""); // Separator

        /** Find sum and average of an array containing random numbers */
        int[] nums2 = {1, 7, 8, 4, 2, 3, 6, 5, 11};
        int sum = 0;

        for (int num : nums2) {
            sum += num;
            System.out.print(sum + " ");
        }
        System.out.println(""); //Separator
        System.out.println(""); // Separator

        int average = 0;
        average = sum / nums2.length;

        System.out.print("Average: " + average);

        System.out.println(""); //Separator
        System.out.println(""); // Separator

        /** Find maximum and minimum in an array of numbers */

        int[] nums3 = {11, 4, 7, 9, 8, 2, 3, 6};
        int min = nums3[0];
        int max = nums3[0];

        for (int i = 0; i < nums3.length; i++) {
            if (nums3[i] > max) {
                max = nums3[i];
            }
            if (nums3[i] < min) {
                min = nums3[i];
            }
        }
        System.out.print("Min: " + min + " Max: " + max);

        System.out.println(""); //Separator
        System.out.println(""); // Separator

        /** Print elements with a separator */

        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < nums4.length; i++) {
            System.out.print(nums4[i]);
            System.out.print(" : ");
        }

        System.out.println(""); //Separator
        System.out.println(""); // Separator

        /** Linear search an arraylist */

        int[] nums5 = {1, 6, 4, 5, 3, 8, 7, 9};
        int valToSearch = 3;
        int position = 0;
        boolean found = false;

        while (position < nums5.length && !found) {
            if (nums5[position] == valToSearch) {
                found = true;
            } else {
                position++;
            }
            if (found) {
                System.out.print(valToSearch + " was found at position " + position);
            }
        }
        System.out.println(""); //Separator
        System.out.println(""); // Separator

        /** Removing an element in an array */
        ArrayList<Integer> list1;
        list1 = new ArrayList<>();
        int length1 = 10;
        int element1 = 4;

        for (int i = 0; i < length1; i++) {
            list1.add(i);
        }
        System.out.println("Before: " + list1);
        list1.remove(element1);
        System.out.println("After: " + list1);

        System.out.println(""); //Separator

        /** Adding an element in an array */
        ArrayList<Integer> list2;
        list2 = new ArrayList<>();
        int length2 = 5;
        int location = 3;
        int element2 = 20;

        for (int i = 0; i < length2; i++){
            list2.add(i);
        }
        System.out.println("Before: " + list2);
        list2.add(location, element2);
        System.out.println("After: " + list2);

        System.out.println(""); // Separator

        /** Swapping elements in an array */

        ArrayList<Integer> list3;
        list3 = new ArrayList<>();
        int length = 5;
        int element3 = 0;

        for (int i = 0; i < length; i++){
            list3.add(i);
        }
        element3 = list3.get(3);
        list3.remove(3);
        list3.add(1, 4);

        /** Copying elements in an array to another */

        int[] nums8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums9 = new int[nums8.length];

        for (int i = 0; i < nums8.length; i++) {
            nums9[i] = nums8[i];
        }

        System.out.println("Array 1");

        for (int i = 0; i < nums8.length; i++){
            System.out.print(" " + nums8[i]);
        }

        System.out.println("");
        System.out.println("Array 2");

        for (int i = 0; i < nums8.length; i++){
            System.out.print(" " + nums9[i]);
        }

    }
}
