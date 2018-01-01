package gr.demo.developer.demodeveloper.beans;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class ValueListener  implements ValueChangeListener {

    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        System.out.println("ЧекМи");
    }

}
