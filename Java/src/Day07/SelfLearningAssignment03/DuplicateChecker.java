/*

1.Throw Exception for Duplicate Integers
Write a Java program that reads a list of integers
from the user and throws an exception if any numbers
are duplicates.
*/

package Day07.SelfLearningAssignment03;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateChecker {

    public static void main(String[] args) throws java.lang.Exception {
        ArrayList<Integer> listOne = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter item " + i + ": ");
            listOne.add(sc.nextInt());
        }


        for (int i = 0; i < listOne.size(); i++) {
            for (int j = i + 1; j < listOne.size(); j++) {

                    if (listOne.get(i).equals(listOne.get(j))) {
                        throw new java.lang.Exception("Error: Duplicate number found: " + listOne.get(i));
                    }
                }
            }
            System.out.println("No duplicates: " + listOne);
        }
    }
