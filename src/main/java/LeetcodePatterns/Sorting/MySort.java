package LeetcodePatterns.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySort {

    public static void main(String[] args){

        System.out.println(sortList(Arrays.asList(5,3,1,2,4)));
    }

    public static List<Integer> sortList(List<Integer> unsortedList) {
        // WRITE YOUR BRILLIANT CODE HERE
        for(int i=0; i< unsortedList.size()-1; i++){
            for(int j=i+1; j< unsortedList.size(); j++){
                if(unsortedList.get(i)> unsortedList.get(j)){
                    int val = unsortedList.get(j);
                    unsortedList.set(j, unsortedList.get(i));
                    unsortedList.set(i, val);
                }
            }
        }
        return unsortedList;
    }
}
