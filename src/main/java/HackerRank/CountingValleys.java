package HackerRank;

import java.io.*;

import static java.util.stream.Collectors.joining;

class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        char[] pathChar = path.toCharArray();
        int noOfValley=0;
        int seaLevel = 0;
        boolean valleyStart = false;
        for(int i=0; i<steps; i++){
            if(seaLevel==0 && valleyStart){
                noOfValley++;
                valleyStart = false;
            }
            if(pathChar[i]=='D'){
                if(seaLevel == 0){
                    valleyStart = true;
                }
                seaLevel--;
            }else{
                seaLevel++;
            }
        }
        if(valleyStart){
            noOfValley++;
        }
        return noOfValley;
    }




    public static void main(String[] args) throws IOException {


        int steps = 8;

        String path = "UDDDUDUU";

        int result = CountingValleys.countingValleys(steps, path);

        System.out.print(result);
    }
}

