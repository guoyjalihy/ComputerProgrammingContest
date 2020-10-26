package exercises;

import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/21 10:09
 */

/*行编辑器(本地验证通过，线上不通过)

题目描述

你知道行编辑器吗？不知道也没关系，现在我会告诉你：
1.如果你收到一个



输入
第一行是一个整数T，代表有T组数据。
每组数据的开始时一个字符串，字符串长度小于100，每个字符一定是(

样例输入
3

whli##ilr#e(s#*s)

outcha@putchar(*s=#++)

returnWA##A!!##C





输出
每组数据输出一行经过行编辑器编辑过的字符串，具体可以看样例。

样例输出
while(*s)

putchar(*s++)

returnAC*/
public class E7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        for (int i = 0; i < total; i++) {
            String result = scanner.next();
            while(result.contains("@")){
                result = result.substring(result.indexOf("@")+1);
            }
            while(result.contains("#")){
                result = result.substring(0,result.indexOf("#")-1) + result.substring(result.indexOf("#")+1);
            }
            System.out.println(result);
        }
    }
}
