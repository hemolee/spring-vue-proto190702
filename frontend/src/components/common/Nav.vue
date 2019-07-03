<template>
  <div>
    <nav class="navbar navbar-default">

  <div class="container-fluid">

    <ul >
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
    </nav></div>
</template>
<script>
export default {
    
}
</script>
<style scoped>

</style>