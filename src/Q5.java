import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/20 10:01
 */
/*题目描述：
小明很久很久没有爬过山了，这一天终于爬上了著名的X峰。站在X峰山顶，远处山峦叠嶂，让人感到心旷神怡。

小明看着远处一座座高山，突发奇想。如果按照从左到右的顺序告诉你n座山峰的海拔高度，最少去掉几座山峰，可以让剩下的山峰从左到右能够按照从矮到高的顺序排列呢？

【输入保证每一座山峰的海拔高度都不一样】。



输入描述
单组输入，输入占两行。

第1行一个正整数表示山峰数量n（n<=1e5，山峰高度<=1e5）。

接下来一行是n座山峰的高度，全部为正整数，两个数字之间用空格隔开。

输出描述
输出最少需要去掉的山峰数量。


样例输入
5
1265 2368 3474 2170 3982
样例输出
1*/
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        int lastNum = 0;
        int result = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > lastNum){
                lastNum = arr[i];
            }else {
                result++;
            }
        }
        System.out.println(result);
    }
}
