# movieDBservice

![img](https://cdn.pixabay.com/photo/2017/04/29/11/35/movie-2270554__340.png)

## [주제] 📽️ 영화관 티켓관리 Database CRUD로 구현하기
- 사용자별로 영화명, 좌석, 가격, 상영날짜 등의 정보를 저장하는 CRUD 프로그램을 구현할 예정입니다.

## [소개]
- 영화관람정보에 관한 Database를 관리하기 위한 CRUD 서비스

| 데이터명 | TYPE | Sample Data | 설명 |
| ------ | -- | -- | ----------- |
| name | 문자열(공백포함X) | ssu | 예약자의 이름 |
| movie_name | 문자열(공백포함X) | 아바타 | 영화 제목 |
| seat | A14 | 문자열(공백포함X) | 티켓좌석 |
| movie_price | 정수형(int) | 15000 | 영화 가격 |
| date | 문자열(char-공백포함X) | 20230504 | 상영날짜 |
| movie_room | 정수형(int) | 7 | 상영관 |
| reserve_seat | 정수형 | 0 | 예약되어있으면 1 아니면 0 |

## [필요기능]_함수구현

| 기능종류 | 작업 완료 여부 | 구현해야할 내용 |
| ------ | -- |----------- |
| 추가 |  | 데이터 추가 (name, movie_name, seat, movie_price, date, movie_room) |
| 삭제 |  | 데이터 삭제 (name, movie_name, seat, movie_price, date, movie_room) |
| 조회 |  | 데이터 조회 |
| 수정 |  | 데이터 선택적 수정 |
| 파일저장/불러오기  |  | 파일저장, 시작할때 저장된 txt파일 불러오기 |
| 예약자 이름으로 검색 |  | name으로 검색하여 데이터 정보 조회하기 |
| 영화명으로 검색 |  | movie_name으로 검색하여 데이터 정보 조회하기 |
| 상영관별 잔여좌석 확인 |  | movie_room으로 검색하여 상영관별 남은 좌석 몇 좌석인지 조회하기 |
| 영화관 화면 그리는 함수 |  | 영화관 정보를 콘솔로 그리는 함수 |
- 좌석 선택시 좌석 

## [개발환경]
- VSCode

## [개발언어] 
- C++

## [팀원 및 역할]
- 22200709 조아민: DataBase 관리
- 22200733 최동빈: CRUD 함수 관리
- 22200809 황수현: Class관련 함수 관리 
