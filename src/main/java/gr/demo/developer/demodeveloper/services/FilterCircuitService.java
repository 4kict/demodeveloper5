package gr.demo.developer.demodeveloper.services;

import gr.demo.developer.demodeveloper.api.FilterCircuit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilterCircuitService {

    private static List<FilterCircuit> repository = new ArrayList<>();

    static {
        repository.add(new FilterCircuit("FGH-11"));
        repository.add(new FilterCircuit("FLT-33"));
        repository.add(new FilterCircuit("FER-55"));
        repository.add(new FilterCircuit("FOEP-2f"));

    }

    public List<FilterCircuit> getAll() {
        return repository;
    }

}
