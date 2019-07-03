package com.bitcamp.web.service;


import java.util.Optional;
import com.bitcamp.web.entities.Notice;
import com.bitcamp.web.repositories.NoticeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class NoticeService {
   @Autowired NoticeRepository noticeRepository;

   public long	count(){
    return noticeRepository.count();
   }   
   public void	delete(Notice entity){
    noticeRepository.delete(entity);
   }   
   public void	deleteAll(){
    noticeRepository.deleteAll();
   }   
   public  void	deleteAll(Iterable<Notice> entities){
    noticeRepository.deleteAll(entities);
   }   
   public void	deleteById(Long id){
    noticeRepository.deleteById(id);
   }
   public  boolean existsById(Long id){
    return noticeRepository.existsById(id);
   }   
   public Iterable<Notice> findAll(){
    return noticeRepository.findAll();
   }
   public Iterable<Notice> findAllById(Iterable<Long> ids){
    return noticeRepository.findAllById(ids);
   }   
   public Optional<Notice> findById(String id){
    return noticeRepository.findById(Long.parseLong(id));
   }
   public Notice save(Notice entity){
    return noticeRepository.save(entity);
   }   
   public Iterable<Notice> saveAll(Iterable<Notice> dtos){
    return noticeRepository.saveAll(dtos);
   }
}
