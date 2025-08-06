# lsw_sbb_250806

## 1차 요구사항 구현
- [ ] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [ ] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [ ] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [ ] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [ ] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [ ] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- 2장에 기초적인 기능은 모두 구현하였습니다

## UI/UX (화면 캡처본을 복사 붙여 넣기, url 주소 나오도록)
- 게시글 리스트 페이지
  <img width="1906" height="645" alt="image" src="https://github.com/user-attachments/assets/a8be5239-8cec-4289-a723-06389ea73feb" />

- 게시글 등록 폼 페이지
  <img width="1879" height="848" alt="image" src="https://github.com/user-attachments/assets/a62447f2-6aaa-4d9c-bede-196cb5245000" />

- 게시글 상세 페이지
  <img width="1912" height="523" alt="image" src="https://github.com/user-attachments/assets/f89a4a8c-561c-4f75-8ad4-ac5c5eee34e8" />


## MVC 패턴

SpringBoot에서 요구하는 프로그램 구조이다
M : model, 모델
V : view, 뷰
C : controller, 컨트롤러 

모든 요청과 조작은 컨트롤러에서 담당한다. 뷰는 사용자에게 정보를 보여주는 역할을 담당한다. 모델은 데이터를 가져오고 저장하는 등, 직접 데이터를 만지는 역할을 한다
서로의 역할을 분명하게 나누어, 의존성을 줄이고, 더 간결한 시스템구조를 만드는 것을 목표로 한다.

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 프로젝트를 만들때 주입한다
- implement에 주입한다
- 클래스선언할때 impleteme를 이용하여 주입
## JPA의 장점과 단점
- 장점 : 높은 생산성, 유지보수 용이
- 단점 : 기초학습이 어렵다, 속도저하가능성?이 있다

## HTTP GET 요청과 POST 요청의 차이
- GET요청 url에 바로 인자를 넣어서 요청하는 방법
- POST요청 html의 <form>태그에서 발생하는 값들을 요청과 함께 날리는 방법, 사용자에게는 보이지 않는다
