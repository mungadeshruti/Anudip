package inheritancedemo;

public class Sports {

	 public void play() {
	        System.out.println("Playing generic sports");
	    }
	}

	// Subclass Football
	class Football extends Sports {
	    @Override
	    public void play() {
	        System.out.println("Playing football");
	    }
	}

	// Subclass Basketball
	class Basketball extends Sports {
	    @Override
	    public void play() {
	        System.out.println("Playing basketball");
	    }
	}

	// Subclass Rugby
	class Rugby extends Sports {
	    @Override
	    public void play() {
	        System.out.println("Playing rugby");
	    }
	}

	public class Sports1 {
	    public static void main(String[] args) {
	        // Creating instances of each sport
	        Sports football = new Football();
	        Sports basketball = new Basketball();
	        Sports rugby = new Rugby();

	        // Calling play() method for each sport
	        football.play();
	        basketball.play();
	        rugby.play();
	    }
	}
