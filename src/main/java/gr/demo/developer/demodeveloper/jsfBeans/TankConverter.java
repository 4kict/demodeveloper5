package gr.demo.developer.demodeveloper.jsfBeans;


import gr.demo.developer.demodeveloper.api.Tank;
import gr.demo.developer.demodeveloper.services.FilterCircuitService;
import gr.demo.developer.demodeveloper.services.TankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

@Component
public class TankConverter implements Converter {

    @Autowired
    TankService tankService;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String submittedValue) {
        if (submittedValue == null || submittedValue.isEmpty()) {
            return null;
        }
        try {
            return tankService.getAll().get(Integer.valueOf(submittedValue));
        } catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(String.format("%s is not", submittedValue)), e);
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object modelValue) {
        if (modelValue == null) {
            return "";
        }
        if (modelValue instanceof Tank) {
            // TODO: ЕРЕСЬ!!!!!
            return String.valueOf(tankService.getAll().indexOf(modelValue));
        } else {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid ", modelValue)));
        }
    }
}
