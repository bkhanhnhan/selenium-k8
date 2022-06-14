package lab_06;

import java.util.Arrays;

public class URLParts {

    public static void main(String[] args) {

        String url = "https://google.com";

        System.out.println("URL Protocol is: " + url.substring(0,url.indexOf(":")));
        System.out.println("URL Domain is: " + url.substring(url.indexOf(".")));
    }
}
