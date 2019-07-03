<template>
<div id="grid">

      <div class="nav">    
       <Nav></Nav> 
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
import axios from 'axios'
import {store} from '../../store'
import Nav from '@/components/common/Nav.vue'
export default {
  components:{
  Nav
},
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
