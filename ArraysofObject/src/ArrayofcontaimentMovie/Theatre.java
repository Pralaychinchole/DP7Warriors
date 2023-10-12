package ArrayofcontaimentMovie;

public class Theatre {

	private String  t_name;
	private float price;
	private Movie movie;
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Theatre(String t_name, float price, Movie movie) {
		super();
		this.t_name = t_name;
		this.price = price;
		this.movie = movie;
	}
	/**
	 * @return the t_name
	 */
	public String getT_name() {
		return t_name;
	}
	/**
	 * @param t_name the t_name to set
	 */
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}
	/**
	 * @param movie the movie to set
	 */
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Theatre [t_name=" + t_name + ", price=" + price + ", movie=" + movie + "]";
	}
	
	
	
	
	
}
