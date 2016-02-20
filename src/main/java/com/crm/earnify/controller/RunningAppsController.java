 /*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */  
package com.crm.earnify.controller;

 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;

 /**
 *  @version     1.0, 8/2/16
 *  @author sandeepandey
 */
 @Controller
 @RequestMapping("/runningApps")
 public class RunningAppsController extends EarnifyController{
     private static final Logger ELogger = LoggerFactory.getLogger(RunningAppsController.class);
 }
