

import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args) {
    Random random = new Random();
    String[] choices = {"가위", "바위", "보"};

    // JOptionPane을 사용하여 입력 받기
    String userChoice = JOptionPane.showInputDialog(null, "가위, 바위, 보 중 하나를 입력하세요:", "가위바위보 게임", JOptionPane.QUESTION_MESSAGE);

    // 사용자 입력이 null(취소 버튼 클릭)인 경우 종료
    if (userChoice == null) {
      JOptionPane.showMessageDialog(null, "게임을 종료합니다.", "가위바위보 게임", JOptionPane.INFORMATION_MESSAGE);
      return;
    }

    int computerIndex = random.nextInt(3);
    String computerChoice = choices[computerIndex];

    String resultMessage = "사용자 선택: " + userChoice + "\n컴퓨터 선택: " + computerChoice + "\n";

    if (userChoice.equals(computerChoice)) {
      resultMessage += "비겼습니다!";
    } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
        (userChoice.equals("바위") && computerChoice.equals("가위")) ||
        (userChoice.equals("보") && computerChoice.equals("바위"))) {
      resultMessage += "사용자가 이겼습니다!";
    } else {
      resultMessage += "컴퓨터가 이겼습니다!";
    }

    JOptionPane.showMessageDialog(null, resultMessage, "결과", JOptionPane.INFORMATION_MESSAGE);
  }
}
