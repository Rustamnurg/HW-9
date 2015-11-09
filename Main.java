class Main
{
	public static void main(String[] args) {
    	Weather wthr = new Weather("Облачно", "ливень", 5, 8, 90, 750, 2);
        System.out.println(wthr.toString());

        System.out.println();

        Bus bus = new Bus("wc2000", "green", 40, true, wthr);
        bus.peopleIn(20);
        bus.peopleOut(5);
        System.out.println(bus.toString());

        System.out.println("\n");

        wthr.changeWeatherToSunny();
        System.out.println(wthr.toString()); System.out.println();
        System.out.println(bus.toString());

        System.out.println("\n");

        wthr.changeWeatherToWindy();
        wthr.changeWeatherToCold();
        wthr.changeWeatherToRain();

        System.out.println(wthr.toString()); System.out.println();
        System.out.println(bus.toString());
    }
}
