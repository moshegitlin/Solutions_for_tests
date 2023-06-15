package spring_2022_first_term.Q12;

public class Airport {
    private Flight[] flightsSchedule;
    private int numOfFlights;

    public Airport(int flightNum) {
        this.flightsSchedule = new Flight[flightNum];
        this.numOfFlights = 0;
    }

    public boolean setFlight(Flight flight) {
        if (numOfFlights >= flightsSchedule.length) return false;
        this.flightsSchedule[numOfFlights++] = flight;
        return true;
    }
    public Time firstFlightToPlace(String place){
        Time firs = null;
        for (Flight f: flightsSchedule){
            if (f.getDestination().equals(place)) {
                firs = f.getDepartureTime();
                break;
            }

        }
        if (firs == null) return null;
        for (Flight f: flightsSchedule){
            if(f!= null&& f.getDestination().equals(place)&& f.getDepartureTime().before(firs))
                firs = f.getDepartureTime();
        }
        return firs;
    }
    private Flight isThereFlightNum(String codeF){
        for (int i = 0; i < numOfFlights; i++) {
            if (flightsSchedule[i].getCode().equals(codeF)) return flightsSchedule[i];
        }
       return null;
    }
    public boolean movePassengers(String codeF, int num){
        Flight first = isThereFlightNum(codeF);
        if (first == null) {
            System.out.println("Invalid flight number");
            return false;
        }
        Flight second = new Flight(first);
        System.out.println(second);
        for (int i = 0; i < numOfFlights; i++) {
            if (flightsSchedule[i].getDestination().equals(second.getDestination())&&
            flightsSchedule[i].getArrivalTime().before(second.getArrivalTime()))
                second = flightsSchedule[i];
        }
        if (second.getCode().equals(first.getCode()) || !(second.addPassengers(num))) {
            System.out.println("It is not possible to transfer the passengers");
            return false;
        }
        System.out.println(second.getCode());
        first.setNumOfPassengers(first.getNumOfPassengers()-num);
       return true;
    }


}
