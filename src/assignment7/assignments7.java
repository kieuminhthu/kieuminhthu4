
package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class assignments7 {
public class Assignment7 {
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.println("Mảng là: " + Arrays.toString(arrays));
    }

    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE, max2 = Float.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max1) {
                max2 = max1;
                max1 = arrays[i];
            } else if (arrays[i] > max2 && arrays[i] != max1) {
                max2 = arrays[i];
            }
        }
        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if ((int) arrays[i] % 2 == 0) {
                count++;
            }
        }
        float[] newArray = new float[count];
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if ((int) arrays[i] % 2 == 0) {
                newArray[index++] = arrays[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        float[] arrays = new float[n];

        arrays = importData(arrays);

        System.out.println("Mảng sau khi nhập:");
        printData(arrays);

        float max2 = findMax2(arrays);
        System.out.println("Phần tử lớn thứ 2 trong mảng là: " + max2);

        arrays = deleteOddNumber(arrays);
        System.out.println("Mảng sau khi xóa các phần tử lẻ:");
        printData(arrays);
    }
}
    
}
