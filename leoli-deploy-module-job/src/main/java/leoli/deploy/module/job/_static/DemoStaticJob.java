package leoli.deploy.module.job._static;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * SpringBoot 静态定时任务Demo
 * 单线程
 */
//@Component
//@EnableScheduling
public class DemoStaticJob {
    // 0 0/1 * * * ? 每分钟一次
    @Scheduled(cron = "0 0/1 * * * ? ")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5 * 1000)
    private void configureTasks() {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }

}
