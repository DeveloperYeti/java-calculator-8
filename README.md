# java-calculator-precourse
- method 폴더 생성 및 클래스 생성 (IllegalAgregumentException) 출력 메세지 작성
- IllegalAgregumentException 삭제
- try Catch문을 통해서 IllegalArgumentException e 예외 처리 앞에서 적은 메서드 Exit 삭제
- \n의 경우에는 실제 개행문자로 변환시키기 위해서 replace를 사용하여 변환
- input.startWith를 사용하여 // 로 커스텀 구분자를 사용하여 시작하는지 검사.
- 커스텀 구분자 로직 if else 부분 변경.
- token 체크하고 받고 합산하는 로직 부분. 음수가 나올 경우에는 IllegalArgumentException이 나오도록 추가.
- Application 에서 test 코드를 진행할 경우에 try catch 문에서 예외를 잡아버린 뒤 다시 던지지 않아서 추가로 던지기 위해 thorw e 추가. → 테스트를 감지 할 수 있게 함.
