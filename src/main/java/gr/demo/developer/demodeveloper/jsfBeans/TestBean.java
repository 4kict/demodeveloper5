package gr.demo.developer.demodeveloper.jsfBeans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    private Boolean meFlag;

    public Boolean getMeFlag() {
        return meFlag;
    }

    public void setMeFlag(Boolean meFlag) {
        this.meFlag = meFlag;
    }
}
