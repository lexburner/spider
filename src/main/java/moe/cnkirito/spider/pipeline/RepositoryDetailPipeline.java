package moe.cnkirito.spider.pipeline;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import moe.cnkirito.spider.bean.MyGithub;
import moe.cnkirito.spider.bean.RepositoryDetail;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-03-23
 */
@PipelineName("repositoryDetailPipeline")
public class RepositoryDetailPipeline implements Pipeline<RepositoryDetail> {

    @Override
    public void process(RepositoryDetail bean) {
        System.out.println(JSON.toJSON(bean));
    }
}
