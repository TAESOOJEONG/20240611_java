package p11_network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Ex01TcpipMultiChatCliant extends JFrame {
  public static void main(String[] args) {
    new Ex01TcpipMultiChatCliant();
  }

  private JTextArea ta;
  private JScrollPane scp;
  private JTextField tf;
  private String nickname;
  private DataOutputStream out;

  public Ex01TcpipMultiChatCliant() throws HeadlessException {
    init();
    arrange();
    inflate();
  }

  private void init() {
    nickname = JOptionPane.showInputDialog("Input Nickname");
    String ip = JOptionPane.showInputDialog("Server IP", "10.100.204.26");

    ta = new JTextArea();
    ta.setEditable(false);
    scp = new JScrollPane(ta);
    tf = new JTextField();
    ta.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
    tf.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
    try {
      // 외부로 보내는 파이프
      Socket socket = new Socket(ip, 7777);
      out = new DataOutputStream(socket.getOutputStream());
      out.writeUTF(nickname);
       new Thread(new Receiver(socket)).start(); // implements Runnable
      //new Receiver().start(); // extends Thread 일 때

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    tf.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          out.writeUTF(nickname + " : " + tf.getText());
        } catch (IOException ex) {
          throw new RuntimeException(ex);
        }
      }
    });
  }

  private void arrange() {
    add(scp, "Center");
    add(tf, "South");
  }

  private void inflate() {
    setTitle("Chatting Room");
    setSize(350, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(this);
    setVisible(true);
  }

  class Receiver implements Runnable {
    // class Receiver extends Thread{
    DataInputStream in;

    public Receiver(Socket socket) {

      try {
        in = new DataInputStream(socket.getInputStream());
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public void run() {
      while (in != null) {
        try {
          String msg = in.readUTF();
          System.out.println(msg);
          // JTextArea.

        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}

// 입력 후 글자 지워지게 , 외부 메세지를 textArea에 보이게 하기
