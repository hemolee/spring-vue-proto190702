package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Lazy
public class NoticeDTO {
        
   private String  id, title,
         offerName,
         content1,
         content2,
         content3,
         content4,
         state,
         career,
         industry,
         tag1,
         tag2,
         tag3;
}