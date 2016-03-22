import java.util.Arrays;

/**
 Дано 3 массива чисел. С помощью 1-2-х циклов найти
 сумму элементов во всех массивах
 */
public class TaskThree {
    private static int sumOfArrays(int[] array1, int[] array2, int[] array3){
        int sum = 0;

        int length = array1.length;
        if (length < array2.length){
            length = array2.length;
        }
        if (length < array3.length){
            length = array3.length;
        }

        for (int i = 0; i < length; i++){
            if (i < array1.length){
                sum += array1[i];
            }
            if (i < array2.length){
                sum += array2[i];
            }
            if (i < array3.length){
                sum += array3[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] array1 = RandIntArr.arrayRand(10, 100);
        int[] array2 = RandIntArr.arrayRand(15, 100);
        int[] array3 = RandIntArr.arrayRand(20, 100);

        System.out.println("Initial array 1: " + Arrays.toString(array1));
        System.out.println("Initial array 2: " + Arrays.toString(array2));
        System.out.println("Initial array 3: " + Arrays.toString(array3));

        System.out.print("Result: " + sumOfArrays(array1, array2, array3));
    }
}
