package constructorOverLoading;

public class Movie {
	String movieName;
    int seatCount;
    String seatType;
    double pricePerSeat;
    double totalPrice;

    
    Movie(String movieName) {
        this.movieName = movieName;
        this.seatCount = 1;
        this.seatType = "Regular";
        this.pricePerSeat = 150;
        this.totalPrice = seatCount * pricePerSeat;
    }

    
    Movie(String movieName, int seatCount) {
        this.movieName = movieName;
        this.seatCount = seatCount;
        this.seatType = "Regular";
        this.pricePerSeat = 150;
        this.totalPrice = seatCount * pricePerSeat;
    }

    
    Movie(String movieName, int seatCount, String seatType) {
        this.movieName = movieName;
        this.seatCount = seatCount;
        this.seatType = seatType;
        this.pricePerSeat = seatType.equalsIgnoreCase("VIP") ? 300 : 150;
        this.totalPrice = seatCount * pricePerSeat;
    }

    
    Movie(String movieName, int seatCount, String seatType, double pricePerSeat) {
        this.movieName = movieName;
        this.seatCount = seatCount;
        this.seatType = seatType;
        this.pricePerSeat = pricePerSeat;
        this.totalPrice = seatCount * pricePerSeat;
    }

    void display() {
        System.out.println("Movie: " + movieName + "  Seats: " + seatCount + "  Type: " + seatType +"  Total: " + totalPrice); 
                           
                           
                           
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Bahubali");
        m1.display();

        Movie m2 = new Movie("Bahubali", 3);
        m2.display();

        Movie m3 = new Movie("Bahubali", 2, "VIP");
        m3.display();
    }
}
	    

