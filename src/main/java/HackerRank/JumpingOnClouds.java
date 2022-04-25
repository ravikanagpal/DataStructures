package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int count = -1;
        int n = c.size();
        for (int i = 0; i < n; i++, count++) {
            if (i<n-2 && c.get(i+2)==0) i++;
        }
        return count;
    }

}

public class JumpingOnClouds {
    public static void main(String[] args) throws IOException {


        List<Integer> c = new ArrayList<>(Arrays.asList(0,0,1,0,0,0,0,1,0,0));

        System.out.println(Result.jumpingOnClouds(c));




    }
}
