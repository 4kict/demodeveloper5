package gr.demo.developer.demodeveloper.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Pump implements Serializable {
    private static final long serialVersionUID = -6567648641961768021L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Integer pressure = 0;
    private Integer flow = 0;
    private Boolean pFilter = false;

    protected Pump() {
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getFlow() {
        return flow;
    }

    public void setFlow(Integer flow) {
        this.flow = flow;
    }

    public Boolean getpFilter() {
        return pFilter;
    }

    public void setpFilter(Boolean pFilter) {
        this.pFilter = pFilter;
    }

    public Integer getPower() {
        return pressure * flow;
    }
}
