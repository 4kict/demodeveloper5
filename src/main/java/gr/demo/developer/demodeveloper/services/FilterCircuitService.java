package gr.demo.developer.demodeveloper.services;

import gr.demo.developer.demodeveloper.api.FilterCircuit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterCircuitService {

    private static List<FilterCircuit> repository = new ArrayList<>();

    static {
        repository.add(new FilterCircuit("ASD-11"));
        repository.add(new FilterCircuit("ASD-33"));
        repository.add(new FilterCircuit("GHS-55"));
        repository.add(new FilterCircuit("DFEI-2f"));

    }

    public List<FilterCircuit> getAll() {
        return repository;
    }

}
