package org.top.gmall.gmalluser.model;

import lombok.Data;

import java.util.Date;

@Data
public class UmsMember {

    private Integer id;

    /**
     * 用户等级
     */
    private Integer memberLevelId;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户状态 0：禁用  1 ：启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 用户头像
     */
    private String icon;

    /**
     * 用户性别  0 ：未知  1：男  2 ：女
     */
    private Integer gender;

    /**
     * 用户生日
     */
    private Date birthday;

    /**
     *用户所在城市
     */
    private String city;

    /**
     * 用户职业
     */
    private String job;

    /**
     * 用户个性签名
     */
    private String personalizedSignature;

    /**
     * 用户来源
     */
    private Integer sourceType;

    /**
     * 用户积分
     */
    private Integer integration;

    /**
     * 用户成长值
     */
    private Integer growth;

    /**
     * 剩余抽奖次数
     */
    private Integer luckeyCount;

    /**
     * 历史积分数
     */
    private Integer historyIntegration;


}
