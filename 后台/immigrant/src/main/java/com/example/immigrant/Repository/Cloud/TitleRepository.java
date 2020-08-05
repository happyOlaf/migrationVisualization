package com.example.immigrant.Repository.Cloud;


import com.example.immigrant.domain.Cloud.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TitleRepository extends JpaRepository<Title,Integer> {
    //根据title获取记录
    public List<Title> findByTitle(String title);
    //根据title部分内容获取记录
    public List<Title> findByTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContainingOrTitleContaining(String title1,String title2,String title3,String title4,String title5,String title6,String title7,String title8,String title9,String title10,String title11,String title12,String title13,String title14,String title15,String title16);
}
