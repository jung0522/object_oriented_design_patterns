package hw8_1;

//***************************
// 파일명: CommandManager.java
// 작성자: 정준영
// 작성일: 2024-11-05
// 내용: Command 패턴에서 명령을 관리하는 클래스
//***************************

import java.util.ArrayList;
import java.util.List;

// CommandManager 클래스 구현
public class CommandManager {
	
    private final List<Command> operations = new ArrayList<>();
    
    // 산술 연산(+, -, 제곱 연산)을 리스트(ArrayList)에 넣는 addOperation
    public void addOperation(Command command) {
        operations.add(command);
    }
    
    // 순차적으로 처리하는 performOperaton
    public void performOperations() {
        for (Command command : operations) {
            command.execute();
        }
    }
}
