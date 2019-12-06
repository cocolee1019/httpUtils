### 一、如何使用
#### 1.1 获取源码
 将HttpUtils.java和RetryHandler.java拷入项目相应的包下。源码从github获取。

#### 2.2、引入基础配置
```
<dependencies>
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.6</version>
        </dependency>

        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.11.2</version>
        </dependency>
</dependencies>
```

### 二、使用范例
```java
public class Main {

    public static void main(String[] args) throws URISyntaxException {

        String resp;

        //发送一个Get请求
        resp = HttpUtils.generateRequest("http://ip.cn", 80, "/").doGet();
        System.out.println(resp);


        //添加header，模拟浏览器代理，返回html
        resp = HttpUtils.generateRequest("http://ip.cn:80/")
                                  .addHeader("user-agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
                                  .doGet();
        System.out.println(resp);
    }
}
```