
public class BusReservationSystem{
	

	public static void main(String[] args){
			BusReservation br = new BusReservation();
			PassengerThread pt1 = new PassengerThread(2,br,"Chandan");
			PassengerThread pt2 = new PassengerThread(2, br, "Raja");
			pt1.start();
			pt2.start();
			}
}
