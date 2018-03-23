package moe.cnkirito.spider.pipeline;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import moe.cnkirito.spider.bean.MyGithub;
import moe.cnkirito.spider.common.DomainConstants;

@PipelineName("myGithubPipeline")
public class MyGithubPipeline implements Pipeline<MyGithub> {

    @Override
    public void process(MyGithub bean) {
        System.out.println(JSON.toJSON(bean));
        if (bean.getRepositorys() != null && bean.getRepositorys().size() > 0) {
            bean.getRepositorys().forEach(repository -> {
                //爬取每个仓库 /lexburner/lexburner.github.io
                DeriveSchedulerContext.into(bean.getRequest().subRequest(DomainConstants.GITHUB + repository.getHref()));
            });
        }
    }
}