package moe.cnkirito.spider.javlibrary;

import com.geccocrawler.gecco.GeccoEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class SpiderApplication {

    public static void main(String[] args) {
        System.setProperty("socksProxyHost","127.0.0.1");
        System.setProperty("socksProxyPort","1080");
        SpringApplication.run(SpiderApplication.class, args);
    }
}