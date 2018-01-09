package gr.demo.developer.demodeveloper.repositories;

import gr.demo.developer.demodeveloper.api.Pump;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PumpRepository extends PagingAndSortingRepository<Pump, Long> {
}
