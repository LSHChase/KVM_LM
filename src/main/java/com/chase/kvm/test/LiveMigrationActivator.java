package com.chase.kvm.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiveMigrationActivator implements BundleActivator{

    private static Logger logger = LoggerFactory.getLogger(LiveMigrationActivator.class);

    public void start(BundleContext bundleContext) throws Exception {
        logger.info("Live migration is started.");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        logger.info("Live Migration is stopped.");
    }
}
