package com.java.lcy.video.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 我的头像，如果没有默认给一张
     */
    @Column(name = "face_image")
    private String faceImage;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 我的粉丝数量
     */
    @Column(name = "fans_counts")
    private Integer fansCounts;

    /**
     * 我关注的人总数
     */
    @Column(name = "follow_counts")
    private Integer followCounts;

    /**
     * 我接受到的赞美/收藏 的数量
     */
    @Column(name = "receive_like_counts")
    private Integer receiveLikeCounts;


}