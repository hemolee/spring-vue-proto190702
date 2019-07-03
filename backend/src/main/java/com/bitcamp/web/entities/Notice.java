package com.bitcamp.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@ToString
@Table(name = "notices")
public class Notice implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
        
    @Column(name="wtd_title") private String title;
    @Column(name="offer_name") private String offerName;
    @Column(name="wtd_content1") private String content1;
    @Column(name="wtd_content2") private String content2;
    @Column(name="wtd_content3") private String content3;
    @Column(name="wtd_content4") private String content4;
    @Column(name="wtd_state")private String state;
    @Column(name="wtd_career")private String career ;
    @Column(name="wtd_industry")private String industry;
    
    @Column(name="wtd_tag1")private String tag1;
    @Column(name="wtd_tag2")private String tag2 ;
    @Column(name="wtd_tag3")private String tag3;
    
    @Override
    public String toString(){
        return String.format("고객정보 No: %d|n" + "ID: %s", id, title,offerName,
        content1,content2,content3,content4,state,career,industry,
        tag1,tag2,tag3);
    }

    @Builder
    private Notice(String title, String offerName, String content1, String content2,String content3,
    String content4,String state,String career,String industry,
    String tag1,String tag2,String tag3){       
        this.title = title;
        this.offerName = offerName;        
        this.content1 = content1;
        this.content2 = content2;
        this.content3 = content3;
        this.content4 = content4;
        this.state = state;
        this.career = career;
        this.industry = industry;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag3 = tag3;
        }

}