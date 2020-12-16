package leoli.deploy.module.job._dynamic;

import leoli.deploy.service.bean.po.JobPo;
import leoli.deploy.service.data.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * SpringBoot 动态定时任务Demo
 */
@Configuration
@EnableScheduling
public class DemoDynamicJob implements SchedulingConfigurer {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoDynamicJob.class);

    @Autowired
    JobRepository repository;

    @Override
    public void configureTasks(ScheduledTaskRegistrar register) {
        register.addTriggerTask(() -> {
            // job runnable
            System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime());
        }, context -> {
            // job cron
            JobPo example = new JobPo();
            example.setEnabled("1");
            example.setClsNm(DemoDynamicJob.class.getCanonicalName());
            Optional<JobPo> optional = repository.findOne(Example.of(example));
            if (optional.isPresent()) {
                return new CronTrigger(optional.get().getCron()).nextExecutionTime(context);
            } else {
                LOGGER.warn("==>Dynamic job load failure, that class mabe not regist in leoli-app-deploy.job==>[class={}]", example.getClsNm());
                return null;
            }
        });
    }
}
