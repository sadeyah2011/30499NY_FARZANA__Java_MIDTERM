package math_problems;

import java.util.Arrays;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

    int[]firstArray = {30, 12, 5, 9, 2, 20, 33, 1, -15};
    int[]secondArray = {18, 25, 41, 47, 17, 36, 14, 19, -15};
    int fal = firstArray.length;
    int sal =secondArray.length;
    int[] result = new int[fal+sal];
    System.arraycopy(firstArray, 0, result, 0, fal);
    System.arraycopy(secondArray , 0, result, fal, sal);
    System.out.println(Arrays.toString(result));

}
}