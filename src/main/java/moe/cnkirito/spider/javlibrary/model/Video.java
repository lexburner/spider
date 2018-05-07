package moe.cnkirito.spider.javlibrary.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Video {

    @Id
    private String v;
    /**
     * 番号
     */
    private String code;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片
     */
    private String img;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "genre_movie_relation", joinColumns = {
            @JoinColumn(name = "v", referencedColumnName = "v")}, inverseJoinColumns = {
            @JoinColumn(name = "g", referencedColumnName = "g")})
    private List<Genre> genres;

}
