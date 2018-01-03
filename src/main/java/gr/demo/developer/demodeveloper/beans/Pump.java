package gr.demo.developer.demodeveloper.beans;

public class Pump {
    private Integer pressure;
    private Integer flow;

    public Pump() {
        this.pressure = 0;
        this.flow = 0;
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
}
