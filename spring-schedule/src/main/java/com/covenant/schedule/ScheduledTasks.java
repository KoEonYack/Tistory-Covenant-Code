package com.covenant.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class ScheduledTasks {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss:SSS");

//    @Scheduled(fixedRate = 1000)
    public void fixedRate() throws InterruptedException {
        log.info("1 시작");
        TimeUnit.SECONDS.sleep(5);
        log.info("1 fixedRate: 현재시간 - {}", formatter.format(LocalDateTime.now()));
    }

//    @Scheduled(fixedRate = 2000)
    public void fixedRate2() {
        log.info("2 fixedRate: 현재시간 - {}", formatter.format(LocalDateTime.now()));
    }
//
//    @Scheduled(fixedRate = 1000)
//    public void fixedRate3() {
//        log.info("fixedRate: 현재시간 - {}", formatter.format(LocalDateTime.now()));
//    }

    @Scheduled(fixedDelay = 1000)
    public void fixedDelay() throws InterruptedException {
        log.info("시작시간 - {}", formatter.format(LocalDateTime.now()));
        TimeUnit.SECONDS.sleep(5);
        log.info("종료시간 - {}", formatter.format(LocalDateTime.now()));
    }

//    @Scheduled(fixedRate = 3000, initialDelay = 5000)
    public void fixedRateAndInitialDelay() {
        log.info("현재시간 - {}", formatter.format(LocalDateTime.now()));
    }

    @Scheduled(cron = "0 0 7 * * MON")
    public void cronExpression() {
        log.info("현재시간 - {}", formatter.format(LocalDateTime.now()));
    }
}
