DROP TABLE IF EXISTS notices;
CREATE TABLE notices (
id INT AUTO_INCREMENT PRIMARY KEY,
wtd_title VARCHAR(40) UNIQUE NOT NULL,
offer_name VARCHAR(40)  ,
wtd_content1 VARCHAR(200) ,
wtd_content2 VARCHAR(200) ,
wtd_content3 VARCHAR(200) ,
wtd_content4 VARCHAR(200),
wtd_state VARCHAR(20),
wtd_career VARCHAR(20) ,
wtd_industry VARCHAR(20) ,
wtd_tag1 VARCHAR(20) ,
wtd_tag2 VARCHAR(20), 
wtd_tag3 VARCHAR(20)
)DEFAULT CHARSET=utf8;
/* insert into Notices(wtd_seq_no,wtd_title,wtd_content1,wtd_content2,wtd_content3,wtd_content4,
wtd_state,wtd_career,wtd_industry,wtd_start_date,wtd_last_date,sysdate,wtd_tag1,wtd_tag2,wtd_tag3) 
   values ('제목','내용1','내용2','내용3','진행중','신입','마케팅','190701','190705','태그1','태그2','태그3');
 */
commit;
