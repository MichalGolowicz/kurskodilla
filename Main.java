class Main {
  public static void main(String[] args) {
      MobilePhone phone = new MobilePhone("200g", 700);
       System.out.println(phone.weight + " " + phone.price);
       phone.displayValues();
       String parameters = phone.getParameters();
       System.out.println(parameters);
       MobilePhone oldPhone = new MobilePhone("4000g", 100);
       System.out.println(oldPhone.weight);

       MobilePhone mediumPhone = new MobilePhone("600g", 340);
       System.out.println(mediumPhone.weight);
  }
}

class MobilePhone {
  String weight;
  int price;

  public MobilePhone(String weight, int price) {
    this.weight = weight;
    this.price = price;
  }

  public void dispalyValues() {
    System.out.println(this.weight + " " + this.price);
  }

  public String getParameters() {
    return this.weight + " " + this.price;
  }
}