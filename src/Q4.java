import java.util.Scanner;

/**
 * @Description:
 * @Auther: guoyanjun
 * @Date: 2020/10/20 10:01
 */

/*题目描述：
        X星人最近发明了一种暗语，在这套暗语中只包含两种字符A和B。

        暗语中的“AB”串据说表示心情好，“AB”串连续重复次数越多表示X星人越开心。

        现在给你一串X星人的暗语，请计算最长连续重复AB串的长度。

        例如暗语“ABBABABABBAAB”中最长连续重复AB串的长度为6，即第4个到第9个字符。
ABBABABABBAABABABABBA


        输入描述
        单组输入，输入数据占1行，包含一串X星人的暗语，其长度不超过100000个字符。

        输出描述
        输出占1行，包含一个整数，表示最长连续重复AB串的长度。*/
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        int result = 0;
        int maxResult = 0;
        for (int i = 0; i < chars.length; i++) {
            if ( i+1 < chars.length && 'A'== chars[i] && 'B'== chars[i+1]){
                result +=2;
                i++;
            }else{
                if (result > maxResult){
                    maxResult = result;
                }
                result = 0;
            }
        }
        System.out.println(maxResult);
//        int beginIndex = line.indexOf("AB");
//        if(beginIndex == -1){
//            System.out.println(0);
//            return;
//        }
//        int result = 1;
//        int maxResult = result;
//        line = line.substring(beginIndex+2);
//        while(line.length()>1) {
//            if (line.indexOf("AB") == 0) {
//                result++;
//                line = line.substring(beginIndex + 2);
//            } else {
//                if (result > maxResult){
//                    maxResult = result;
//                }
//                result = 0;
//                line = line.substring(beginIndex + 1);
//            }
//        }
//        System.out.println(maxResult*2);
    }
}
