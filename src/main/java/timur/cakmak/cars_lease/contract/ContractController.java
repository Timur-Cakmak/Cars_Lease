package timur.cakmak.cars_lease.contract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/contracts")
@CrossOrigin(origins = "http://localhost:3000")
public class ContractController {
	@Autowired
	ContractService contractService;

	@GetMapping("/{id}")
    public ResponseEntity<Contract> getContractById(@PathVariable("id") long id) {
        Contract contract = contractService.getContractById(id);

        if (contract != null)
        	return new ResponseEntity<>(contract,HttpStatus.OK);
        else
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

//	@GetMapping("/contract/{id}")
//	public ResponseEntity<Contract> getContractById(@PathVariable("id") long id) {​​
//      Optional<Contract> oContract = Optional.of(contractService.getContractById(id));
//
//      if (oContract.isPresent())
//          return new ResponseEntity<>(oContract.get(),HttpStatus.OK);
//      else
//          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//	}

	@GetMapping("/")
	public List<Contract> getAllContract() {
		return contractService.getAllContract();
	}
	
	@PostMapping
	public ResponseEntity<Contract> createCar(@RequestBody Contract contract) {
		try {
			Contract createdContract = contractService.save(contract);
			return new ResponseEntity<>(createdContract, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
