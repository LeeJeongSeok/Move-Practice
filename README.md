# Move Practice Project

- 스네이크 게임을 만들기 전에 필요로한 역량을 키우기 위한 일종의 레벨업 프로젝트이다.
- 이미지 파일 1개를 이용하여 정해진 틀 안에 이미지를 움직이는 코드이다



## 삽질 기록

- Frame을 만든 후 Panel을 이용하여 테스트 UI를 대략적으로 만들기 위한 과정에서 마주친 삽질이다.

### JFrame의 BackGround 적용하기

- 기본적으로 setBackground 메소드를 이용하면 되겠지? 라고 생각하지만...헛수고였다..
- BackGround 속성을 이용하고 싶다면 (참조변수명)getContentPane().setBackground(Color.BLACK); 를 이용하자
- Panel은 setBackground 메소드가 먹힌다!

### Swing + KeyEvent

- Panel에 키보드 이벤트를 적용을 하다 겪은 삽질이다...
- Panel를 상속받은 클래스에서 바로 KeyListener 인터페이스를 구현한 후 실행을 해봤는데 안먹힌다 ;ㅂ;.. 뭐지..
- setFocusable(true) 메소드는 키 이벤트(키보드 입력)의 포커스를 받을 수 있는 컴포넌트가 여러개 있을 때 우선적으로 입력받기 위해 설정!
즉.. 사람많은곳에서 나 여기있어요 하는거와 비슷..


## 짧고 굵은 후기
- 하.. 나름 키보드를 이용하여 이미지 객체를 이동하는 코드를 작성했는데.. Swing에서 기운을 다 뺐다;