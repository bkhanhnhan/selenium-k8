package lesson_06;

import java.util.Arrays;

public class StringLearning2 {

    public static void main(String[] args) {

        String badWordsContainer = "  bad, very bad, something else  ";
        String filteredString = badWordsContainer.replace("bad","b**");
        System.out.println(filteredString);
        System.out.println(badWordsContainer.trim());

        String url = "https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));
        System.out.println(url.indexOf("https"));

        System.out.println(url.contains("https"));

        String[] splitStr = url.split("");
        System.out.println(Arrays.toString(splitStr));
    }
}
