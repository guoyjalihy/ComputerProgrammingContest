package exercises;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/20 11:15
 */

/*
时间限制： 4000MS
内存限制： 557056KB
题目描述：
数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。

输入描述
输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。

输出描述
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。

样例输入
81 4
2 2

样例输出
94.73
3.41
*/


public class E2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        double result = 0;
        double value = m;
        for (int i = 0; i < n; i++) {
            result += value;
            value = Math.sqrt(value);
        }
        System.out.println(new Formatter().format("%.2f", result).toString());
    }
}
