class Main {
  public static void main(String[] args) {
      MobilePhone phone = new MobilePhone("200g");
       System.out.println(phone.weight);

       MobilePhone oldPhone = new MobilePhone("4000g");
       System.out.println(oldPhone.weight);

       MobilePhone mediumPhone = new MobilePhone("600g");
       System.out.println(mediumPhone.weight);
  }
}

class MobilePhone {
  String weight;

  public MobilePhone(String weight) {
    this.weight = weight;
  }
}