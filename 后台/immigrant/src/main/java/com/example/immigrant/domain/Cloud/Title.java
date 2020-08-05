package com.example.immigrant.domain.Cloud;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "title")
@IdClass(choice_5.class)
public class Title {
    @Id
    private String url;
    @Id
    private String title;

    @Override
    public String toString() {
        return "Title{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
