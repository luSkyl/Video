package com.java.lcy.video.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Videos {
    @Id
    private String id;

    /**
     * 发布者id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户使用音频的信息
     */
    @Column(name = "audio_id")
    private String audioId;

    /**
     * 视频描述
     */
    @Column(name = "video_desc")
    private String videoDesc;

    /**
     * 视频存放的路径
     */
    @Column(name = "video_path")
    private String videoPath;

    /**
     * 视频秒数
     */
    @Column(name = "video_seconds")
    private Float videoSeconds;

    /**
     * 视频宽度
     */
    @Column(name = "video_width")
    private Integer videoWidth;

    /**
     * 视频高度
     */
    @Column(name = "video_height")
    private Integer videoHeight;

    /**
     * 视频封面图
     */
    @Column(name = "cover_path")
    private String coverPath;

    /**
     * 喜欢/赞美的数量
     */
    @Column(name = "like_counts")
    private Long likeCounts;

    /**
     * 视频状态：
     *   1、发布成功
     *   2、禁止播放，管理员操作
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

}