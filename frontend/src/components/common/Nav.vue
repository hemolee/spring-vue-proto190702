<template>
  <div>
    <nav class="nav">

  <div class="container-fluid">

    <ul >
         <li><p   id=myname>이혜미 님</p></li>
          <li><p class=p style="padding-bottom:20px;"> </p></li>          
          <li><router-link to= "noticeList" class=router id=r1 >공고</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r2 >면접</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r3>자기PR</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r4>F&Q</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="/" class=router id=r4>문의</router-link></li>
          <li><p class=p> </p></li>
          <li><router-link to="upload" class=router id=r4>(업로드)</router-link></li>
    </ul>
     
  </div>
    </nav></div>
</template>
<script>
export default {
    
}
</script>
<style scoped>
.nav{  
  background-color: #c9e1f5;  
  height:1200px;
  padding-top:20%;
  padding-bottom:50%;
   margin:0;  
   font-size: 35px;
   font-weight: bold;
   text-align: right;
   padding-right:15%;
   }
ul{
  list-style-type: none; 
  
}
#myname{
  font-size: 30px;
  margin:10%;
  color:  rgb(66, 65, 65);
   
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

</style>