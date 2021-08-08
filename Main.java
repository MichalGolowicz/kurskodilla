class Main {
  public static void main(String[] args) {
      //tworzymy obiekt phone
      MobilePhone phone = new MobilePhone("200g", 700);
       phone.displayValues();
       String parameters = phone.getParameters();
       System.out.println(parameters);
      //tworzymy obiekt oldPhone
       MobilePhone oldPhone = new MobilePhone("4000g", 100);
          oldPhone.displayValues();
      //tworzymy obiekt mediumPhone
       MobilePhone mediumPhone = new MobilePhone("600g", 340);
      mediumPhone.displayValues();
  }
}

class MobilePhone {
  String weight;
  int price;
//konstruktor klasy MobilePhone
  public MobilePhone(String weight, int price) {
    this.weight = weight;
    this.price = price;
  }
//metoda wyświetlająca wartości zmiennych weight i price
//dla każdego obiektu klasy MobilePhone
  public void displayValues() {
    System.out.println(this.weight + " " + this.price);
  }
//metoda zwracająca string składający się z wartości weight i price
  public String getParameters() {
    return this.weight + " " + this.price;
  }
}