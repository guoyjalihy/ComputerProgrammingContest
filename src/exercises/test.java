package exercises;

import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/21 10:57
 */

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String line = in.next();
            char[] ch = line.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char c : ch) {
                if(c=='#') {
                    if(sb.length()>0) {
                        sb.deleteCharAt(sb.length()-1);
                    }
                } else if(c=='@') {
                    sb.delete(0, sb.length());
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
        in.close();
    }
}
