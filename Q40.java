
//Create a program to find the sum and average of all elements in an array.

public class Q40 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        long sum = sumOfAllElements(arr);
        float average = averageOfAllElements(arr.length, sum);
        System.out.format("\nSum of All Element is %d", sum);
        System.out.format("\nAverage of All Element is %f", average);
    }

    public static long sumOfAllElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static float averageOfAllElements(int len, long sum) {
        return sum / len;
    }
}
