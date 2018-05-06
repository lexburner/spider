package moe.cnkirito.spider.javlibrary.page;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

@Data
public class MovieListItem implements HtmlBean{

    @Attr("href")
    @HtmlField(cssPath = "div > a")
    private String href;
    @Text
    @HtmlField(cssPath = "div > a > .title")
    private String title;
    @Text
    @HtmlField(cssPath = "div > a > .id")
    private String id;
    @Attr("src")
    @HtmlField(cssPath = "div > a > img")
    private String imgSrc;

}
