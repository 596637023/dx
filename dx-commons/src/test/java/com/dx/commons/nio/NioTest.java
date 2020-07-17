package com.dx.commons.nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author dx
 * @version 1.0
 * @date 2020/7/13 0013 15:47
 */
public class NioTest {


    @Test
    public void testSpeed() throws Exception {
        readFileByNio();
        readFileByBio();
    }

    @Test
    public void readFileByNio() {
        FileInputStream inputStream = null;
        try {
            URL resource = this.getClass().getClassLoader().getResource("file/0119.log");
            inputStream = new FileInputStream(resource.getFile());
            FileChannel fileChannel = inputStream.getChannel();
            int capacity = 1024;
            ByteBuffer bf = ByteBuffer.allocate(capacity);
            int len = -1;
            System.out.println("限制:" + bf.limit() + "容量:" + bf.capacity() + "位置:" + bf.position());
            while ((len = fileChannel.read(bf)) != -1) {
                bf.clear();
                byte[] bytes = bf.array();
                System.out.println("start...............");
                String str = new String(bytes, 0, len, "UTF-8");
                System.out.println(str);
                System.out.println("end.................");
                System.out.println("限制:" + bf.limit() + "容量:" + bf.capacity() + "位置:" + bf.position());
            }
            fileChannel.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void readFileByBio() throws IOException {
        Long start = System.currentTimeMillis();
        FileInputStream in = null;
        try {
            in = new FileInputStream("D:\\paopfile\\yunguan\\10\\0119.log");
            byte[] ff = new byte[1024];
            while (in.read(ff) != -1) {

            }
        } catch (Exception e) {

        } finally {
            in.close();
        }


        System.out.println("bio消耗消耗时间:" + (System.currentTimeMillis() - start) + "毫秒");
    }
}
