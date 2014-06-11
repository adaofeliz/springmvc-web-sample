package com.adaofeliz.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by adaopinto on 09/06/14.
 */
@Component
public class DaemonJobSample implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(DaemonJobSample.class);

    @Override
    @Scheduled(fixedDelayString = "${daemon.job.sample.job.fixed.delay}")
    public void run() {
        LOG.info("Daemon Job Sample is working. " + System.currentTimeMillis());
    }
}
