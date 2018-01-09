package gr.demo.developer.demodeveloper.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class HeatExchanger implements Serializable {

    private static final long serialVersionUID = -4403765643152956358L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;

    protected HeatExchanger() {
    }

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
