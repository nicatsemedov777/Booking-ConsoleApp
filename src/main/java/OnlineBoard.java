public class OnlineBoard implements Runnable {
    private PersonController personController = new PersonController(new PersonServiceImpl(new PersonDaoImpl()));
    private FlightController flightController = new FlightController(new FlightServiceImpl(new FlightDaoImpl()));
    private BookingController bookingController = new BookingController(new BookingServiceImpl(new BookingDaoImpl()));

    public OnlineBoard() {
    }


    public void run() {
        Thread thread = new Thread();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            showCommands();
            int command = sc.nextInt();
            switch (command) {
                case 1 -> {
                    sc = new Scanner(System.in);
                    String departureCity = sc.nextLine();
                    System.out.println(flightController.getAllFlightsFromOneOfCity(departureCity));
                }

                case 2 -> {
                    sc = new Scanner(System.in);
                    String flightNumber = sc.nextLine();
                    System.out.println(flightController.getFlightsByFlightNumber(flightNumber));
                }
               case 3->{
                   sc = new Scanner(System.in);
                   String destination = sc.nextLine();
                   int seats = sc.nextInt();
                   System.out.println(flightController.searchTicket(destination,seats));

               }
//                case 4->
//                case 5->
//                case 6->

            }
        }
    }

    private void showCommands() {
        Arrays.stream(Commands.values())
                .forEach(it -> System.out.printf("%s - %s \n", it, it.getValue()));
    }
}
