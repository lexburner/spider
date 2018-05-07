package moe.cnkirito.spider.javlibrary.pipeline;

import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import ma.glasnost.orika.MapperFacade;
import moe.cnkirito.spider.javlibrary.model.Video;
import moe.cnkirito.spider.javlibrary.model.VideoRepository;
import moe.cnkirito.spider.javlibrary.page.MovieListPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieListPagePipeline")
public class MovieListPagePipeline implements Pipeline<MovieListPage> {

    private String javlibrary = "http://www.javlibrary.com";
    @Autowired
    VideoRepository videoRepository;
    @Autowired
    MapperFacade mapperFacade;

    @Override
    public void process(MovieListPage bean) {
        DeriveSchedulerContext.into(bean.getRequest().subRequest(javlibrary + bean.getNextPage()));
        List<Video> videos = mapperFacade.mapAsList(bean.getMovieListItems(), Video.class);
        videoRepository.save(videos);
    }
}