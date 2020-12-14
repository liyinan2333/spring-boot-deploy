-- 创建用户基础信息表
use `leoli-app-deploy`;
create table USER_INFO
(
    USR_CD int zerofill auto_increment comment '用户ID,唯一标识',
    USR_NM varchar(32) not null comment '用户名称',
    USR_AGE int(2) comment '用户年龄',
    USR_SEX char(1) comment '用户性别 1-男;2-女',
    USR_PHONE varchar(16) comment '用户电话',
    USR_LOCAL varchar(32) comment '用户住址',
    constraint USER_INFO_pk
        primary key (USR_CD)
)
    comment '用户基础信息表';