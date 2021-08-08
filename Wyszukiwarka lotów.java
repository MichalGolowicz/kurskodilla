class Main {
  public static void main(String[] args) {
//tworzę obiekty klasy Flight
Flight warszawaDubaj = new Flight("Warszawa", "Dubaj");
String parameters = warszawaDubaj.getFlight();
       System.out.println(parameters);

Flight berlinMoskwa = new Flight("Berlin", "Moskwa");

Flight londynKraków = new Flight("Londyn", "Kraków");

  }
}
class Flight {
String departure;
String arrival;
//konstruktor klasy Flight
public Flight(String departure, String arrival) {
this.departure = departure;
this.arrival = arrival;
}
//metoda zwracająca informację o locie
public String getFlight() {
    return this.departure + " " + this.arrival;
}
}