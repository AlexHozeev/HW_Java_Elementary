package alex.homework4;

public class Task2 {
    public static void main(String[] args) {
        compareWords();
    }

    public static boolean compareWords() {
        String[] word1 = {"i", "Love", "Ukraine"};
        String[] word2 = {"I", "love", "Ukraine"};
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            str2.append(word1[i]);
        }
        if (str1.toString().equalsIgnoreCase(str2.toString())) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}