package calculator;
import camp.nextstep.edu.missionutils.Console;
import method.Method;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            String input = Console.readLine();
            int sum = Method.add(input);
            System.out.println(sum);
        } catch (IllegalArgumentException e) {
            System.out.println("입력 값이 올바르지 않습니다. " + e.getMessage());
            // 필요한 다른 에러 처리
        } finally {
            Console.close();
        }


    }
}
