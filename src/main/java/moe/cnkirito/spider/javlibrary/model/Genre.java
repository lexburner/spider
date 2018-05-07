package moe.cnkirito.spider.javlibrary.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 影片分类
 */
@Data
@Entity
public class Genre {

    @Id
    private String g;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 大类名称
     */
    private String boxTitle;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "genres")
    List<Video> videos;


}
