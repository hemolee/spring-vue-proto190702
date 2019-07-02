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

      <div class="input-group">
        <div class="searching" >
        <input type="text" class="form-control" placeholder="지역, 직무 등 키워드를 입력해주세요." />
        <!-- <input type="button" class="btn-search" value="검색" /> -->
        </div>
       
      </div> 

 <!-- 첫번째 줄 -->
  <div class="row">
    <span class="row1">
       <!-- 첫번째 공고 -->
      <div class="col-md-4 mb-5" id="card" ><router-link to="/noticeContent" class="noticeConR">
        <div class="cardAll">
          <div class="card-body">
            <p class="area">마케팅 - 신입</p>
            <br>
            <p class="card-title">티몬</p>
            <br>
            <p class="tags">#서울  #참신한  #성실한</p>  
            </div> 
            <div class="card-footer">         
            <p class="card-text">접수중</p>
            </div>              
        </div>
        </router-link>
      </div>
      <!-- 두번째 공고 -->
           <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <p class="area">마케팅 - 신입</p>
            <br>
            <p class="card-title">로엔·카카오뮤직</p>
            <br>
            <p class="tags">#서울  #참신한  #신입</p>  
            </div> 
            <div class="card-footer">         
            <p class="card-text">접수중</p>
            </div>              
        </div>
      </div>
      <!-- 세 번째 공고-->
           <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <p class="area">재무·회계 - 경력</p>
            <br>
            <p class="card-title">KB캐피탈 </p>
            <br>
            <p class="tags">#서울   #꼼꼼한   #경력</p>  
            </div> 
            <div class="card-footer">         
            <p class="card-text">접수중</p>
            </div>              
        </div>
      </div>
      </span>
      
      <!-- 두번째 줄 -->
      <span class="row2">

      <!-- 네 번째 공고 -->
       <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <p class="area">웹프로그래머 - 신입</p>
            <br>
            <p class="card-title">11번가</p>
            <br>
            <p class="tags">#서울   #꼼꼼한   #신입</p>  
            </div> 
            <div class="card-footer">         
            <p class="card-text">접수중</p>
            </div>              
        </div>
      </div>
       <!-- 다섯 번째 공고 -->
           <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <p class="area">호텔사업 - 경력</p>
            <br>
            <p class="card-title">하나투어</p>
            <br>
            <p class="tags">#서울   #긍정적인   #성실한</p>  
            </div> 
            <div class="card-footer">         
            <p class="card-text">접수중</p>
            </div>              
        </div>
      </div>
      <!-- 여섯 번째 공고 -->
        <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <p class="area">마케팅 - 인턴</p>
            <br>
            <p class="card-title">카카오·멜론</p>
            <br>
            <p class="tags">#서울   #열정적인   #인턴</p>  
            </div> 
            <div class="card-footer">         
            <p class="card-text">접수중</p>
            </div>              
        </div>
      </div>
    </span>
</div>
<br><br>
      <div class="page">
        <h3>페이징 넣어야함</h3>
        </div>
      </div>
    
    </div>
</template>

<script>
import axios from 'axios'
export default {

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





.btn-search{
  width:60px;
	font-weight:bold;
	line-height:30px;
	border-radius:5px;
	text-align:center;
	display:inline-block;
	font-size:20px;
	color:#ffffff;
	height:30px;	
	border-color:#c0c3c4;
	border-width:0px;
	border-style:solid;
}


#card{
  width:30%;
  height: 250px;
  padding:3%;
  margin-bottom: 2%;
  
}
.cardAll{
background-color:#e1ecf5;

}
.card-body{
  height: 200px;
  padding:10px;
}
.input-group{
  padding-left:6.5%;
  padding-top:50px;
  margin-bottom:20px;
}
.searching{
 width:700px;
 
}
.row1{
  margin-bottom:100px;
  }
.row2{
  margin-top:100px;
}
.page{
  margin-left: 40%;
}

.row{
  padding-left: 5%;
  
}

.area{
  margin:5px;
  color:rgb(70, 68, 68);
  font-size:15px;
  font-weight: bold;
}
.card-title{
  font-weight: bold;
  text-align: center;
 font-size:35px;
  color: rgb(25, 122, 250);
}
.tags{
  color : rgb(8, 84, 184);
  font-weight: bold;
  text-align: center;
  font-size:18px;
}
.card-text{
  color:rgb(167, 3, 3);
  font-weight: bold;
  text-align: right;
  font-size: 20px;
  margin:10px;
  padding-bottom:5px;
  
}
.noticeConR:hover{
  text-decoration: none;
}
   
</style>
