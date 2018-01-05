package gr.demo.developer.demodeveloper.jsfBeans;

import gr.demo.developer.demodeveloper.api.*;
import gr.demo.developer.demodeveloper.services.FilterCircuitService;
import gr.demo.developer.demodeveloper.services.HeatExchangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * типа контроллера/сервиса для JSF
 */
@Component
public class HydroStationHandler {

    @Autowired
    private FilterCircuitService filterCircuitService;
    @Autowired
    private HeatExchangerService heatExchangerService;

    private HydroStation hydroStation = new HydroStation();
    private Boolean filterCircuitRequired;
    private Boolean heatExchangerRequired;

    public List<Pump> getPumps() {
        return hydroStation.getPumps();
    }

    public void removePump(int i) {
        if (hydroStation.pumpCount() == 1) {
            return;
        }
        hydroStation.removePump(i);
    }

    public void addPump() {
        hydroStation.addPump();
    }

    public List<Accumulator> getAccumulators() {
        return hydroStation.getAccumulators();
    }

    public void addAccumulator() {
        hydroStation.addAccumulator();
    }

    public void removeAccumulator(int i) {
        hydroStation.removeAccumulator(i);
    }

    public Integer getPower() {
        return hydroStation.getPower();
    }

    /**
     * Вернет подходящие контуры фильтрации
     *
     * @return
     */
    public List<FilterCircuit> getSuitableFilterCircuits() {
        return filterCircuitService.getAll();
    }

    public List<HeatExchanger> getSuitableHeatExchangers() {
        return heatExchangerService.getAll();
    }

    /**
     * Вернет рекомендуемый контур фильтрации
     *
     * @return
     */
    public FilterCircuit getRecommendedFilterCircuit() {
        return filterCircuitService.getAll().get(1);
    }

    public HeatExchanger getRecommendedHeatExchanger() {
        return heatExchangerService.getAll().get(2);
    }

    public FilterCircuit getFilterCircuit() {
        if (filterCircuitRequired == null) {
            hydroStation.setFilterCircuit(getRecommendedFilterCircuit());
            filterCircuitRequired = true;
        }
        return hydroStation.getFilterCircuit();
    }

    public void setFilterCircuit(FilterCircuit filterCircuit) {
        if (filterCircuitRequired) {
            hydroStation.setFilterCircuit(filterCircuit);
        }
    }

    public HeatExchanger getHeatExchanger() {
        if (heatExchangerRequired == null) {
            hydroStation.setHeatExchanger(getRecommendedHeatExchanger());
            heatExchangerRequired = true;
        }
        return hydroStation.getHeatExchanger();
    }

    public void setHeatExchanger(HeatExchanger heatExchanger) {
        if (heatExchangerRequired) {
            hydroStation.setHeatExchanger(heatExchanger);
        }
    }

    public Boolean getFilterCircuitRequired() {
        if (filterCircuitRequired == null) {
            hydroStation.setFilterCircuit(getRecommendedFilterCircuit());
            filterCircuitRequired = true;
        }
        return filterCircuitRequired;
    }

    public void setFilterCircuitRequired(Boolean filterCircuitRequired) {
        this.filterCircuitRequired = filterCircuitRequired;
        if (!filterCircuitRequired) {
            hydroStation.setFilterCircuit(null);
            return;
        }
        hydroStation.setFilterCircuit(getRecommendedFilterCircuit());
    }

    public Boolean getHeatExchangerRequired() {
        if (heatExchangerRequired == null) {
            hydroStation.setHeatExchanger(getRecommendedHeatExchanger());
            heatExchangerRequired = true;
        }
        return heatExchangerRequired;
    }

    public void setHeatExchangerRequired(Boolean heatExchangerRequired) {
        this.heatExchangerRequired = heatExchangerRequired;
        if (!heatExchangerRequired) {
            hydroStation.setHeatExchanger(null);
            return;
        }
        hydroStation.setHeatExchanger(getRecommendedHeatExchanger());
    }
}
