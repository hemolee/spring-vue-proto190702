<template>
<div id="grid">

      <div class="nav">    
       <Nav></Nav> 
      </div>  

<div class="notnav">

      <div class="allContent">
           <div class="title">             
            <input type="textarea" class="title" >{{title}}
           </div>
            <div class="exeptTitle">
              <div class="area">                                 
                <textarea  v-model="offerName" class="cor_name" >{{offerName}} </textarea>
                <textarea  v-model="industry" class="jobkind" >{{industry}}</textarea>
                <textarea  v-model="career" class="jobkind" >{{career}}</textarea>
                <div >
                  <textarea class="content" v-model="content1" id="content1" >{{content1}}
                  </textarea>
                  <textarea class="content" v-model="content2"  id="content2" >{{content2}}
                  </textarea>
                  <textarea class="content" v-model="content3"  id="content3" >{{content3}}
                  </textarea>
                  <textarea class="content" v-model="content4" id="content4" >{{content4}}
                  </textarea>
                </div>
              </div>            
            <div class="tagclass">
            <textarea class="tag"  v-model="tag1" >{{tag1}}</textarea>
            <textarea class="tag" v-model="tag2"  >{{tag2}}</textarea>
            <textarea class="tag" v-model="tag3" >  {{tag3}}</textarea>
            <textarea class="tag" v-model="state" >  {{state}}</textarea>
            </div>
           
        </div>
    </div>
    <div class="btn">
         <a @click="modify"  class="btn btn-default">수정완료</a>
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
 data(){
    return{
        context : 'http://localhost:9000/notices/modify',
        id: '',
        title : '',
        offerName: '',
        content1 : '',
        content2 : '',
        content3 : '',
        content4 : '',
        state : '',
        career :'',
        industry :'',
        tag1 :'',
        tag2 :'',
        tag3 :''

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
      this.state = store.state.items.state
      this.item = store.state.items
  },
  methods:{
    modify(){
      let data = {      
                it : this.id    ,      
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
              axios.put(`${this.context}/${this.id}`,
                        JSON.stringify(data),
                          {headers: headers})
              .then(res=>{           
                  alert(`수정완료 : ${this.title}`)
                  
              })
              .catch(e=>{
                  alert('ERROR')
                  this.$router.link(-1);
              })
              this.$router.push('/noticeList') 
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
