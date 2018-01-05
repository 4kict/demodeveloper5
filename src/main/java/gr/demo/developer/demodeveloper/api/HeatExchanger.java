package gr.demo.developer.demodeveloper.api;

import java.io.Serializable;

public class HeatExchanger implements Serializable {

    private static final long serialVersionUID = 73845209348L;

    private String type;

    public HeatExchanger(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
