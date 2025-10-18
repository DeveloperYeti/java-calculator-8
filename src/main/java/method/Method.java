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
        return 0;
    }

}
