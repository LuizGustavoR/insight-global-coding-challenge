package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String input1 = "abcbc12323";
        String input2 = "JavaProgram()";

        String output1 = RemoveDuplicates.removeDuplicates(input1);
        String output2 = RemoveDuplicates.removeDuplicates(input2);

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + output1);

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + output2);

    }

    public static class RemoveDuplicates {

        public static String removeDuplicates(String input) {
            List<Character> uniqueList = new ArrayList<>();
            StringBuilder result = new StringBuilder();

            // Add only the unique chars
            for (char ch : input.toCharArray()) {
                if (!uniqueList.contains(ch)) {
                    uniqueList.add(ch);
                }
            }

            // Convert the list to string builder
            for (Character character : uniqueList) {
                result.append(character);
            }

            return result.toString();
        }

    }

}
