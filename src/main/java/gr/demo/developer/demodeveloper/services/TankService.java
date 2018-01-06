package gr.demo.developer.demodeveloper.services;

import gr.demo.developer.demodeveloper.api.Tank;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TankService {

    private static List<Tank> repository = new ArrayList<>();

    static {
        repository.add(new Tank("TNK-110"));
        repository.add(new Tank("TNK-111"));
        repository.add(new Tank("TNK-112"));
        repository.add(new Tank("TNK-113"));
        repository.add(new Tank("TNK-114"));
    }

    public List<Tank> getAll() {
        return repository;
    }
}
