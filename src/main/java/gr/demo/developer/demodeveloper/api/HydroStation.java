package gr.demo.developer.demodeveloper.api;

import java.util.ArrayList;
import java.util.List;

public class HydroStation {

    private List<Pump> pumps = new ArrayList<>();
    private List<Accumulator> accumulators = new ArrayList<>();
    private FilterCircuit filterCircuit;
    private HeatExchanger heatExchanger;
    private Tank tank;

    public HydroStation() {
        pumps.add(new Pump());
    }

    public List<Pump> getPumps() {
        return pumps;
    }

    public void addPump() {
        pumps.add(new Pump());
    }

    public int pumpCount() {
        return pumps.size();
    }

    public void removePump(int i) {
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

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
