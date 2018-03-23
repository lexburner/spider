package moe.cnkirito.spider.bean;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

@Data
@Gecco(matchUrl="https://github.com/{user}?tab=repositories", pipelines={"myGithubPipeline"})
public class MyGithub implements HtmlBean {

    private static final long serialVersionUID = -7127412585200687225L;

    @Request
    private HttpRequest request;
    
    @RequestParameter("user")
    private String user;//url中的{user}值

    @Text
    @HtmlField(cssPath = "span.p-name.vcard-fullname.d-block.overflow-hidden")
    private String name;

    @Text
    @HtmlField(cssPath = "span.p-nickname.vcard-username.d-block")
    private String nickname;

    @HtmlField(cssPath = "#user-repositories-list ul li")
    private List<Repository> repositorys;

}