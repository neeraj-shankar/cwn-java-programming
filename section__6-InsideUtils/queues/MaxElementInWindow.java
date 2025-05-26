/*
 * Given an array and a window size K, find the maximum element for each window.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxElementInWindow {

    public static ArrayList<Integer> solution(int[] A, int B){

        Deque<Integer> deque = new ArrayDeque<>();

        // Insert the probable max of first window into deque
        for (int i=0; i<B;i++){

            while (deque.size()>0 && A[i]>deque.getLast()) {
                deque.removeLast();
            }
            deque.addLast(null);(A[i]);
        }
    }
    
}
