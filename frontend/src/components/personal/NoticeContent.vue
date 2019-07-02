<template>
<div id="grid">

      <div class="nav">    
        <ul id="navi">
          <li><router-link to="/"  id=myname>이혜미 님</router-link></li>
          <li><p class=p style="padding-bottom:20px;"> </p></li>          
          <li><router-link to="/noticeList" class=router id=r1 >공고</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r2 >면접</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r3>자기PR</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r4>F&Q</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r4>문의</router-link></li>
        </ul>
      </div>  

  <div class="notnav">

      <div class="allContent">
          <div class="title">
             <p>하나투어 - 호텔 사업 부분 경력직 채용(7/1 19시 접수!)</p>
            </div>
            <div class="exeptTitle">
            <div class="area">
            <p class="cor_name">(주)하나투어</p>             
            <p class="jobkind">호텔 사업 부분 경력직 채용</p>
            </div> 
            <br>
            <div class="content">
               <div class="intro">
                      하나투어는1993년 설립된 국내 최대 여행 종합 기업으로, 18개 국내계열사와 전세계 30여개 글로벌 네트워크를
                    통해 전세계 여해산업을 이끌고 있습니다.글로벌 no.1 문화관광 유통그룹 비젼달성을 위한 역량있는 경력자를 모집하오니 많은 관심바랍니다.</div>
            </div>
            <div class="qualification">
                <h3>모집분야 및 자격요건</h3>
                모집분야: 체인호텔사업팀(0명)<br>
                담당업무: 체인호텔 예약 시스템 기획 및 운영 <br>
                자격요건: 호텔시스템 관련 경력 5년 이상 보유<br>
                우대사항: 외국어 가능자
                <br><br>
                <h3>근무조건</h3>
                근무형태: 정규직<br>
                근무지: 서울 종로구<br>
                근무요일: 주5일<br>
                근무시간: 09:00 ~ 18:00<br>
                급여: 회사내규에 따름(면접 후 결정)
                <br><br>
                <h3>전형절차</h3>
                선착순 지원마감 > 블라인드 스트리밍 면접 > 최종합격
                <br><br>
                <h3>접수방법</h3>
                2019.07.01(월) 19시 지원 접수 시작. 선착순 마감.
                <br><br>
                
            </div>
            <div class="tag">
               <p>#여행사 #성실한 #경력</p>
                </div>
                <div class="apply">
                    <input type=button @click="apply"  class="btn-apply" value="지원하기">
        </div>
        </div>
    </div>
    
    <div class="btn">
         <router-link to="/upload"  class="btn btn-default">업로드</router-link>
          <router-link to="/modify"  class="btn btn-default">수정</router-link>
            <a @click="deleting"  class="btn btn-default">삭제</a>
    </div>



    </div>
    </div>
</template>

<script>
export default {
    methods:{
        apply(){
            alert("지원 완료");
            //지원메소드
        },
        deleting(){
            alert("삭제 완료");
            //삭제메소드+공고목록으로
        }
    }
}
</script>

<style scoped>
#grid{
  display:grid;
    grid-template-columns:20% 1fr;
}
.nav{  
  background-color: #c9e1f5;  
  height:1200px;
  padding-top:20%;
  padding-bottom:50%;
   margin:0;  
   font-size: 35px;
   font-weight: 800;
   text-align: right;
   padding-right:15%;
   }
ul#navi{
  list-style-type: none; 
}
#myname{
  font-size: 30px;
  margin:10%;
  color:  rgb(66, 65, 65);
   /* text-shadow: 0.5px 0 rgb(9, 43, 87); */
   
}
.p{
  margin:20px;
}
#r2,#r3,#r4,#r5{
    color: rgb(66, 65, 65);
    margin:10%;  
   
}
#r1{
  color: rgb(41, 132, 250);
  margin:10%;  
}



.notnav{
    margin:5%;
}
.exeptTitle{
    border: solid  #c9e1f5 1px;
    height:100%;
    padding:10px;
    
}
.title{
     border: solid  #c9e1f5 1px;
    margin-bottom:10px;
    padding-top:10px;
    font-size:20px;
    font-weight: bold;
    color: rgb(8, 84, 184);
    
}
.area{
     margin-bottom:10px;
    
}
.content{
     margin-bottom:10px;
     font-size:15px;
     font-weight: bold;
}
.tag{    
     color:rgb(90, 88, 88);
     font-weight: bold;
     margin-top:20px;
     margin-bottom:20px;
     width:100%;
}
.apply{
     margin-left:45%;
     margin-bottom:5px;
}
.btn-apply{
  width:100px;
	font-weight:bold;
	line-height:30px;
	border-radius:5px;
	text-align:center;
	display:inline-block;
	font-size:20px;
	color:#ffffff;
    background-color:  rgb(8, 84, 184);;
	height:40px;	
	border-color : rgb(8, 84, 184);
	border-width:0px;
	border-style:solid;
}



.cor_name{
    font-size: 30px;
    font-weight: bold;
    text-align: center;   
}
.jobkind{
    font-size:20px;
    font-weight: bold;
    text-align: center;
}
.intro{
    border:none;
    width:100%;
    height:100%;
}



</style>
