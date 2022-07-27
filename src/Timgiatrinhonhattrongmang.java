public class Timgiatrinhonhattrongmang {
        public static int minValue(int[] array) {
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }
            return index;
        }

        public static void main(String[] args) {
            // write your code here
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
            int index = minValue(arr);
            System.out.println("The smallest element in the array is: " + arr[index]);
        }
    }

