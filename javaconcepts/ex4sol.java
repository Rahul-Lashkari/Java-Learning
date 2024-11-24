package javaconcepts;

public class ex4sol {
    public static void main(String[] args) {

        // Problem 1 - Reverse Words
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed Sentence: " + reversed.toString().trim());
    }
}
