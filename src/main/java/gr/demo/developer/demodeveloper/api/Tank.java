package gr.demo.developer.demodeveloper.api;

import java.io.Serializable;

public class Tank implements Serializable {

    private static final long serialVersionUID = 45674562594L;

    private String type;

    public Tank(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
