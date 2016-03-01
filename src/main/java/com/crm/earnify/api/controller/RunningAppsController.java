 /*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */  
package com.crm.earnify.api.controller;

 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;

 /**
 *  @version     1.0, 8/2/16
 *  @author sandeepandey
 */
 @Controller
 @RequestMapping(value = "/runningApps",method = {RequestMethod.GET, RequestMethod.HEAD})
 public class RunningAppsController extends EarnifyController{
     private static final Logger ELogger = LoggerFactory.getLogger(RunningAppsController.class);


 }
