package p02_variable;

import org.w3c.dom.ls.LSOutput;

public class Ex04boolean {

  public static void main(String[] args) {
    Tv tv = new Tv();
    System.out.println(tv.power);
    System.out.println(tv.channel);
    System.out.println(tv.volume);
    tv.power = true;
    System.out.println(tv.power);
    tv.power();
    tv.power();
    tv.power();
    tv.power();
    tv.channelup();
    tv.channelup();
    tv.channelup();
    tv.channelup();
    tv.channeldown();
    tv.volumeup();
    tv.volumeup();
    tv.volumeup();
    tv.volumeup();
    tv.volumedown();
    tv.volumedown();
    tv.channel(12);
    tv.tvon();

  }
}

class Tv {
  boolean power;
  int channel;
  int volume;

  void power() {

    /*
    1)번
    if (power == false) {
          power = true;
      System.out.println
    } else {
          power = false;
      System.out.println
    }
    if (power == true) {
      System.out.println("Tv 전원이 켜졌습니다.");
    } else {
      System.out.println("Tv 전원이 꺼졌습니다.");
    }*/

    /*  2)번
    if (power == false) {
    power = true;("Tv 전원이 켜졌습니다.");
    System.out.println
  } else {
    power = false;("Tv 전원이 꺼졌습니다.");
    System.out.println
  }*/
    //3번
    power = !power;
    System.out.println(power ? "전원ON" : "전원OFF");
  }

  void channelup() {
    channel = channel + 1;
    System.out.println("채널을 1칸 올립니다."+channel);
  }

  void channeldown() {
    channel = channel -1;
    System.out.println("채널을 1칸 내립니다."+channel);
  }

 void volumeup(){
    volume += 1;
    System.out.println("볼륨을 1칸 올립니다."+volume);
  }

  void volumedown(){
    System.out.println("볼륨을 1칸 내립니다."+ --volume);
  }

//
  void channel(int channel){
    this.channel = channel;
    System.out.println(channel);
  }
  void tvon() {
    if (power) {
      System.out.println("Tv를 켰을 때 " + 07);
    }
  }



}