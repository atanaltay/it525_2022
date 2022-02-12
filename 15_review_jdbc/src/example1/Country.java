package example1;
import java.util.Objects;

//Country entity
public class Country {
	
	private String code, name, region, continent;
	private int population;
	
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public Country(String code, String name, String region, String continent, int population) {
		super();
		this.code = code;
		this.name = name;
		this.region = region;
		this.continent = continent;
		this.population = population;
	}





	@Override
	public String toString() {
		return name;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code);
	}




	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}
	
	

}
