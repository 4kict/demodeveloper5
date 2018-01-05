package gr.demo.developer.demodeveloper.services;

import gr.demo.developer.demodeveloper.api.HeatExchanger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeatExchangerService {

    private static List<HeatExchanger> repository = new ArrayList<>();

    static {
        repository.add(new HeatExchanger("HERT-01"));
        repository.add(new HeatExchanger("HERT-02"));
        repository.add(new HeatExchanger("HERT-03"));
        repository.add(new HeatExchanger("HERT-04"));
    }

    public List<HeatExchanger> getAll() {
        return repository;
    }

}
