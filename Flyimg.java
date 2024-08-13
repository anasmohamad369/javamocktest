package test;

public class Flyimg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable spacecraft = new SpaceCraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        // Call the fly_obj() method on each instance
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
	}

}
