package co.com.udem.paisafliz.DTO;

public class MovieDTO {
	private String name;
	private short year;
	
	public MovieDTO(String name, short year) {
		super();
		this.name = name;
		this.year = year;
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
	 * @return the year
	 */
	public short getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(short year) {
		this.year = year;
	}
	
}
