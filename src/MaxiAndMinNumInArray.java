public class MaxiAndMinNumInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7};
        int max = array[0]; // Assume the first element is the initial max
        int min = array[0]; // Assume the first element is the initial min

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Your max is " + max);
        System.out.println("Your min is " + min);
    }
}
