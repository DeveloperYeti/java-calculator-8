# 요구사항 명세서

## 1. 기능 개요

- 사용자가 입력한 문자열에서 숫자를 추출하여 덧셈을 수행하는 계산기이다.
- 기본 구분자는 쉼표(,) 및 콜론(:)이며, 이 구분자로 숫자를 분리하여 각 숫자의 합을 반환한다.
- 문자열 앞부분에 커스텀 구분자를 지정할 수 있으며, "//{구분자}\n{숫자들}" 형식으로 입력하면 커스텀 구분자를 사용한다.
- 예를 들어, "//;\n1;2;3" 입력 시 구분자는 세미콜론(;)이며, 결과는 6이다.
- 빈 문자열 입력 시 0을 반환한다.

## 2. 입력 및 출력

- 입력: 구분자와 숫자로 구성된 문자열
- 출력: 문자열 내 숫자들의 합 (정수 또는 실수 가능 여부는 추가 설계에 따라 결정)

## 3. 오류 처리 및 예외 상황

- 사용자가 잘못된 값을 입력할 경우 **`IllegalArgumentException`** 예외를 발생 시킨다.
- 예외 발생 시 애플리케이션은 종료한다.
- 구분자가 올바르지 않거나 숫자가 아닌 글자가 포함된 경우 예외 처리한다.

## 4. 처리 흐름

1. 문자열 입력 받기
2. 커스텀 구분자 분리 (기본 값은 쉼표와 콜론)
3. 구분자로 문자열 분리 후 각 요소를 숫자로 변환
4. 숫자들의 합을 계산하여 반환

-필수 구현할 기능 목록

- 두 개 이상의 숫자 및 구분자 입력 후 덧셈 결과 출력.​
- 사용자 입력 오류 처리(예: 숫자가 아닌 입력 시 안내) (IllegalArgumentException
- 구분자 처리 로직 구현
- 


# java-calculator-precourse
- method 폴더 생성 및 클래스 생성 (IllegalAgregumentException) 출력 메세지 작성
- IllegalAgregumentException 삭제
- try Catch문을 통해서 IllegalArgumentException e 예외 처리 앞에서 적은 메서드 Exit 삭제
- \n의 경우에는 실제 개행문자로 변환시키기 위해서 replace를 사용하여 변환
- input.startWith를 사용하여 // 로 커스텀 구분자를 사용하여 시작하는지 검사.
- 커스텀 구분자 로직 if else 부분 변경.
- token 체크하고 받고 합산하는 로직 부분. 음수가 나올 경우에는 IllegalArgumentException이 나오도록 추가.
- Application 에서 test 코드를 진행할 경우에 try catch 문에서 예외를 잡아버린 뒤 다시 던지지 않아서 추가로 던지기 위해 thorw e 추가. → 테스트를 감지 할 수 있게 함.
- while(true)를 사용 Application이 종료되지 않도록 함. 추가 사항으로 console.close()를 바깥으로 빼고 예외상황의 경우 break 문을 추가하여 console.close()로 빠질 수 있게 로직 수정 ** (삭제) 테스트 이슈
- Sout - > 덧셈할 문장을 입력해 주세요. -> 추가
- 테스트 코드 IllegalArgumentExaception이 예외 처리 되어서 한번더 throw e 로 에러 코드 던짐. 추가 사항으로 while문을 사용할 경우 코드가 죽지 않아서 첫번째 Test 오류 발생 while 문 삭제.

**추가 사항으로 intellij에서 Application 메인문 실행 시 무한 로딩 되는 현상 발생. setting -> build - > build tool -> Gradle -> 빌드 실행과 테스트 실행을 Gradle -> intellij IDEA로 변경.**
