<template>
<div id="grid">

      <div class="nav">    
        <Nav></Nav>    
      </div>  

  <div class="notnav">

      <div class="allContent">
          <div class="title">
             <p>  {{title}} </p>
            </div>
            <div class="exeptTitle">
            <div class="area">
            <p class="cor_name">{{offerName}}</p>             
            <p class="jobkind">{{industry}} 부문 {{career}}직 채용</p>
            </div> 
            <br>
            <div class="content">
               <div class="intro">
               </div>
            </div>
            <div class="qualification">
                <h3>모집분야 및 자격요건</h3>
                 {{content1}} 
                <br><br>
                <h3>근무조건</h3>
                {{content2}}
                <br><br>
                <h3>전형절차</h3>
               {{content3}}
                <br><br>
                <h3>접수방법</h3>
               {{content4}}
                <br><br>
                
            </div>
            <div class="tag">
               <p>#{{tag1}} #{{tag2}} #{{tag3}}</p>
                </div>
                <div class="apply">
                    <input type=button @click="apply"  class="btn-apply" value="지원하기">
        </div>
        </div>
    </div>
    
    <div class="btn">
         <router-link to="/upload"  class="btn btn-default">업로드</router-link>
          <button @click="goModify(item)"  class="btn btn-default">수정</button>
            <a @click="deleting(id)"  class="btn btn-default">삭제</a>
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
 data(){
    return{
        context : 'http://localhost:9000/notices', 
        id : '',
        title : '',      
        offerName: '',         
        career : '',
        industry :'',
        content1 : '',      
        content2 : '',      
        content3 : '',      
        content4 : '',       
        tag1 :'',
        tag2 :'',
        tag3 :'',
        item : '' 
    }
  },
  created() {     
      this.id = store.state.items.id
      this.title = store.state.items.title
      this.offerName = store.state.items.offerName
      this.career = store.state.items.career
      this.industry = store.state.items.industry
      this.content1 = store.state.items.content1
      this.content2 = store.state.items.content2
      this.content3 = store.state.items.content3
      this.content4 = store.state.items.content4
      this.tag1 = store.state.items.tag1
      this.tag2 = store.state.items.tag2
      this.tag3 = store.state.items.tag3
      this.item = store.state.items
  },
  methods:{   
        goModify(item){
          alert("수정할 공고:"+item.title)
         store.state.items = item
         alert("수정할 공고:"+store.state.items.title)
        this.$router.push('/modify') 
        } , 
        apply(){
            alert("지원 완료");
            //지원메소드
        },
        deleting(id){
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
