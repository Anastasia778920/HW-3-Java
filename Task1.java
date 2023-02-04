import java.util.Random;
import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = randomArr(); 
        int[] result = mergesort(arr1);
        System.out.println(Arrays.toString(result));
    }
    public static int[] randomArr() {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }

    public static int[] mergesort(int[] arr1) {
        int[] buffer1 = Arrays.copyOf(arr1, arr1.length); 
        int[] buffer2 = new int[arr1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, arr1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sort1 = mergesortInner(buffer1, buffer2, startIndex, middle); 
        int[] sort2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sort1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sort1[index1] < sort2[index2]
                    ? sort1[index1++]
                    : sort2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sort1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sort2[index2++];
        }
        return result;
    }
}
