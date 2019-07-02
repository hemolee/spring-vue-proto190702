import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Calculator from '@/components/basic/Calculator'
import JoinForm from '@/components/member/JoinForm'
import NoticeList from '@/components/personal/NoticeList'
import NoticeContent from '@/components/personal/NoticeContent'
import Upload from '@/components/personal/Upload'
import Modify from '@/components/personal/Modify'
// import LoginForm from '@/components/member/LoginForm'

Vue.use(Router)

export default new Router({
  mode: 'history', //경로에 들어오는 # 없애기
  routes: [
    {path: '/', name: 'home', component: Home},
    {path: '/calculator', name: 'calculator', component: Calculator},
    {path: '/joinForm', name: 'joinForm', component: JoinForm},
    {path: '/noticeList', name: 'noticeList', component: NoticeList},
    {path: '/noticeContent', name: 'noticeContent', component: NoticeContent},,
    {path: '/upload', name: 'upload', component: Upload},
    {path: '/modify', name: 'modify', component: Modify}
    // ,
    // {path: '/loginForm', name: 'loginForm', component: LoginForm}
  ]
})
