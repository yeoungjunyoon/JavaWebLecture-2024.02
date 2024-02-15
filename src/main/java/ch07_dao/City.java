package ch07_dao;

public class City {
	private int id;
	private String name;
	private String countrycode;
	private String district;
	private int population;

	public City() { }
	public City(String name, String countrycode, String district, int population) {
		this.name = name;
		this.countrycode = countrycode;
		this.district = district;
		this.population = population;
	}
	public City(int id, String name, String countrycode, String district, int population) {
		this.id = id;
		this.name = name;
		this.countrycode = countrycode;
		this.district = district;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countrycode=" + countrycode + ", district=" + district
				+ ", population=" + population + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
