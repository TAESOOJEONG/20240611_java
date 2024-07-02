package p12_database.ui;

import p12_database.dao.MembersDAO;
import p12_database.vo.Members;

import javax.swing.*;
import java.awt.*;

public class FrmJoin extends FrmBasic {
  private JLabel labelID, labelPass, labelPassCheck, labelName, labelMobile, labelJoin;
  private JTextField addID, addName, addMobile;
  private JPasswordField pfPassword, pfPassCheck;
  private JButton btnJoin, btnLogin;


  public FrmJoin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    labelJoin = new JLabel("회원 가입");
    labelJoin.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 35));
    labelJoin.setHorizontalAlignment(JLabel.CENTER);
    labelJoin.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

    labelID = new JLabel("ID");
    labelPass = new JLabel("pass");
    labelPassCheck = new JLabel("pass 확인");
    labelName = new JLabel("이름");
    labelMobile = new JLabel("연락처");

    addID = new JTextField();
    pfPassword = new JPasswordField();
    pfPassCheck = new JPasswordField();
    addName = new JTextField();
    addMobile = new JTextField();

    btnJoin = new JButton("Join");
    btnLogin = new JButton("Login");

    addID.addActionListener(e -> {
      if (!isEmptyId()) pfPassword.requestFocus();
    });
    pfPassword.addActionListener(e -> {
      if (!isEmptyPass()) pfPassCheck.requestFocus();
    });
    pfPassCheck.addActionListener(e -> {
      if (!isEmptyPassCheck()) addName.requestFocus();
    });
    addName.addActionListener(e -> {
      if (!isEmptyName()) addMobile.requestFocus();
    });
    btnJoin.addActionListener(e -> {
      if (!passCheck()) {
        JOptionPane.showMessageDialog(this, "비밀번호를 다시 확인하세요.");
      } else if (fieldCheck()) {
        JOptionPane.showMessageDialog(this,"회원가입이 완료되었습니다.");

        loginAccess(addID.getText(),
            new String(pfPassword.getPassword()),
            addName.getText(),
            addMobile.getText());

        JoinAccess(
            addID.getText(),
            new String(pfPassword.getPassword()),
            addName.getText(),
            addMobile.getText());


      } else {
        JOptionPane.showMessageDialog(this, "모든 창을 채워주세요.");
      }
    });
    btnLogin.addActionListener(e -> {
      new FrmLogin("Welcome Login", 270, 200);
      dispose();

    });
  }

  private void JoinAccess(String id,String pass,String name,String mobile){
    MembersDAO dao = new MembersDAO();
    Members member = new Members(id, pass, name, mobile);
    if(dao.insertMembers(member))
    new FrmMain("Main",400,400);
  }


  private void loginAccess(String id, String pass, String name, String mobile) {
    MembersDAO dao = new MembersDAO();
    Members member = new Members(id, pass, name, mobile);
    new FrmMain("Main", 400, 400);
    dispose();
  }

  private boolean isEmptyId() {
    return addID.getText().trim().isEmpty();
  }

  private boolean isEmptyPass() {
    return new String(pfPassword.getPassword()).trim().isEmpty();
  }

  private boolean isEmptyPassCheck() {
    return new String(pfPassCheck.getPassword()).trim().isEmpty();
  }

  private boolean isEmptyName() {
    return addName.getText().trim().isEmpty();
  }

  private boolean isEmptyMobile() {
    return addMobile.getText().trim().isEmpty();
  }

  private boolean passCheck() {
    return new String(pfPassword.getPassword()).equals(new String(pfPassCheck.getPassword()));
  }

  private boolean fieldCheck() {
    return !isEmptyId() && !isEmptyPass() && !isEmptyPassCheck() && !isEmptyName() && !isEmptyMobile();
  }

  @Override
  public void arrange() {
    setLayout(new GridLayout(7, 2, 5, 5));
    add(labelJoin);
    add(new JLabel());
    add(labelID);
    add(addID);
    add(labelPass);
    add(pfPassword);
    add(labelPassCheck);
    add(pfPassCheck);
    add(labelName);
    add(addName);
    add(labelMobile);
    add(addMobile);
    add(btnJoin);
    add(btnLogin);
  }
}
