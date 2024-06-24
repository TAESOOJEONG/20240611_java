import p05_inherit.Ex10Modifier;

public class Ex10protected extends Ex10Modifier {
  String str = protectedVar;
  public Ex10protected(){
    System.out.println(protectedVar);
  }

  void done() {
    System.out.println(publicVar);
    System.out.println(protectedVar);
    //System.out.println(defaultVar);
    //System.out.println(privateVar);

  }

  public static void main(String[] args) {

  }
}
class ModifierEx {
  Ex10Modifier ex10Modifier = new Ex10Modifier();
  void done() {
    System.out.println(ex10Modifier.publicVar);
    /*System.out.println(ex10Modifier.protectedVar);
    System.out.println(ex10Modifier.deafultVar);
    System.out.println(ex10Modifier.privateVar);*/

  }
}

/* 클래스 -> public , default, final, abstract   ::
   메서드 -> all(전부 다), final, abstract, static
   멤버변수 -> all(전부 다), final, static
   지역번수 -> final, var
*/
