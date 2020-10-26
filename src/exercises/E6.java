package exercises;

import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/21 09:11
 */

/*题目描述

一个公交车经过n个站点，乘客从前门上车，从后门下车。

现在统计了在第i个站，下车人数a[i]，以及上车人数b[i]。

问公交车运行时候车上最多有多少乘客

输入
第一行读入一个整数n(1<=n<=100)，表示有n个站点

接下来n行，每行两个数值，分别表示在第i个站点下车人数和上车人数

样例输入
4

0 3

2 5

4 2

4 0

输出
每组输出车上最多的乘客数目

样例输出
6*/
public class E6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stationNum = scanner.nextInt();
        int max = 0;
        int all = 0;
        for (int i = 0; i < stationNum; i++) {
            all += Math.negateExact(scanner.nextInt()-scanner.nextInt());
            if(all > max){
                max = all;
            }
        }
        System.out.println(max);
    }
}
