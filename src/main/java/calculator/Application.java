package calculator;

import camp.nextstep.edu.missionutils.Console;
import method.Method;

public class Application {
    public static void main(String[] args) {
            try {
                System.out.println("덧셈할 문자열을 입력해 주세요.");
                String input = Console.readLine();
                int sum = Method.add(input);
                System.out.println("결과 : " + sum);

            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 입력 값 입니다 프로그램을 종료합니다..");
                throw e;
            }
        }

    }
