package dataStructures;

public class insertionSort {


    public static void returnLength(int... arr) {
        System.out.println(arr.length);
    }

    public static void returnEles(int... arr) {
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    public static void isDivisible(int x, int... arr) {
        for (int ele : arr) {
            if (ele % x == 0) {
                System.out.println("yes to ele " + ele + " being divisible by " + x);
            } else {
                System.out.println("nope");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        isDivisible(5, new int[]{5,10,22,30,33});
        isDivisible(2, arr1);
    }

    public insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i] = temp;
            }
        }
    }


    public insertionSort(long[] a) {
        for (int i = 1; i <= a.length; i++) {
           int j = i-1;
           while (j >= 0 && a[i] < a[j]) {
               long temp = a[i];
               a[i] = a[j];
               a[j] = temp;
               j-=1;
           }
        }
    }

    public insertionSort(float[] a) {
        for (int i = 1; i <= a.length; i++) {
            int j = i-1;
            while (j >= 0 && a[i] < a[j]) {
                float temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j-=1;
            }
        }
    }

    public static void backToFront(float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public insertionSort(double[] a) {
        for (int i = 1; i <= a.length; i++) {
            int j = i-1;
            while (j >= 0 && a[i] < a[j]) {
                double temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j-=1;
            }
        }
    }

}
