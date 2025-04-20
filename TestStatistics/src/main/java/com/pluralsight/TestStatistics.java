package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {
        int[] testScores = {20, 78, 56, 100, 91, 38, 66, 40, 83, 12};
        double lowScores = 0;
        double averageScores = 0;
        double highScores = 0;
        int median = 0;
        int numOfValue = 0;
        for(int testScore : testScores) {

            if(testScore < 50) {
                lowScores++;
            } else if (testScore >= 50 && testScore <= 80) {
                averageScores++;
            } else {
                highScores++;
            }
        }

        lowScores = (lowScores / testScores.length) * 100;
        averageScores = (averageScores / testScores.length) * 100;
        highScores = (highScores / testScores.length) * 100;

        Arrays.sort(testScores);
        if(testScores.length % 2 == 0) {
            median =
                    ((testScores[(testScores.length / 2) - 1] + testScores[((testScores.length / 2) + 1) - 1]) / 2);

        }else {
             numOfValue = ((testScores.length + 1)/ 2);
             median = testScores[numOfValue - 1];
        }

        System.out.printf("%.1f%% of scores were low scores%n", lowScores);
        System.out.printf("%.1f%% of scores were average scores%n", averageScores);
        System.out.printf("%.1f%% of scores were high scores%n", highScores);
        System.out.printf("The median is %d", median);
    }
}
