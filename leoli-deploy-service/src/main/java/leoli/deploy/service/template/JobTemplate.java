package leoli.deploy.service.template;

import leoli.deploy.service.api.SpringContextApi;
import leoli.deploy.service.bean.po.JobPo;
import leoli.deploy.service.data.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.Optional;

import static org.springframework.scheduling.config.ScheduledTaskRegistrar.CRON_DISABLED;

/**
 * Job parent
 */
public abstract class JobTemplate implements SchedulingConfigurer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobTemplate.class);

    @Override
    public void configureTasks(ScheduledTaskRegistrar register) {
        String cron = getCron();
        register.addCronTask(() -> {
            exec();
        }, cron);
        LOGGER.info("==>Load job [class={}, cron={}]", this.getClass().getCanonicalName(), cron);

    }

    private String getCron() {
        // job cron
        JobPo example = new JobPo();
        example.setEnabled("1");
        example.setClsNm(this.getClass().getCanonicalName());
        JobRepository repository = SpringContextApi.getContext().getBean(JobRepository.class);
        Optional<JobPo> optional = repository.findOne(Example.of(example));
        if (optional.isPresent()) {
            return optional.get().getCron();
        } else {
            LOGGER.info("==>Job is not enabled or exist==>[class={}]", this.getClass().getCanonicalName());
            return CRON_DISABLED;
        }
    }

    protected abstract void exec();

}
