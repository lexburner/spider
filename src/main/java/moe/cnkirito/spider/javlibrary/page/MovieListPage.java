package moe.cnkirito.spider.javlibrary.page;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;
import moe.cnkirito.spider.github.bean.Repository;

import java.util.List;

@Data
@Gecco(matchUrl="http://www.javlibrary.com/cn/vl_genre.php?g={category}", pipelines={"movieListPagePipeline"})
public class MovieListPage implements HtmlBean {

    @Request
    private HttpRequest request;

    @RequestParameter("category")
    private String category;

    @RequestParameter("mode")
    private String mode;

    @RequestParameter("page")
    private String page;

    @Text
    @HtmlField(cssPath = ".boxtitle")
    private String categoryName;

    @HtmlField(cssPath = ".videothumblist > .videos > .video")
    private List<MovieListItem> movieListItems;

}
