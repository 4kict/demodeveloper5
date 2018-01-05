package gr.demo.developer.demodeveloper.api;

import java.io.Serializable;
import java.util.Objects;

public class FilterCircuit implements Serializable {

    private static final long serialVersionUID = 20673923847L;
    private String type;

    public FilterCircuit(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterCircuit that = (FilterCircuit) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type);
    }
}
