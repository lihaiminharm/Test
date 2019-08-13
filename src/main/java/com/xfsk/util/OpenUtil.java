package com.xfsk.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 获取Openid
 *
 * @version: 1.0
 * @Author: lhm
 * @Create Date: 2019-08-05
 */
public class OpenUtil {
    public static String sendGet(String url, String charset, int timeout) {
        String result = "";
        try {
            //处理资源定位符 网址从参数url获取
            URL u = new URL(url);
            try {
                //打开url网址
                URLConnection conn = u.openConnection();
                //连接网址
                conn.connect();
                //设置连接的时间
                conn.setConnectTimeout(timeout);
                //获取输入流进入缓冲并且设置为utf-8的编码格式
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
                //长度
                String line = "";

                while ((line = in.readLine()) != null) {
                    //保存输入流中的数据到result
                    result = result + line;
                }
                //关闭输入流流
                in.close();
            } catch (IOException e) {
                return result;
            }
        }   catch (MalformedURLException e) {
            return result;
        }

        return result;
    }
}
