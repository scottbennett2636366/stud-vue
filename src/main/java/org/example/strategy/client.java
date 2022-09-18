package org.example.strategy;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Timer;

public class client {
    public static void main(String[] args) {
//        Duck duck = new Duck(new FlyBehaviourOne(), new QuackBehaviourTwo());
//        duck.Fly();
//        duck.quack();
        LocalDateTime now = LocalDateTime.now();
        System.out.println(Timestamp.valueOf(now).getTime());
//        System.out.println(now);Ï
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println("输出了" + i + "行");
//        }
    }
}
