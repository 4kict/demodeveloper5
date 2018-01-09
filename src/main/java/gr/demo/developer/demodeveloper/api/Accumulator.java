package gr.demo.developer.demodeveloper.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Accumulator implements Serializable {
    private static final long serialVersionUID = 1151713742469539160L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String type;
    private Integer volume = 0;

    public Accumulator() {
    }

    public Integer getVolume()  {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
