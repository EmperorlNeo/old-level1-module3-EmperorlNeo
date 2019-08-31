public class NetflixRunner {
	public static void main(String[] args) {
		NetflixQueue net = new NetflixQueue();
		Movie mov1 = new Movie("Star Wars Episode 4", 5);
		Movie mov2 = new Movie("Halloween", 2);
		Movie mov3 = new Movie("War of the Worlds", 3);
		Movie mov4 = new Movie("The Matrix", 4);
		Movie mov5 = new Movie("Gremlins", 4);
		Movie mov6 = new Movie("Wierd Science", 3);
		mov1.getTicketPrice();
		net.addMovie(mov1);
		net.addMovie(mov2);
		net.addMovie(mov3);
		net.addMovie(mov4);
		net.addMovie(mov5);
		net.addMovie(mov6);
		net.sortMoviesByRating();
		net.printMovies();
		net.getBestMovie();
	}

}
//