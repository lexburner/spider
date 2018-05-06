package moe.cnkirito.spider.javlibrary;

import com.geccocrawler.gecco.GeccoEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpiderApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpiderApplication.class, args);
        GeccoEngine.create()
                //工程的包路径
                .classpath("moe.cnkirito.spider.javlibrary")
                //开始抓取的页面地址
                .start("http://www.javlibrary.com/cn/genres.php")
                //开启几个爬虫线程
                .thread(1)
                //        //单个爬虫每次抓取完一个请求后的间隔时间
                //        .interval(2000)
                //        //循环抓取
                //        .loop(true)
                //使用pc端userAgent
                .mobile(false)
                //非阻塞方式运行
                .start();
    }
}
