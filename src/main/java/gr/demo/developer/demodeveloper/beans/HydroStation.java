package gr.demo.developer.demodeveloper.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HydroStation {

    private List<Pump> pumps = new ArrayList<>();
    private List<Accumulator> accumulators = new ArrayList<>();

    public HydroStation() {
        pumps.add(new Pump());
    }

    public List<Pump> getPumps() {
        return pumps;
    }

    public void addPump() {
        pumps.add(new Pump());
    }

    public void removePump(int i) {
        if (pumps.size() == 1) {
            return;
        }
        pumps.remove(i);
    }

    public List<Accumulator> getAccumulators() {
        return accumulators;
    }

    public void addAccumulator() {
        accumulators.add(new Accumulator());
    }

    public void removeAccumulator(int i) {
        accumulators.remove(i);
    }

}
