public class Bus {
    private String model;
    private String colour;
    private int numberSeats;
    private boolean work;
    public Weather weather;

    public Bus(String model, String colour, int numberSeats, boolean work, Weather weather) {
        this.model = model;
        this.colour = colour;
        this.numberSeats = numberSeats;
        this.work = work;
        this.weather = weather;
    }
    
    public boolean getWork() {
        return this.work;
    }

    public void work() {
        this.work = true;
    }

    public void destroyBus(){
    	this.work = false;
    }
    
    public void peopleIn(int n) {
        this.numberSeats -= n;
    }

    public void peopleOut(int n) {
        this.numberSeats += n;
    }

    public int getFreeSeats(){
        return this.numberSeats;
    }

    public int prognozFreeSeats()//если хорошая погода, большинство пойдет пешком и в автобусе будет больше свободных мест
    {
    	if(!work) return 0;

    	int prognoz = (int)(this.numberSeats * weather.rating * 0.1);
    	if(prognoz > 0) 
    	{
    		if(prognoz > numberSeats) return numberSeats;
    		else return prognoz;
    	}
    	else return 0;
    }

    public String toString() {
        return "Model: " + model +  "\ncolor = " + colour + "\nfree pleac: " + numberSeats +
                "\nthe state of the bus: " + work + "\nprognoz: " + prognozFreeSeats();
    }
}
