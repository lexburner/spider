package moe.cnkirito.spider.javlibrary.config;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.spring.SpringGeccoEngine;
import org.springframework.stereotype.Service;

@Service
public class InitGecco extends SpringGeccoEngine {

    @Override
    public void init() {
        GeccoEngine.create()
        .pipelineFactory(springPipelineFactory)
        .classpath("moe.cnkirito.spider.javlibrary")
        .start("http://www.javlibrary.com/cn/vl_genre.php?g=i4")
        .interval(3000)
        .thread(10)
        .start();
    }

}