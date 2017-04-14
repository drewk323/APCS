public class ArrayAlgorithms {
    public static void main(String[] args) {
        /** Fill an array with squares from zero to 10 */
        int[] nums1 = new int[11];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i * i;
            System.out.print(nums1[i] + " ");
        }

        System.out.println(""); // Separator

        /** Find sum and average of an array containing random numbers */
        int[] nums2 = {1, 7, 8, 4, 2, 3, 6, 5, 11};
        int sum = 0;

        for (int num : nums2) {
            sum += num;
            System.out.print(sum + " ");
        }
        System.out.println(""); //Separator

        int average = 0;
        average = sum / nums2.length;

        System.out.print("Average: " + average);

        System.out.println(""); //Separator
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
    /** Print elements with a separator */

        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8};
            for(int num: nums4){
                System.out.print(" : ");
                System.out.print(nums4[num]);
            }

    }
}
