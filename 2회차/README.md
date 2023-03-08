# 2회차

## 사용할 툴
1. Postman
2. https://jsonplaceholder.typicode.com/ API 목록
3. 공공데이터 API 목록

## 네트워크 기본개념
### RestAPI
 RestAPI은 Rest기반으로 만들어진 API라고 보면된다. REST는 (Representational State Transfer)의 약자로 자원을 이름으로 구분하면 해당 자원의 상태(정보)를 주고 받는 모든것을 의미하고 API는 두 컴퓨터 또는 서버에서 데이터를 교환하도록 구현하는 것을 말한다. 그러면 REST AIP는 두 컴퓨터 또는 서버에서  REST기반으로 데이터를 교환한다는 똣이다. 그러면 APU 말고 REST의 개념을 집중적으로 봐야 하는데. 자원을 url로 표현하고 행위(GET, POST, PUT/ PATCH, DELETE) 메소드를 실행하면 요청한곳에서 데이터를 JHSO, XML, FILE, HTML등으로 보여준다. REST의 특징은 아래와 같다.
 1. server-client
 2. Statless
 3. Cachable
 4. Layered Sysyem
 5. Code-On-Demand
 6. Uniform Interface

### HTTP 통신에 대해서 설명해주세요.
HTTP는 OSI 7계층 응용계층에 있는 프로트콜이다. 이 프로트콜의 특징은 네트워크에서 url로 서버와 클라이언트에서 데이터를 주고 받는 통신 규약이라고 보면된다. HTTP통신은 TCP/IP 프로트콜에 따른 프로트콜이라고 보면된다. TCP/IP프로트콜은 따로 찾아 보기 바란다.

### HTTP 메소드 GET과 POST의 차이에 대해서 설명해주세요.
- GET: RestAPI에서 주로 조회할때 사용하는 메소드이다. Get메소드는 url에 쿼리스트링을 붙어서 전송하는데 이 쿼리스트링으로 특정 원하는 데이터를 조회를 할수 있지만 보안상으로 취약한점이 있어서.. 중요한 데이터를 요청하거나 보안상 위협이 있을때는 사용하면 안된다. 사용방식은 url에 뒤에 ? 피라미터 = 값 이런 형식으로 사용하면된다.
- Post: RestAPI에서는 주로 데이터를 추가 할때 사용하는 메소드이다. GET메소드와 다르게 바디에 데이터를 실어서 보내는 방식인데 이 방시으로 보내면 전송할때 데이터를 안전하게 보낼수가 있어서 보안에 취약점에 어느정도는 해결할수있다는 점이다. 그래서 보안관련이나 특정 데이터 보지 못하도록 조회하기 위해서 POST로 사용하는 경우가 종종 있다. 

|구분|GET|POST|
|-----|-----|-------|
|body| X | O |
|멱등성| O | X |
|사용목적|조회|등록, 저장|
|북마크|O|X|
|캐시|O|X|

### postman으로 원하는 정보를 얻을 수 있는 api 호출하기
1. 모든 post들을 조회하기
![모든 post](./image/모든%20post.png)
2. 2번 post 조회하기
![2번 post](./image/2번%20post.png)
3. 3번 post에 대한 comment들 조회하기 (2가지 방법이 있습니다. 2가지 방법 모두 실행해보세요)
![3번 post에 대한 comments들 조회1](./image/3번%20post에%20대한%20comments들%20조회1.png)
![3번 post에 대한 comments들 조회2](./image/3번%20post에%20대한%20comments들%20조회2.png)
4. post 하나 등록하기
![post 등록](./image/post%20등록.png)