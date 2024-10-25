package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    public List<String> readNameList() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        if (input.isBlank()) {
            throw new IllegalArgumentException("빈 문자열이 입력되었습니다.");
        }

        List<String> nameList = List.of(input.split(","));
        return nameList.stream()
                .map(String::trim)
                .toList();
    }

    public int readCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        if (input.isBlank()) {
            throw new IllegalArgumentException("빈 문자열이 입력되었습니다.");
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수가 입력되지 않았습니다.");
        }
    }
}