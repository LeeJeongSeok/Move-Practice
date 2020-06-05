# Move Practice Project

- 스네이크 게임을 만들기 전에 필요로한 역량을 키우기 위한 일종의 레벨업 프로젝트이다.
- 이미지 파일 1개를 이용하여 정해진 틀 안에 이미지를 움직이는 코드이다



## 삽질 기록

- Frame을 만든 후 Panel을 이용하여 테스트 UI를 대략적으로 만들기 위한 과정에서 마주친 삽질이다.

### JFrame의 BackGround 적용하기

- 기본적으로 setBackground 메소드를 이용하면 되겠지? 라고 생각하지만...헛수고였다..
- BackGround 속성을 이용하고 싶다면 (참조변수명)getContentPane().setBackground(Color.BLACK); 를 이용하자
- Panel은 setBackground 메소드가 먹힌다!
