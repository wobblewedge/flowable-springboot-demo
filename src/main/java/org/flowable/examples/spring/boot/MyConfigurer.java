package org.flowable.examples.spring.boot;

import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.EngineConfigurationConfigurer;

public class MyConfigurer implements EngineConfigurationConfigurer<SpringProcessEngineConfiguration> {

    public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
        // advanced configuration
    }

}