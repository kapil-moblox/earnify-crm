/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *  @version     1.0, 27/2/16
 *  @author sandeepandey
 */

@Configuration
@ComponentScan(basePackages = "com.crm.earnify")
public class EarnifySpringConfig {

    public EarnifySpringConfig() {

    }

    public EarnifySpringConfig(String p_spring_config) {

    }
}
