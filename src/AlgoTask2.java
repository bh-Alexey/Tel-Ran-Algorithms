import java.util.concurrent.ThreadLocalRandom;

public class AlgoTask2 {
    public static void main(String[] args) {
        int arrayLength = 10;                            // 1
        int [] arrayFirst = arrayInit(arrayLength);      // 10
        int max1st = arrayMaxElement(arrayFirst);        // 1
        arrayLength = arrayLength * 2;                   // 1
        int [] arraySecond = arrayInit(arrayLength);     // 20
        int max2nd = arrayMaxElement(arraySecond);       // 1

    }
    public static int [] arrayInit(int arrayLength) {
        int[] array = new int[arrayLength];                     // 1
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt();   // n
        }
       return array;                                            // 1
    }
    public static int arrayMaxElement(int[] unsortArray) {
        int maxElement = unsortArray[0];                        // 1
        for (int i = 0; i < unsortArray.length; i++) {
            if (unsortArray[i] > maxElement) {
                maxElement = unsortArray[i];                    // n
            }
        }
        return maxElement;                                      // 1
    }
}

//O(1 + n + 1) = O(n) - Zavisimist' ot vhodnyh dannyh lineynaya. Kakoy razmer massiva, stolko i kol-vo uteraciy