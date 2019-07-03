<template>
<div id="grid">

  <div class="nav">    
    <Nav></Nav>    
  </div>   

  <div class="notnav">
    <div class="input-group">
        <div class="searching" >
        <input type="text" class="form-control" placeholder="지역, 직무 등 키워드를 입력해주세요." />
        <!-- <input type="button" class="btn-search" value="검색" /> -->
        </div>       
      </div> 

    <div class="cards">
    <ul >   
    <li  v-for="item in arr" class=cardlist  >
      <span class="card"  >   
      <div class="col-md-4 mb-5" id="card" @click="goContent(item)">
            <div class="cardAll" >
              <div class="card-body">
                <p class="area">{{item.industry}} - {{item.career}}</p>
                <br>
                <p class="card-title" >{{item.offerName}}</p>
                <br>
                <p class="tags">#{{item.tag1}}   #{{item.tag2}}    #{{item.tag3}} </p>  
                </div> 
                <div class="card-footer">         
                <p class="card-text">{{item.state}} </p>            
                </div>                        
            </div>    
          </div>
        </span>
        </li>
      </ul>   
      <br><br>
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
import {store} from '../../store'
import Nav from '@/components/common/Nav.vue'

export default {
components:{
  Nav
},
 data(){
    return{
        context : 'http://localhost:9000/notices', 
        it: '',
        title : '',      
        offerName: '', 
        state : '',
        career : '',
        industry :'',
        content1 : '',      
        content2 : '',      
        content3 : '',      
        content4 : '',       
        tag1 :'',
        tag2 :'',
        tag3 :'',  
        arr : []     

    }
  },
  created() {
   axios.get(`${this.context}`)
   .then(res=>{    
      this.arr = res.data      
   })
   .catch(e=>{

   })


  },
  methods:{
    goContent(item){      
      
      alert("title: "+item.title)
      store.state.items = item
      alert("item에 저장된:"+ store.state.items.title)
    
      // this.$router.push({name: 'noticeContent', params:{title : thetitle, id : theid}})
      this.$router.push('/noticeContent')
    }
  }
}
</script>

<style scoped>
 #grid{
  display:grid;
    grid-template-columns:20% 1fr;
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
  padding:2%;
  margin:auto;
  
}
.cardAll{
background-color:#e1ecf5;
height: 270px;
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
.page{  
  margin-left: 40%;
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
  margin:20px;  
  
}
.goContent:hover{
  text-decoration: none;
}
.cards{
  margin-bottom:40%;
}
.cardlist{
  list-style: none;
}
   
</style>
