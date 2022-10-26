package timur.cakmak.cars_lease.contract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
	@Autowired
	ContractRepository contractRepository;

	public Contract save(Contract contract) {
		return contractRepository.save(contract);
	}

	public List<Contract> getAllContract() {
		return contractRepository.findAll();
	}

	public Contract getContractById(Long id) {
//		return contractRepository.findById(id).get();
		return contractRepository.findById(id).orElse(null);
	}
}
