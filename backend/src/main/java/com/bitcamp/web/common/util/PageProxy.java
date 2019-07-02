package com.bitcamp.web.common.util;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * PageProxy
 */
@Component //파라미터로 줘야해서 component
@Data
@Lazy
public class PageProxy {


    private int pageNum,pageSize, blockSize, startRow,
                endRow, startPage, endPage, prevBlock, nextBlock, totalCount;
    private String search ; //검색어
    private boolean existPrev, existNext;

    public void execute(Map<?,?> paramMap){ // ?는 와일드카드라고 부른다. object로 처리된다.
        //Dim-1 Row scalar info DB의 테이블의 총 갯수
        int totalCount = Integer.parseInt(String.valueOf(paramMap.get("totalCount"))); //integer는 string만되고 object은 안되서 변환두번함.
        //Dim-2 Page scalar info
        String _pageNum = (String)paramMap.get("page_num"); //와일드카드를 통해 object로 처리했기 때문에 String 변환이 필요하다.
        pageNum = (_pageNum == null) ? 1 : Integer.parseInt(_pageNum); //현재 몇페이지인지. 기본값 1
        String _pageSize = (String)paramMap.get("page_size");
        pageSize = (_pageSize == null) ? 5 : Integer.parseInt(_pageSize); //몇개씩 보냐.. NULL일때 기본값 5개로 설정        
        //나머지(페이징하고 남은 맨 마지막 페이지의 게시물 수)
        int nmg =totalCount % pageSize;
        //몫(몇페이지 인지)
        int pageCount = (nmg == 0) ? totalCount / pageSize : totalCount / pageSize + 1 ;        
        startRow = pageSize*(pageNum-1);    
        endRow = (totalCount > pageNum*pageSize) ? pageSize*pageNum : totalCount;
        //Dim-3 Block scalar info기본값 5. 몇페이지씩 보여줄 것인지. 
        String _blockSize  =(String)paramMap.get("block_size");
        blockSize = (_blockSize == null) ? 5 : Integer.parseInt(_blockSize); 
        int blockNum = (pageNum-1)/blockSize;

        existPrev = (startPage -pageSize) > 0;
        existNext = (startPage + pageSize)<=pageCount;

        startPage = (existPrev) ? blockNum * blockSize +1 : 1 ;
        endPage = (endPage > pageCount) ? pageCount : startPage + (blockSize -1);
      
        prevBlock = startPage - pageSize;
        nextBlock = startPage +pageSize;
        search = (String)paramMap.get("search");

    
    }   
    
}