package gr.demo.developer.demodeveloper.beans;

public class Pump {
    private Integer pressure = 0;
    private Integer flow = 0;
    private Boolean pFilter = false;

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
