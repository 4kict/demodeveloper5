package gr.demo.developer.demodeveloper.beans;

import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import static javax.faces.application.FacesMessage.SEVERITY_ERROR;


//@ManagedBean(name = "mainBean")
//@SessionScoped
@Component("mainBean")
public class MainBean {

    private boolean rememberMe;

    private String inputText;

    public String getInputText() {
        return inputText;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void showMessage() {
        FacesMessage message = new FacesMessage("Заголовок", "Частичное обновление страницы");
        message.setSeverity(FacesMessage.SEVERITY_INFO); //как выглядит окошко с сообщением
        FacesContext.getCurrentInstance().addMessage(null, message);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(SEVERITY_ERROR, "Всплывашка", "GrowlMessage"));

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Значение", inputText));
    }

//    public void onValueEntered(ValueChangeEvent evnt){
//        System.out.println(evnt.getNewValue());
//    }

    public void validData(FacesContext context, UIComponent comp, Object value) {
        String val = (String) value;
        if (val.contains("t")) {
            ((UIInput) comp).setValid(false);
            FacesMessage message = new FacesMessage(SEVERITY_ERROR," symbol 't' restrict ", "Просто нельзя так");
            context.addMessage(comp.getClientId(context), message);
        }
    }


    public String gotoZone() {
        if (!inputText.equals("ZoneX")) {
            return "/views/myPage";
        }
        return "/views/zoneX";
    }

}