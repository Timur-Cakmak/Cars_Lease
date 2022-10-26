package timur.cakmak.cars_lease.car;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import timur.cakmak.cars_lease.option.Option;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String registration;
	private String brand;
	private String color;
	private String fuel;
	private double power;
	private int maxSpeed;
	private int km;
	private boolean inUse;
	@Temporal(TemporalType.DATE)
	private Date firstUse;

	
	@ManyToMany
	private List<Option> options;
}


