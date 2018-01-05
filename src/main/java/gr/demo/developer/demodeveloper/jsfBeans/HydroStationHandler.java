package gr.demo.developer.demodeveloper.jsfBeans;

import gr.demo.developer.demodeveloper.api.Accumulator;
import gr.demo.developer.demodeveloper.api.FilterCircuit;
import gr.demo.developer.demodeveloper.api.HydroStation;
import gr.demo.developer.demodeveloper.api.Pump;
import gr.demo.developer.demodeveloper.services.FilterCircuitService;
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
    private HydroStation hydroStation = new HydroStation();
    private Boolean filterCircuitRequired;

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
    public List<FilterCircuit> getSuitableFilterCircuit() {
        return filterCircuitService.getAll();
    }

    /**
     * Вернет рекомендуемый контур фильтрации
     *
     * @return
     */
    public FilterCircuit getRecommendedFilterCircuit() {
        return filterCircuitService.getAll().get(1);
    }

    public FilterCircuit getFilterCircuit() {
        if (filterCircuitRequired == null ) {
            hydroStation.setFilterCircuit(getRecommendedFilterCircuit());
            filterCircuitRequired = true;
        }
        return hydroStation.getFilterCircuit();
    }

    public void setFilterCircuit(FilterCircuit filterCircuit) {
        hydroStation.setFilterCircuit(filterCircuit);
    }

    public Boolean getFilterCircuitRequired() {
        return filterCircuitRequired;
    }

    public void setFilterCircuitRequired(Boolean filterCircuitRequired) {
        this.filterCircuitRequired = filterCircuitRequired;
        if (!filterCircuitRequired){
            hydroStation.setFilterCircuit(null);
            return;
        }
        hydroStation.setFilterCircuit(getRecommendedFilterCircuit());
    }

}
