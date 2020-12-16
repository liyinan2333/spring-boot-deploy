-- 创建定时任务注册表
use `leoli-app-deploy`;
create table JOB
(
    JOB_ID  int zerofill auto_increment comment '定时任务唯一标识',
    CRON    varchar(32)  null comment 'crontab表达式',
    CLS_NM  varchar(255) null comment '类全路径',
    JOB_NM  varchar(32)  null comment '定时任务名称',
    ENABLED char         null comment '是否启用 1-启用;0-停用',
    UPDTR   varchar(32)  null comment '更新人',
    UPD_TM  timestamp    null comment '更新时间',
    CRTR    varchar(32)  null comment '创建人',
    CRT_TM  timestamp    null comment '创建时间',
    constraint JOB_pk
        primary key (JOB_ID)
)
    comment '动态定时任务注册表';