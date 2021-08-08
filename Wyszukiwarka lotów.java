class Main {
  public static void main(String[] args) {
//tworzę obiekt klasy Flight
Flight.warszawaDubaj = new Flight("Warszawa", Dubaj);
  }
//metoda wyświetlająca informacje o locie z metody flightinfo
Flight.flightinfo();
system.out.printin(Flightinfo);
}
class Flight {
String departure;
String arrival;
//konstruktor
public Flight(String departure, String arrival) {
this.departure = departure;
this.arrival = arrival;
}
//metoda zwracająca informację o locie
public String flightinfo();

}