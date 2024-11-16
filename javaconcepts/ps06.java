package javaconcepts;

public class ps06 {
    public static void main(String[] args) {
        // Practice Problem 1
        /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum); */

        // Practice Problem 2
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 42.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        } */

        // Practice Problem 3

        /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);
*/

        // Practice Problem 4

        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2, 6, 13},
                         {3,7,1}};
        int [][] result = {{0, 0, 0},
                           {0,0,0}};

        for(int i=0; i<mat1.length; i++){ //row number of times
            for(int j=0; j<mat1[i].length; j++){ // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for(int i=0; i<result.length; i++) { //row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints new line
        }
    }
}
