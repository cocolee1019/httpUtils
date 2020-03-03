package test;

import utils.HttpUtils;

import java.net.URISyntaxException;

/**
 * @author ljj
 * 2019/12/5 09:23
 */
public class Main {

    public static void main(String[] args) throws URISyntaxException {

        String resp;

       /* //发送一个Get请求
        resp = HttpUtils.generateRequest("http://ip.cn", 80, "/").doGet();
        System.out.println(resp);


        //添加header，模拟浏览器代理，返回html
        resp = HttpUtils.generateRequest("http://ip.cn:80/")
                                  .addHeader("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
                                  .doGet();

        System.out.println(resp);*/

        //添加header，模拟浏览器代理，返回html
        resp = HttpUtils.generateRequest("https://www.baidu.com")
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
                .doGet();

        System.out.println(resp);
    }
}
