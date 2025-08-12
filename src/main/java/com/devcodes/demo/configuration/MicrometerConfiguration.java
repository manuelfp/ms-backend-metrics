package com.devcodes.demo.configuration;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MicrometerConfiguration {

    @Value("${spring.application.name}")
    private String applicationName;

    @Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return meterRegistry -> meterRegistry.config().commonTags("application", applicationName);
    }

}

