package wen.test;
import org.junit.Test;

import java.io.*;
import java.io.File;

/*
 * 读取、写入XML
 * 使用自带的DOM库来操作
 *
 */
public class Demo4XmlTest {

    // 1、尝试去读取resources下的users.xml中的内容
    @Test
    public void ReadFile() throws IOException {

//        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
//        writer.println("The first line");
//        writer.println("The second line");
//        writer.close();


        System.out.print(Demo4XmlTest.class.getClassLoader().getResource("users16.xml"));
//
//        List<String> result = new ArrayList<String>();
//        // 构造文件类
//        File file = new File("resources/users.xml");
//
//        try {
//            // 构造一个BufferedReader类来读取文件
//            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
//            String s = null;
//            while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
//                result.add(s);
//            }
//            br.close();
//            System.out.print(result);
//        } catch (Exception e) {
//            System.out.print(e);
//
//        }
    }



}
