package timur.cakmak.cars_lease.option;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import timur.cakmak.cars_lease.car.Car;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
@Table(name ="optionn")
public class Option {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String description;
	
	
	@ManyToMany(mappedBy = "options") 
	private List<Car> cars;
	 
	
}
