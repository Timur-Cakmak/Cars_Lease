package timur.cakmak.cars_lease.contract;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import timur.cakmak.cars_lease.car.Car;
import timur.cakmak.cars_lease.client.Client;
import timur.cakmak.cars_lease.invoice.Invoice;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="contract")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.DATE)
	private Date startLease;
	@Temporal(TemporalType.DATE)
	private Date endLease;
	private double totalPrice;
	private double advance;
	private double leftToPay;

	private String placeOfReturn;
	
	@ManyToOne
	@JsonProperty(access= Access.WRITE_ONLY)
	private Car car;
	
	@OneToOne(mappedBy = "contract")
	@JsonProperty(access= Access.WRITE_ONLY)
	private Invoice invoice;
	
	@ManyToOne
	@JsonProperty(access= Access.WRITE_ONLY)
	private Client client;
	
	

}
