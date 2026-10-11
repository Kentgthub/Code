/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
import java.util.Arrays;
public class Advance {
    public static void main(String[] args) {
        
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80};
        int target = 92;
        int index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Score " + target
                    + " found at index " + index);
        } else {
            System.out.println("Score " + target + " was not found.");
        }

        // Sort a COPY so the original order remains unchanged.
       
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        // Print both arrays
        System.out.println("Original scores: "
                + Arrays.toString(scores));
        System.out.println("Sorted scores: "
                + Arrays.toString(sortedScores));
    }
    }

