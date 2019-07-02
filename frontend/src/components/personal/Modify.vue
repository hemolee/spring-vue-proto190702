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
            <input type="textarea" class="title" value="제목">
           </div>
            <div class="exeptTitle">
              <div class="area">                                 
                <input type="textarea" class="cor_name" value="기업명">
                <input type="textarea" class="jobkind" value="직종 및 직급">
                <div >
                  <textarea class="content" id="content1" >모집분야 및 자격요건
                  </textarea>
                  <textarea class="content" id="content2" >근무조건
                  </textarea>
                  <textarea class="content" id="content3" >전형절차
                  </textarea>
                  <textarea class="content" id="content4" >접수방법
                  </textarea>
                </div>
              </div>            
            <div class="tagclass">
            <input type="textarea" class="tag"  value="태그1" >
             <input type="textarea" class="tag"  value="태그2">
              <input type="textarea" class="tag"  value="태그3" >  
            </div>
                
        </div>
    </div>
    <div class="btn">
         <a @click="modify"  class="btn btn-default">수정</a>
          <router-link to="/noticeList"  class="btn btn-default">취소</router-link>
           
    </div>

    </div>
</div>
  
</template>

<script>
export default {
  methods:{
    modify(){

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
    width:100%;
    border:none;
}
.area{
     margin-bottom:10px;     
    
}
.content{
     margin-bottom:10px;
     font-size:15px;
     font-weight: bold;
     width:100%;
     height:130px;;
     border:none;
}

.tag{    
     color:rgb(90, 88, 88);
     font-weight: bold;     
     width:15%;
     border:none;
     font-size:15px;
}
.cor_name, .jobkind{
      border:none;
      width:100%;
      font-size:15px;
}


</style>
