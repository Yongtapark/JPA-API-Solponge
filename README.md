# SOLPONGE 프로젝트 JPA + API 리펙토링
팀 프로젝트로 진행한 solpongeJPA( https://github.com/Yongtapark/jpaSolponge )를 리펙토링한 개인프로젝트입니다.
## 개발 동기
기존의 개인 프로젝트를 마치고, 이후에 공부를 진행하면서 RESTful API와 최적화에 관심이 생겨 진행하게 되었습니다.

### 사전 요구 사항
Java 11
SpringBoot
Spring Data JPA
QueryDsl
H2 DB
### 엔티티 다이어그램
![제목 없음](https://user-images.githubusercontent.com/91367204/236716137-e9dcd1fb-672e-4145-a857-93c3455d23a9.png)

### 변경점
##### 1. model -> RESTful API 

##### 2. OSIV OFF 를 통한 커넥션 리소스 확보

##### 3. 데이터 쿼리 최적화

##### 4. 데이터 변경 추적
![auditing](https://user-images.githubusercontent.com/91367204/236424026-4bcfa019-7d05-4dc1-a18a-43aaafa5ba73.PNG)

![auditingDB](https://user-images.githubusercontent.com/91367204/236423753-1b4e8584-70dc-471f-933e-ffb7bdbb36b8.PNG)


## 작성자
박용타

Yong-ta Park

bjjtachan@gmail.com
