package moe.cnkirito.spider.javlibrary.pipeline;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import moe.cnkirito.spider.javlibrary.page.MovieListPage;

@PipelineName("movieListPagePipeline")
public class MovieListPagePipeline implements Pipeline<MovieListPage> {

    private String javlibrary = "http://www.javlibrary.com";

    @Override
    public void process(MovieListPage bean) {
        DeriveSchedulerContext.into(bean.getRequest().subRequest(javlibrary + bean.getNextPage()));
    }
}