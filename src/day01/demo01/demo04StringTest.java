package day01.demo01;
        /*
        霸王，汉军已略地，四面楚歌，
        各将士思念家乡亲人，悲痛万分，士气涣散，
        虞美人为不让霸王你为难，
        决定先您而去，如今已香消玉殒了啊
         */
/*
题目：
定义一个方法，将数组{1,2,3}按照指定格式转换为一个字符串。格式参照如下：[word1#word2#word3].
 */
public class demo04StringTest {
    public static void main(String[] args) {
        String[] array = {"312","dqasda","!@#$%"};
        String array2 = "asd,gdfg,3124";
        String result = fromArrayToString(array);
        System.out.println(result);
        String result2 = formArrayToString2(array2);
        System.out.println(result2);
    }

    public static String fromArrayToString(String[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i != array.length-1)
            str +="word" + array[i] + "#";
            else{
                str += "word" + array[i] + "]";
            }
        }
        return str;
    }

    public static String formArrayToString2(String array){
        String str = "";
        String[] array2 = array.split(",");
        for (int i = 0; i < array2.length; i++) {
            if (i != array2.length)
            str += "word" + array2[i] + "#";
            else{
                str += "word" + array2[i]+"]";
            }
        }

        return str;
    }
}
