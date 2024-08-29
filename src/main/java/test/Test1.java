package test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //stack.push(1);
        List li = Arrays.asList(123, 1212);

        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());
        String columnTitle = "908080";
        int sum = 0;
        int index = 0;
        int length = columnTitle.length();
        while (index < length) {
            char c = columnTitle.charAt(index);
            sum = sum * 26 + (c - 'A' + 1);
        }

    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    subList.add(1);
                } else {
                    subList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(subList);
        }
        return list;

    }


}

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.pop();
        }

    }

    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();

    }
}

