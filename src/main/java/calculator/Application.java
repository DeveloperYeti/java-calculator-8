package calculator;

import camp.nextstep.edu.missionutils.Console;
import method.Method;

public class Application {
    public static void main(String[] args) {
        while (true) {
            try {
                String input = Console.readLine();
                int sum = Method.add(input);
                System.out.println("결과 : " + sum);

            } catch (IllegalArgumentException e) {
                System.out.println("입력 값이 올바르지 않습니다. " + e.getMessage());
                break; // 정상 종료
            }
        }
        Console.close(); // << 반복문 바깥에서 호출
    }
}