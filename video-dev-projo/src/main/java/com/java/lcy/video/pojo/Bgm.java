package com.java.lcy.video.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bgm {
    @Id
    private String id;

    private String author;

    private String name;

    /**
     * 播放地址
     */
    private String path;

}