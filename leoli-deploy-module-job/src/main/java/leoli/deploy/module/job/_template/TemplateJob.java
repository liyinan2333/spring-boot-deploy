package leoli.deploy.module.job._template;

import leoli.deploy.service.template.JobTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * 基于crontab表达式的通用job模板
 * 使用方法：
 * 1.在Job表中插入一条数据
 * 2.实现自己的JobTemplate子类，并添加注解@Component,@EnableScheduling
 * 3.在exec方法中编写job逻辑
 *
 * @author leoli
 * @date 2020/12/20
 */
@Component
@EnableScheduling
public class TemplateJob extends JobTemplate {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemplateJob.class);

    @Override
    protected void exec() {
        LOGGER.debug("==>this is a template job");
    }

}
