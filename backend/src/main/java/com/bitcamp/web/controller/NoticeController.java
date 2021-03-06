package com.bitcamp.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.bitcamp.web.domain.NoticeDTO;

import com.bitcamp.web.entities.Notice;
import com.bitcamp.web.repositories.NoticeRepository;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600) // 걸 메소드에만 걸어줘도됨..
@RestController
@RequestMapping("/notices")
public class NoticeController {    
    @Autowired NoticeDTO notice;    
    @Autowired ModelMapper modelMapper;
    @Autowired NoticeRepository repo;
    
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper ();
        return modelMapper;
    }
 
    @DeleteMapping("/{id}")
   public void	deleteById(@PathVariable String id){    
    System.out.println("deleteById title :" +id);   
    repo.deleteById(Long.parseLong(id));

   }
  /*  @GetMapping("/exists{title}")
   public  boolean existsById(@PathVariable String title){
       System.out.println("existsById title :" +title);
       Long l = Long.parseLong(title);
    return noticeService.existsById(l);
   }    */

   @GetMapping("")
   public Iterable<NoticeDTO> findAll(){
       Iterable<Notice> entities = repo.findAll();
       System.out.println("findall 진입");
       List<NoticeDTO> list = new ArrayList<>();
       for(Notice s: entities){
           NoticeDTO noti = modelMapper.map(s, NoticeDTO.class);
            list.add(noti);
         }        
    return list;
   }
   @GetMapping("/noticeContent/{id}")
   public NoticeDTO findById(@PathVariable String id) {
    /* 
    Notice entity = repo.findContentById(id).get(); 
    NoticeDTO n = modelMapper.map(entity, NoticeDTO.class);
    System.out.println("조회결과: "+n.toString()); */

    return modelMapper.map(repo.findById(Long.parseLong(id))
            .orElseThrow(EntityNotFoundException::new),
            NoticeDTO.class);
   }
   @PostMapping("/upload")
   public HashMap<String, String> save(@RequestBody NoticeDTO dto) {
       System.out.println("업로드"+dto.toString());
       HashMap<String, String> map = new HashMap<>();
       Notice entity = new Notice();
       entity.setTitle(dto.getTitle());
       entity.setOfferName(dto.getOfferName());
       entity.setContent1(dto.getContent1()); 
       entity.setContent2(dto.getContent2()); 
       entity.setContent3(dto.getContent3());
       entity.setContent4(dto.getContent4());
       entity.setState(dto.getState());
       entity.setCareer(dto.getCareer());
       entity.setIndustry(dto.getIndustry());
       entity.setTag1(dto.getTag1());
       entity.setTag2(dto.getTag2());
       entity.setTag3(dto.getTag3());
  
       System.out.println("entity 저장:"+entity.toString());
       repo.save(entity);
       map.put("result", "SUCCESS");
      return map;
   }   
   @PutMapping("/modify/{id}")
   public HashMap<String, String> modify(@RequestBody NoticeDTO dto,@PathVariable String id) {
       System.out.println("수정"+dto.toString());
       HashMap<String, String> map = new HashMap<>();
       Notice entity = repo.findById(Long.parseLong(id)).get();
       entity.setId(Long.parseLong(id));
       entity.setTitle(dto.getTitle());
       entity.setOfferName(dto.getOfferName());
       entity.setContent1(dto.getContent1()); 
       entity.setContent2(dto.getContent2()); 
       entity.setContent3(dto.getContent3());
       entity.setContent4(dto.getContent4());
       entity.setState(dto.getState());
       entity.setCareer(dto.getCareer());
       entity.setIndustry(dto.getIndustry());
       entity.setTag1(dto.getTag1());
       entity.setTag2(dto.getTag2());
       entity.setTag3(dto.getTag3());
  
       System.out.println("entity 저장:"+entity.toString());
       repo.save(entity);
       map.put("result", "SUCCESS");
      return map;
   }   
}