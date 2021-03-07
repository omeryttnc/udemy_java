package U_98;

import org.junit.Test;

public class Arrays {
    @Test
    public void test01() {
        int[] myIntArray;
        myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        //second way
        int[] mySecondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(mySecondArray[9]);

        //third way for loo

        int[] myThirdArray = new int[10];
        for (int i = 0; i < myThirdArray.length; i++) {
            myThirdArray[i]= i*10;

        }
        printArray(myThirdArray);

    }
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println("element " + i + ", value = " + array[i] );
        }
    }



}
