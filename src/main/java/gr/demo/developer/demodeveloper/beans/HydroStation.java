package gr.demo.developer.demodeveloper.beans;

import gr.demo.developer.demodeveloper.services.FilterCircuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HydroStation {

    @Autowired
    FilterCircuitService filterCircuitService;

    private List<Pump> pumps = new ArrayList<>();
    private List<Accumulator> accumulators = new ArrayList<>();
    private FilterCircuit filterCircuit;
    private HeatExchanger heatExchanger;

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

    public FilterCircuit getFilterCircuit() {
        return filterCircuit;
    }

    public void setFilterCircuit(FilterCircuit filterCircuit) {
        this.filterCircuit = filterCircuit;
    }

    public void removeFilterCircuit() {
        this.filterCircuit = null;
    }

    public HeatExchanger getHeatExchanger() {
        return heatExchanger;
    }

    public void setHeatExchanger(HeatExchanger heatExchanger) {
        this.heatExchanger = heatExchanger;
    }

    public Integer getPower() {
        return pumps.stream().mapToInt(Pump::getPower).sum();
    }

}
