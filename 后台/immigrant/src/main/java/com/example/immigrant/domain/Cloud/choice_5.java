package com.example.immigrant.domain.Cloud;

import javax.persistence.Column;
import java.io.Serializable;

public class choice_5 implements Serializable {
    @Column(nullable = false,name = "url")
    private String url;
    @Column(nullable = false,name = "title")
    private String title;

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

    public choice_5(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public choice_5() {
    }
}
