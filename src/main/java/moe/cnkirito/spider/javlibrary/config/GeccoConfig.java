package moe.cnkirito.spider.javlibrary.config;

import com.geccocrawler.gecco.pipeline.PipelineFactory;
import com.geccocrawler.gecco.spring.SpringPipelineFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeccoConfig {

    @Bean
    PipelineFactory springPipelineFactory(){
        return new SpringPipelineFactory();
    }
}
