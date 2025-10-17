package method;
import camp.nextstep.edu.missionutils.test.NsTest;

public class Method {
    public static int add(String input) {
        // input이 문자열을 참조하지 않거나 ""이 비어있을 경우.
        if (input == null || input.isEmpty()){
            throw new IllegalArgumentException("입력 값이 비어 있습니다.");
        };

        return 0;
    }

}
