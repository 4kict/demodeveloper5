package gr.demo.developer.demodeveloper.repositories;

import gr.demo.developer.demodeveloper.api.FilterCircuit;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilterCircuitRepository extends PagingAndSortingRepository<FilterCircuit, Long> {
    List<FilterCircuit> findByType(@Param("type") String type);
}
