package timur.cakmak.cars_leaseTests.car;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import timur.cakmak.cars_lease.car.Car;

public interface CarRepositoryTests extends JpaRepository<Car, Long> {
	List<Car> findByRegistration(String registration);
	List<Car> findByBrandContaining(String brand);
	List<Car> findByColor(String color);
	List<Car> findByFuel(String fuel);
	List<Car> findByPower(double power);
	List<Car> findByMaxSpeed(int maxSpeed);
	List<Car> findByKm(int Km);
	List<Car> findByInUse(boolean inUse);
	List<Car> findByFirstUse(Date firstUse);
}
