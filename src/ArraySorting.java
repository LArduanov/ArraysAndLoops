import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arrayname = {22,11,4,8,6,5,18,52,64,8,1,0,10,100};
        System.out.println("Не отсортированный массив:");
        System.out.println(Arrays.toString(arrayname));
        int s = 0;
        for (int i = arrayname.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayname[j] > arrayname[j + 1]) {
                    s = arrayname[j];
                    arrayname[j] = arrayname[j + 1];
                    arrayname[j + 1] = s;
                }
            }
        }
        System.out.println();
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arrayname));
    }
}
