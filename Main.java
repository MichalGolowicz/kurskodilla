class Main {
  public static void main(String[] args) {
      MobilePhone phone = new MobilePhone("200g");
       System.out.println(phone.weight);
  }
}

class MobilePhone {
  String weight;

  public MobilePhone(Strign weight) {
    this.weight = weight;
  }
}