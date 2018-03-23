package moe.cnkirito.spider.bean;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-03-23
 */
@Data
@Gecco(matchUrl="https://github.com/{user}/{repository}", pipelines={"repositoryDetailPipeline"})
public class RepositoryDetail implements HtmlBean {

    @RequestParameter("user")
    private String user;

    @RequestParameter("repository")
    private String repository;
    @Text
    @HtmlField(cssPath = ".pagehead-actions li:nth-child(1) .social-count")
    private String watch;
    @Text
    @HtmlField(cssPath = ".pagehead-actions li:nth-child(2) .social-count")
    private String star;
    @Text
    @HtmlField(cssPath = ".pagehead-actions li:nth-child(3) .social-count")
    private String fork;


}
