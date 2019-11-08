package level3;

import java.util.Scanner;
import java.util.Stack;

public class Try {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] c = a.toCharArray();
        for (int i = 0; i < c.length; i++) {
            stack.push(c[i]);
            if (c[i] == '#') {
                if (c[i + 1] == 'b') {
                    stack.pop();
                    stack.pop();
                    i++;
                } else if (c[i + 1] == 'c') {
                    stack.clear();
                    System.out.println(stack);
                    break;
                } else if (c[i + 1] == '0') {
                    System.out.println(stack);
                    stack.pop();
                    System.out.println(stack);
                    System.out.println("已停止输入");
                    System.exit(0);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char h : stack
        ) {
            sb.append(h);
        }

        System.out.println(sb);
    }
}


