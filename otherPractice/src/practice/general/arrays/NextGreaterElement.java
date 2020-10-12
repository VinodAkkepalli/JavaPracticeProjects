package practice.general.arrays;

import java.util.Stack;

/**
 * <b>Description</b> : Given an array, print the Next Greater Element (NGE) for every element.
 * The Next greater Element for an element x is the first greater element
 * on the right side of x in array. Elements for which no greater element exist,
 * consider next greater element as -1
 * https://www.geeksforgeeks.org/next-greater-element/
 *
 *
 * @author Vinod Akkepalli
 */
public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 4, 8, 12, 13};
//        int[] arr = {10};
//        int[] arr = {10, 9, 8};
//        int[] arr = {2, 4, 8, 12, 13};

//        printNextGreaterElements(arr);
//        System.out.println();
        printNextGreaterElements2(arr);

    }

    private static void printNextGreaterElements2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;
        if(len < 1) return;

        for (int i = len - 1; i > -1; i--) {
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.println(arr[i] + " -> " + -1);
            } else {
                while (arr[i] > stack.peek()) {
                    stack.pop();
                }
                System.out.println(arr[i] + " -> " + stack.peek());
            }
            stack.push(arr[i]);
        }
    }

    private static void printNextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int len = arr.length;
        if(len < 1) return;

        stack.push(arr[0]);
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
                System.out.println(stack.pop() + " -> " + arr[i]);
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + " -> " + -1);
        }
    }
}
