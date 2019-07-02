<template>
  <div class="calculator">
    <div class="display">{{current || '0'}}</div>
    <div @click="clear" class="btn">C</div>
    <div @click="sign" class="btn">+/-</div>
    <div @click="percent" class="btn">%</div>
    <div @click="divide" class="btn operator">÷</div>
    <div @click="append('7')" class="btn">7</div>
    <div @click="append('8')" class="btn">8</div>
    <div @click="append('9')" class="btn">9</div>
    <div @click="times" class="btn operator">x</div>
    <div @click="append('4')" class="btn">4</div>
    <div @click="append('5')" class="btn">5</div>
    <div @click="append('6')" class="btn">6</div>
    <div @click="minus" class="btn operator">-</div>
    <div @click="append('1')" class="btn">1</div>
    <div @click="append('2')" class="btn">2</div>
    <div @click="append('3')" class="btn">3</div>
    <div @click="add" class="btn operator">+</div>
    <div @click="append('0')" class="btn zero">0</div>
    <div @click="dot" class="btn">.</div>
    <div @click="equal" class="btn operator">=</div>
  </div>
</template>

<script>
export default {
  data:()=> {  //return값이 있는 함수라 제이슨으로 표기하면 data : ()=>{ } 이렇게 된다
    return { //object는 null로 주고 값은 ''로 초기화하였는데 여기서 previous는 ''라고해도 별 상관없다.
      previous: null, //이전에 누른 값
      current: '', //현재 누른 값
      operator: null, //누르는게 숫자인지, 연산자인지 구분
      operatorClicked: false
    }
  },
  methods: { //객체를 보내는...
    clear() { //이전 값 지우기 clear: ()=>{}
      this.current = '';
    },
   
    append(number) { //누른 값 저장
      if (this.operatorClicked) {
        this.current = '';
        this.operatorClicked = false;
      }
      this.current = `${this.current}${number}`;
    },
    
    setPrevious() { //이전 키 값을 갖고있는 것. 새로운키 눌렀을때 덮어쓰기 되지않도록
      this.previous = this.current;
      this.operatorClicked = true;
    },
    divide() {
      this.operator = (a, b) => b / a;
      this.setPrevious();
    },
    times() {
      this.operator = (a, b) => a * b;
      this.setPrevious();
    },
    minus() {
      this.operator = (a, b) => a - b;
      this.setPrevious();
    },
    add() {
      this.operator = (a, b) => a + b;
      this.setPrevious();
    },
    equal() {
      this.current = `${this.operator( //여기서 operator는 해당 식이다 ex) (a, b) => a + b;         
        parseFloat(this.previous),
        parseFloat(this.current)//parseFloat 문자열을 숫자로 바꿈
      )}`;
      console.log('결과 : '+this.current)
      this.previous = null;
    },



     sign() {
      this.current = this.current.charAt(0) === '-' ? 
        this.current.slice(1) : `-${this.current}`;
    },
    percent() {
      this.current = `${parseFloat(this.current) / 100}`;
    },
    dot() {
      if (this.current.indexOf('.') === -1) {
        this.append('.');
      }
    }
  }
}

</script>


<style scoped>
.calculator {
  margin: 0 auto;
  width: 400px;
  font-size: 40px;
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-auto-rows: minmax(50px, auto);
}
.display {
  grid-column: 1 / 5;
  background-color: #333;
  color: white;
}
.zero {
  grid-column: 1 / 3;
}
.btn {
  background-color: #F2F2F2;
  border: 1px solid #999;
}
.operator {
  background-color: orange;
  color: white;
}
</style>