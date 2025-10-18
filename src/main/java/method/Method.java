package method;
import camp.nextstep.edu.missionutils.test.NsTest;

public class Method {
    public static int add(String input) {
        // input이 문자열을 참조하지 않거나 ""이 비어있을 경우.
        if (input == null || input.isEmpty()){
            throw new IllegalArgumentException("입력 값이 비어 있습니다.");
        };
        String delimiters = ""; // 기본 구분자 없음
        String numbers = input;
        //  \n의 경우에는 실제 개행문자로 변환시키기 위해서 replace를 사용하여 변환.
        input = input.replace("\\n", "\n");
        // 커스텀 구분자 지원
        //  "// 구분자 \n으로 정의하는 표준때문에 startsWith를 사용하여 특정 문자로 시작하는지 검사.
        if(input.startsWith("//")){
            // 구분자 정의에 의해서 끝에 \n이 나오는 위치 검사. 구분자 구간과 숫자 경계
            int delimiterEnd = input.indexOf("\n");
            // 개행 문자 없을시 IllegalArgumentException을 사용한 예외처리.
            if(delimiterEnd == -1){throw new IllegalArgumentException("커스텀 구분자 형식이 맞지 않습니다.");
            }
            // 앞에 구분자 끝난 바로 뒤 개행 전 부분을 커스텀 구분자 추출.
            String customDelimiter = input.substring(2,delimiterEnd);
            //커스텀 구분자 될 수 있는 문자들을 이스케이프 처리해서 안전하게 정규식 구분자로 전환.
            customDelimiter = customDelimiter.replaceAll("([\\^$|?.*+(){}!@#,:;'-_~`><])", "\\\\$1");
            // 구분자 문자열에 저장하여 나중에 분리할 때 사용.
            delimiters = customDelimiter;



        }

        return 0;
    }

}
