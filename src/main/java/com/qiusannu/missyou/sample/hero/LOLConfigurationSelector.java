package com.qiusannu.missyou.sample.hero;

import com.qiusannu.missyou.sample.HeroConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class LOLConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {HeroConfiguration.class.getName()};
    }
}
