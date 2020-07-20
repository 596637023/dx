package com.dx.commons.others;

import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dx
 * @version 1.0
 * @date 2020/7/17 0017 10:40
 */
public class OthersTest {

    private static volatile  int noSafeInt=0;

    private AtomicInteger safeInt=new AtomicInteger();

    @Test
    public void  testAtomicInteger(){

        for (int i=0;i<10;i++){
            Thread thread=new Thread(()->{
                System.out.println( noSafeInt++);
            });
            thread.start();
        }
        System.out.println(noSafeInt);
//        for (int i=0;i<10;i++){
//            Thread thread=new Thread(()->{
//                System.out.println(safeInt.incrementAndGet());
//
//            });
//            thread.start();
//        }

    }
}
