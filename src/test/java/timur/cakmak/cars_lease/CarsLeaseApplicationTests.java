package timur.cakmak.cars_lease;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;


class CarsLeaseApplicationTests {
	Calculator underTest = new Calculator();

	@Test
	void itShouldAddTwoNumbers() {
		// given
		int numberOne = 20;
		int numberTwo = 30;
		
		//when
		int result = underTest.add(numberOne, numberTwo);
		
		//then
		int expected = 50;
		assertThat(result).isEqualTo(expected);
		//assertEquals("echec",result, expected);
		
	}
	
	class Calculator {
		int add(int a, int b) {
			return a + b;
		}
	}

}
