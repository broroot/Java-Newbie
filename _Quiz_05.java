package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoesSize = new int[10];
        int j = 250;
        for (int i = 0; i < shoesSize.length; i++) {
            shoesSize[i] = j;
            j += 5;
        }
        for (int size : shoesSize) {
            System.out.println(size);
        }
    }
}
