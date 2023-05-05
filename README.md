# SOLPONGE 프로젝트 JPA + API 리펙토링
팀 프로젝트로 진행한 solpongeJPA( https://github.com/Yongtapark/jpaSolponge )를 리펙토링한 개인프로젝트입니다.
## 개발 동기
기존의 개인 프로젝트를 마치고, 이후에 공부를 진행하면서 RESTful API와 최적화에 관심이 생겨 진행하게 되었습니다.
### 웹 실행 전 사전준비 (데이터 세팅) !! 현재 '사람인_공고별_데이터_03.csv' 가 깃에 올라가지 않아 작업중 !!
1. `scarpData` 디렉토리로 이동합니다.
cd scarpData
2. H2 DB에 `TableQuery`를 사용하여 테이블을 생성합니다.
3. `bookDataForH2.py`를 실행합니다.
python bookDataForH2.py
4. `JobDataForH2.py`를 실행합니다.
python JobDataForH2.py
5. 이제 준비가 끝났습니다.

### 사전 요구 사항
Java 11
SpringBoot
JPA
QueryDsl
H2 DB
### 변경점
##### 1. 디렉토리 구조 및 명칭 변경

##### 2. 도메인

##### 3.로직 단순화

## 작성자
박용타

Yong-ta Park

bjjtachan@gmail.com
