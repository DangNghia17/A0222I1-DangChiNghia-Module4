package com.nghia.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(columnDefinition = "varchar(255) default 'default category'")
    private String nameBlog;    // nameBlog ~ is nameCategory

    @OneToMany( mappedBy = "category") //map to variable
    private Set<Blog> blog; // nothing

    public Category() {
    }


    public Category(Integer id, String nameBlog, Set<Blog> blog) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.blog = blog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public Set<Blog> getBlog() {
        return blog;
    }

    public void setBlog(Set<Blog> blog) {
        this.blog = blog;
    }
}
