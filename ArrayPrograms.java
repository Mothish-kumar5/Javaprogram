package Assessments;

import java.util.Scanner;

public class ArrayPrograms {
    public static void main(String[] args) {

        // 1. Create an array of 5 integers and print all elements
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 2. Take 10 numbers as input
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        // 3. Print first element
        System.out.println(numbers[0]);

        // 4. Print last element
        System.out.println(numbers[numbers.length - 1]);

        // 5. Change index 3 to 100
        numbers[3] = 100;

        // 6. Find length
        System.out.println(numbers.length);

        // 7. Take index and print element
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.println(numbers[index]);

        // 8. Replace first element with 0
        numbers[0] = 0;

        // 9. Replace last element with -1
        numbers[numbers.length - 1] = -1;

        // 10. Print using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print using for-each loop
        System.out.println();
        for (int x : numbers) {
            System.out.print(x + " ");
        }
    }
}
