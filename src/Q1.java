import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/20 10:01
 */

/*题目描述：
小明用计算机随机生成了N个正整数，他希望从这N个数中选取若干个数，使得它们的和等于M。这些随机生成的数字可能会相同，但是每个数字最多只允许使用一次。

当然这样的选取方案可能不存在，也可能有多个。

现在希望你编写一个程序，能够找出数字个数最少的选取方案，输出对应的最少数字的个数，如果无解输出“No solution”。



输入描述
单组输入，每组输入2行。

第1行包含两个正整数N和M，分别表示初始输入的正整数个数和目标数字和(N<=1e3, M<=1e5)。

第2行为N个正整数，两两之间用空格隔开(每一个正整数均小于等于1e5)。

输出描述
输出数字个数最少的选取方案中所包含的最少数字个数，如果无解输出“No solution”。


样例输入
5 5
1 3 2 1 1
样例输出
2*/
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        //剩余空间-当前价值
        int[][] result = new int[sum][sum];
        int sy = sum;
        int curr = 0;

        for (int i = 0; i < num; i++) {
            //放
            sy -= arr[i];
            curr += arr[i];
            //不放
        }
        System.out.println();
    }
}
