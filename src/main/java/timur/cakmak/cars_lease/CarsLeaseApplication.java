package timur.cakmak.cars_lease;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import timur.cakmak.cars_lease.car.Car;
import timur.cakmak.cars_lease.car.CarService;
import timur.cakmak.cars_lease.contract.Contract;
import timur.cakmak.cars_lease.contract.ContractService;

@SpringBootApplication
public class CarsLeaseApplication implements CommandLineRunner{

	@Autowired
	CarService carService;

	@Autowired
	ContractService contractService;

	public static void main(String[] args) {
		SpringApplication.run(CarsLeaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car car = new Car();

		car.setRegistration("A59BCV95");
		car.setBrand("Mercedes");
		car.setColor("Noir");
		car.setFuel("Sp95");
		car.setPower(2.2);
		car.setMaxSpeed(240);
		car.setKm(60000);
		car.setInUse(false);
		car.setFirstUse(Date.valueOf("2022-02-02"));
		carService.save(car);

		car = new Car();
		car.setRegistration("B65YUV88");
		car.setBrand("BMW");
		car.setColor("Noir");
		car.setFuel("Diesel");
		car.setPower(1.7);
		car.setMaxSpeed(220);
		car.setKm(80000);
		car.setInUse(true);
		car.setFirstUse(Date.valueOf("2022-03-03"));
		carService.save(car);

		car = new Car();
		car.setRegistration("A93YUV03");
		car.setBrand("AUDI");
		car.setColor("Rouge");
		car.setFuel("Diesel");
		car.setPower(1.5);
		car.setMaxSpeed(200);
		car.setKm(30000);
		car.setInUse(false);
		car.setFirstUse(Date.valueOf("2022-03-03"));
		carService.save(car);



		Contract contract = new Contract();

		contract.setDate(Date.valueOf("2022-03-03"));
		contract.setStartLease(Date.valueOf("2022-03-03"));
		contract.setEndLease(Date.valueOf("2022-03-03"));
		contract.setTotalPrice(5000);
		contract.setAdvance(1500);
		contract.setLeftToPay(3500);
		contract.setPlaceOfReturn("Paris");
		contractService.save(contract);


		contract = new Contract();
		contract.setDate(Date.valueOf("2022-03-03"));
		contract.setStartLease(Date.valueOf("2022-03-03"));
		contract.setEndLease(Date.valueOf("2022-03-03"));
		contract.setTotalPrice(5000);
		contract.setAdvance(1500);
		contract.setLeftToPay(3500);
		contract.setPlaceOfReturn("Lille");
		contractService.save(contract);
	}



}
