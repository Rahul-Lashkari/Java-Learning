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

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);

        

    }
}
