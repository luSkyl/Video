package com.java.lcy.video.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "search_records")
public class SearchRecords {
    @Id
    private String id;

    /**
     * 搜索的内容
     */
    private String content;


}