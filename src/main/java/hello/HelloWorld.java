package hello;

import org.joda.time.LocalTime;
/*
2022.06.13 라이브버리 임포트 할때 단축키 : 옵션+엔터
 */
public class HelloWorld {
    public static void main(String[] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is :"+ currentTime);

        Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
    }
}
