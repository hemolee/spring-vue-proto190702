<template>
<div id="grid">

      <div class="nav">    
        <ul id="navi">
          <li><router-link to="/"  id=myname>이혜미 님</router-link></li>
          <li><p class=p style="padding-bottom:20px;"> </p></li>          
          <li><span @click = "noticeList" class=router id=r1 >공고</span></li>
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
            <input type="textarea" class="title" v-model="title" value="제목">
           </div>
            <div class="exeptTitle">
              <div class="area">                                 
                <input type="textarea" v-model="offerName" class="offerName" >
                <input type="textarea" v-model="industry" class="industry" >
                <input type="textarea" v-model="career" class="career" >
                <div>
                  <textarea class="content" v-model="content1" id="content1" >모집분야 및 자격요건
                  </textarea>
                  <textarea class="content" v-model="content2" id="content2" >근무조건
                  </textarea>
                  <textarea class="content" v-model="content3" id="content3" >전형절차
                  </textarea>
                  <textarea class="content" v-model="content4" id="content4" >접수방법
                  </textarea>
                </div>
              </div>            
            <div class="tagclass">
            <input type="textarea" class="tag" v-model="tag1" value="태그1">
            <input type="textarea" class="tag" v-model="tag2" value="태그2">
            <input type="textarea" class="tag" v-model="tag3" value="태그3">  
            </div>
                
        </div>
    </div>
    
    <div class="btn">
         <a @click="upload"  class="btn btn-default">업로드</a>
          <router-link to="/noticeList"  class="btn btn-default">취소</router-link>
           
    </div>

    </div>
</div>
  
</template>

<script>
export default {
   data(){
    return{
        context : 'http://localhost:9000/notices/upload',
        title : '제목',
        offerName: '기업명',
        content1 : '모집분야 ',
        content2 : '근무조건',
        content3 : '전형절차',
        content4 : '접수방법',
        state : '진행중',
        career :'인턴/신입/경력',
        industry :'직종',
        tag1 :'태그1',
        tag2 :'태그2',
        tag3 :'태그3'

    }
  },
  methods:{
    upload(){
      let data = {                
                title : this.title,
                offerName : this.offerName,
                content1 : this.content1,
                content2 : this.content2,
                content3 : this.content3,
                content4 : this.content4,               
                state : this.state,
                career : this.career,
                industry : this.industry,
                tag1 : this.tag1,
                tag2 : this.tag2,
                tag3 : this.tag3
              }
              let headers ={
                'Content-Type': 'application/json',
                'Athorization': 'JWT fefege..'
              }
              axios.post(`${this.context}`,
                        JSON.stringify(data),
                          {headers: headers})
              .then(res=>{           
                  alert(`upload : ${this.title}`)
              })
              .catch(e=>{
                  alert('ERROR')
              })
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
.offerName, .industry, .career{
    border:none;
    width:100%;
    font-size:15px;
}


</style>
