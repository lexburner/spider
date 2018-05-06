package moe.cnkirito.spider.javlibrary.pipeline;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import moe.cnkirito.spider.javlibrary.page.MovieListPage;

@PipelineName("movieListPagePipeline")
public class MovieListPagePipeline implements Pipeline<MovieListPage> {

    @Override
    public void process(MovieListPage bean) {
        System.out.println(JSON.toJSON(bean));
    }
}