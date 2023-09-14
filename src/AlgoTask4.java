import java.util.Arrays;

public class AlgoTask4 {

//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
// который будет находиться на k-й позиции в конечном отсортированном массиве.
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256
//Окончательный отсортированный массив -
//72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//7-й элемент этого массива равен 256.

    public static void main(String[] args) {
        int[] firstArray = {100, 112, 256, 349, 770};               // m
        int[] secondArray = {172, 86, 113, 119, 265, 445, 892};     // n
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < thirdArray.length; i++) {
            if (i > firstArray.length - 1) {
                thirdArray[i] = secondArray[i - firstArray.length];
            }
            else {
                thirdArray[i] = firstArray[i];
            }
        }
        Arrays.sort(thirdArray);                                    //Окончательный отсортированный массив
        int k = 7;                                                  //7-й элемент этого массива, должен быть равен 256
        int result = 0;
        for (int i = 0; i < thirdArray.length; i++) {
            if (i < k) {
                result = thirdArray[i];;
            }
            else {
               break;
            }
        }
        System.out.println(result);
    }

}
