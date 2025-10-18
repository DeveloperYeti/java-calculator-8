package calculator;
import camp.nextstep.edu.missionutils.Console;
import method.Method;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            String input = Console.readLine();
            int sum = Method.add(input);
            System.out.println("결과 : " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println("입력 값이 올바르지 않습니다. " + e.getMessage());
            // 테스트에서 예외를 감지하도록 다시 던짐
            throw e;
        } finally {
            Console.close();
        }
    }
}
