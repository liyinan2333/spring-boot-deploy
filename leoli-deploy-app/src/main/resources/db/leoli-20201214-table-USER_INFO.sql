-- 创建用户基础信息表
use `leoli-app-deploy`;
create table `leoli-app-deploy`.user_info
(
    USR_ID    int unsigned zerofill auto_increment comment '用户ID,唯一标识'
        primary key,
    USR_NM    varchar(32) not null comment '用户名称',
    USR_AGE   int(2)      null comment '用户年龄',
    USR_SEX   char        null comment '用户性别 1-男;2-女',
    USR_PHONE varchar(16) null comment '用户电话',
    USR_LOCAL varchar(32) null comment '用户住址',
    UPDTR     varchar(32) null comment '更新人',
    UPD_TM    timestamp   null comment '更新时间',
    CRTR      varchar(32) null comment '创建人',
    CRT_TM    timestamp   null comment '创建时间'
)
    comment '用户基础信息表';