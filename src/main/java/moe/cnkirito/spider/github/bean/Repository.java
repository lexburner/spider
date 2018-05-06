package moe.cnkirito.spider.github.bean;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-03-23
 */
@Data
public class Repository implements HtmlBean {

    @Text
    @HtmlField(cssPath = "div > h3 > a")
    private String repositoryName;

    @Attr("href")
    @HtmlField(cssPath = "div > h3 > a")
    private String href;

}
