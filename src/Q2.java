import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/20 10:01
 */

/*题目描述：
给出一个长度为n的字符串s，请你统计出s的所有长度为k的不同子串数量。长度为k的子串的定义是对于任意1<=l,r<=n，且r-l+1=k，该子串为s[l]s[l+1]s[l+2]…s[r]。

不同的字符串则指的是对于两个字符串t1和t2，存在一个位置x，t1[x]与t2[x]不同。

例如ababa中长度为3的子串有3个aba，bab和aba，不同的子串有两种，即aba和bab。



输入描述
输入第一行包含两个正整数n,k，分别表示字符串的长度，和所求子串的长度。（1<= k <= 10， k <= n <= 100000）

输入第二行包含一个长度为n的字符串，字符串仅包含小写字母。

输出描述
输出仅包含一个整数，即不同子串数量。


样例输入
5 3
ababa
样例输出
2*/
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int subLength = scanner.nextInt();
        String str = scanner.next();
        int num = length-subLength+1;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            String subStr = str.substring(i,subLength+i);
            set.add(subStr);
        }
        System.out.println(set.size());
    }
}
