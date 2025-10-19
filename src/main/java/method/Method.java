package method;
import camp.nextstep.edu.missionutils.test.NsTest;

public class Method {
    public static int add(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("입력 값이 비어 있습니다.");
        }
        input = input.replace("\\n", "\n");
        String delimiters = "";
        String numbers = input;

        // 커스텀 구분자 정의
        if (input.startsWith("//")) {
            int delimiterEnd = input.indexOf("\n");
            if (delimiterEnd == -1) {
                throw new IllegalArgumentException("커스텀 구분자 형식이 맞지 않습니다.");
            }
            String customDelimiter = input.substring(2, delimiterEnd);
            customDelimiter = customDelimiter.replaceAll("([\\^$|.#,:;])", "\\\\$1");
            delimiters = customDelimiter;
            numbers = input.substring(delimiterEnd + 1);
        }

        // 구분자 결정: 커스텀 구분자, 없으면 쉼표/콜론 등 기본 구분자 사용도 추가 가능
        String[] tokens;
        if (!delimiters.isEmpty()) {
            tokens = numbers.split(delimiters);
        } else {
            // 기본 구분자 예시 (쉼표 ","와 콜론 ":"도 같이)
            tokens = numbers.split(",|:");
        }

        int sum = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                int number = Integer.parseInt(token);
                if (number < 0) {
                    throw new IllegalArgumentException("음수는 사용할 수 없습니다.");

                }
                sum += number;
            }
        }
        return sum;
    }
}



