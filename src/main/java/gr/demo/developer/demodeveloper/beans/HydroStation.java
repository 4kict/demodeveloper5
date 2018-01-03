package gr.demo.developer.demodeveloper.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HydroStation {

    private List<Pump> pumps = new ArrayList<>();

    public HydroStation() {
        pumps.add(new Pump());
    }

    public List<Pump> getPumps() {
        return pumps;
    }

    public void setPumps(List<Pump> pumps) {
        this.pumps = pumps;
    }

    public void removePump(int i) {
        if (pumps.size() == 1) {
            return;
        }
        pumps.remove(i);
    }

    public void addPump() {
        pumps.add(new Pump());
    }
}
