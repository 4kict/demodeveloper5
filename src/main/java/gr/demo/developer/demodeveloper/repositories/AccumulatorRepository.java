package gr.demo.developer.demodeveloper.repositories;

import gr.demo.developer.demodeveloper.api.Accumulator;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AccumulatorRepository extends PagingAndSortingRepository<Accumulator, Long> {
}
