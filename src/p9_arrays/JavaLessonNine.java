package p9_arrays;

import java.util.Arrays;

public class JavaLessonNine {


    public static void main(String[] args) {


        int[] randomArray;
        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 2;
        String[] stringArray = {"just", "random", "words"};

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 1;
        while (k <= 41) {
            System.out.println("-");
            k++;
        }
        System.out.println();
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("| " + i + " ");

        }
        System.out.println("|");

        String[][] multiArray = new String[10][10];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }

        k = 1;
        while (k <= 61) {
            System.out.println("-");
            k++;
        }
        System.out.println();

        // Prints out a multidimensional array with the values being the indexes
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("| " + multiArray[i][j] + " ");
                ;
            }
            System.out.println("|");
        }

        for (int row : numberArray) {
            System.out.print(row);
        }
        System.out.println();

        for (String[] row : multiArray) {
            for (String column : row) {
                System.out.print("| " + column + " ");
            }
            System.out.println("|");
        }

        int[] numberCompy = Arrays.copyOf(numberArray, 5);

        for (int row : numberCompy) System.out.println(row);

        System.out.println(Arrays.toString(numberArray));

        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2);

        char[] [] boardGame = new char[10][10];
        for (char[] row : boardGame){
            Arrays.fill(row,'*');
        }

        int[] numToSort = new int[10];
        for (int i = 0; i < 10; i++) {
            numToSort[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(numToSort);
        System.out.println(Arrays.toString(numToSort));

        int whereIs50 = Arrays.binarySearch(numToSort,50);
        System.out.println(whereIs50);

    }


}
