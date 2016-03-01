use earnifydb;
DROP TABLE IF EXISTS `org_master`;
<------------------------Org Master -------------------------------------------->
CREATE TABLE `org_master` (
  `org_id` int(11) NOT NULL AUTO_INCREMENT,
  `org_description` varchar(256) NOT NULL,
  `org_name` varchar(256) NOT NULL,
  `org_code` varchar(256) NOT NULL,
  `created` datetime DEFAULT '0000-00-00 00:00:00',
  `updated` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`org_id`)
);


<----------------------------App Master ---------------------------------------->

DROP TABLE IF EXISTS `app_master`;
CREATE TABLE app_master (
`app_id` INT(11) NOT NULL AUTO_INCREMENT,
`app_name` VARCHAR(256) ,
`app_code` VARCHAR(256) NOT NULL,
`app_description` VARCHAR(256),
`app_image` VARCHAR(256),
`app_catageory` VARCHAR(256),
`app_rating` VARCHAR(256),
`app_size` VARCHAR(256),
`app_version` VARCHAR(256),
`app_package_name` VARCHAR(256),
`app_domain` VARCHAR(256),
`app_google_play_url` VARCHAR(256),
`app_website_url` VARCHAR(256),
`app_promotional_banner` VARCHAR(256),
`last_update_on_google_play` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
`org_id` INT(11) NOT NULL,
PRIMARY KEY (`app_id`),
FOREIGN KEY (`org_id`) REFERENCES org_master (`org_id`)
);


<-----------------------Ad Unit Master ------------------------------------------>
DROP TABLE IF EXISTS `add_unit_master`;
CREATE TABLE add_unit_master (
	`add_unit_id` int(11) NOT NULL AUTO_INCREMENT,
	`add_unit_code` VARCHAR(256) NOT NULL,
	`add_unit_name` VARCHAR(256),
	`add_unit_desc` VARCHAR(256),
	PRIMARY KEY (`add_unit_id`)
);

INSERT into add_unit_master(`add_unit_code`,`add_unit_name`,`add_unit_desc`) values('deal','DEAL','This is deal type add unit');
INSERT into add_unit_master(`add_unit_code`,`add_unit_name`,`add_unit_desc`) values('story','STORY','This is story type add unit');


<---------------------Click Type Master -----------------------------------------------------
DROP TABLE IF EXISTS `click_type_master`;
CREATE TABLE click_type_master (
	`click_type_id` int(11) NOT NULL AUTO_INCREMENT,
	`click_type_code` VARCHAR(256) NOT NULL,
	`click_type_name` VARCHAR(256),
	`click_type_desc` VARCHAR(256),
	PRIMARY KEY (`click_type_id`)
);

INSERT into click_type_master(`click_type_code`,`click_type_name`,`click_type_desc`) values('S','SAME','This is click type for same page');
INSERT into click_type_master(`click_type_code`,`click_type_name`,`click_type_desc`) values('N','Next','This is click type for next page');

<------------------------Payout Type Master ---------------------------------------
DROP TABLE IF EXISTS `payout_type_master`;
CREATE TABLE payout_type_master (
	`payout_type_id` int(11) NOT NULL AUTO_INCREMENT,
	`payout_type_code` VARCHAR(256) NOT NULL,
	`payout_type_name` VARCHAR(256),
	`payout_type_desc` VARCHAR(256),
	PRIMARY KEY (`payout_type_id`)
);

INSERT into payout_type_master(`payout_type_code`,`payout_type_name`,`payout_type_desc`) values('D','Derived','This is for derived payout');
INSERT into payout_type_master(`payout_type_code`,`payout_type_name`,`payout_type_desc`) values('A','Absolute','This is Absolute payout');



//----------------------Campaign Master----------------------------------------
DROP TABLE IF EXISTS `campaign_master`;
CREATE TABLE campaign_master (
	`campaign_id` INT(11) NOT NULL AUTO_INCREMENT,
	`campaign_name` VARCHAR(256),
	`campaign_code` VARCHAR(256) NOT NULL,
	`campaign_display_name` VARCHAR(256),
	`campaign_description` VARCHAR(256),
	`campaign_total_value` VARCHAR(256) NOT NULL,
	`campaign_expiration_date` TIMESTAMP NOT NULL,
	`campaign_tag_line` VARCHAR(256),
	`campaign_cta_url` VARCHAR(256),
	`app_id` INT(11) NOT NULL,
	`add_unit_id` INT(11) NOT NULL,
	`click_type_id` INT(11) NOT NULL,
	`payout_type_id` INT(11) NOT NULL,
	PRIMARY KEY (`campaign_id`),
	FOREIGN KEY(`click_type_id`) REFERENCES click_type_master	(`click_type_id`),
	FOREIGN KEY(`payout_type_id`) REFERENCES payout_type_master	(`payout_type_id`),
	FOREIGN KEY(`app_id`) REFERENCES app_master	(`app_id`),
	FOREIGN KEY(`add_unit_id`) REFERENCES add_unit_master	(`add_unit_id`)
);

	





<------------------------- Campaign Task Master ---------------------------------------
DROP TABLE IF EXISTS `campaign_task_master`;
CREATE TABLE campaign_task_master (
	`campaign_task_id` INT(11) NOT NULL AUTO_INCREMENT,
	`campaign_code` VARCHAR(256) NOT NULL,
	`campaign_task_tag_line` VARCHAR(256),
	`campaign_task_instruction` VARCHAR(256),
	`campaign_task_worth` VARCHAR(256) NOT NULL,
	`campaign_payout_desc` VARCHAR(256),
	`campaign_disclaimer` VARCHAR(256),
	`campaign_cta_url` VARCHAR(256),
	`campaign_id` INT(11) NOT NULL,
	PRIMARY KEY (`campaign_task_id`),
	FOREIGN KEY (`campaign_id`) REFERENCES campaign_master(`campaign_id`)
);

<----------------------------Executable Task Type Master ------------------------>
DROP TABLE IF EXISTS `executable_task_type_master`;
CREATE TABLE executable_task_type_master (
	`executable_task_type_id` INT(11) NOT NULL AUTO_INCREMENT,
	`executable_task_type_code` VARCHAR(256) NOT NULL,
	`executable_task_type_name` VARCHAR(256),
	`executable_task_type_mapped_table` VARCHAR(256),
	PRIMARY KEY (`executable_task_type_id`)
);

insert into executable_task_type_master(`executable_task_type_code`,`executable_task_type_name`,`executable_task_type_mapped_table`)
	values('install','INSTALL',"some table");
insert into executable_task_type_master(`executable_task_type_code`,`executable_task_type_name`,`executable_task_type_mapped_table`)
	values('launch','LAUNCH',"some table");
insert into executable_task_type_master(`executable_task_type_code`,`executable_task_type_name`,`executable_task_type_mapped_table`)
	values('share','SHARE',"some table");
insert into executable_task_type_master(`executable_task_type_code`,`executable_task_type_name`,`executable_task_type_mapped_table`)
	values('time','Time Based',"some table");

<--------------------------Action Master---------------------------------------->

DROP TABLE IF EXISTS `action_master`;
CREATE TABLE action_master (
		`action_id` INT(11) NOT NULL AUTO_INCREMENT,
		`action_name` VARCHAR(256) NOT NULL,
		`action_class` VARCHAR(256),
		PRIMARY KEY (`action_id`)
);

<--------------------------Action Param Master ---------------------------------->
DROP TABLE IF EXISTS `action_param_master`;
CREATE TABLE action_param_master (
	`action_param_id` INT(11) NOT NULL AUTO_INCREMENT,
	`action_param_key` VARCHAR(256) NOT NULL,
	`action_param_value` VARCHAR(256),
	`action_id` INT(11) NOT NULL,
	PRIMARY KEY (`action_param_id`),
	FOREIGN KEY(`action_id`) REFERENCES action_master(`action_id`)
);

INSERT into action_master(`action_name`,`action_class`) values('test','com.earnify.action.someAction');
INSERT into action_param_master(`action_param_key`,`action_param_value`,`action_id`) values('K','V','1');
INSERT into action_param_master(`action_param_key`,`action_param_value`,`action_id`) values('K1','V1','1');

<-----------------------Executable Task Master ------------------------------------------------------------

DROP TABLE IF EXISTS `executable_task_master`;
CREATE TABLE executable_task_master (
	`executable_task_id` INT(11) NOT NULL AUTO_INCREMENT,
	`campaign_task_id` INT(11) NOT NULL,
	`action_id` INT(11) NOT NULL,
	`parent_executable_task_id` INT(11) ,
	PRIMARY KEY (`executable_task_id`),
	FOREIGN KEY(`campaign_task_id`) REFERENCES campaign_task_master(`campaign_task_id`),
	FOREIGN KEY(`action_id`) REFERENCES action_master(`action_id`)
);















