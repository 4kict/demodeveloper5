package gr.demo.developer.demodeveloper.repositories;

import gr.demo.developer.demodeveloper.api.Tank;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TankRepository extends PagingAndSortingRepository<Tank, Long> {
}
