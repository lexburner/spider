package moe.cnkirito.spider.javlibrary.pipeline;

import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import ma.glasnost.orika.MapperFacade;
import moe.cnkirito.spider.javlibrary.model.Movie;
import moe.cnkirito.spider.javlibrary.model.MovieRepository;
import moe.cnkirito.spider.javlibrary.page.MovieListPage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("movieListPagePipeline")
public class MovieListPagePipeline implements Pipeline<MovieListPage> {

    private String javlibrary = "http://www.javlibrary.com";
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    MapperFacade mapperFacade;

    @Override
    public void process(MovieListPage bean) {
        DeriveSchedulerContext.into(bean.getRequest().subRequest(javlibrary + bean.getNextPage()));
        List<Movie> movies = mapperFacade.mapAsList(bean.getMovieListItems(), Movie.class);
        movieRepository.save(movies);
    }
}