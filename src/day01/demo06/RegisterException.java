package day01.demo06;
/*自定义异常类
*   添加一个空参数构造方法
*   添加一个带异常信息的构造方法
* */
public class RegisterException extends Exception{

    public RegisterException(){
        super();
    }
    public RegisterException(String s){
        super(s);
    }
}
