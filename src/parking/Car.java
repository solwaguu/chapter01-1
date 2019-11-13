package parking;

public abstract class Car  implements Parkable {
	int speed;
	void run() {
		System.out.println("달리다.");
	}
}
