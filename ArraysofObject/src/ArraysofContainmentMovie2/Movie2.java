package ArraysofContainmentMovie2;

public class Movie2 {

	private int id;
	private String name;
	private  float rating;
	public Movie2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie2(int id, String name, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	

}
