package gr.demo.developer.demodeveloper;

import gr.demo.developer.demodeveloper.api.FilterCircuit;
import gr.demo.developer.demodeveloper.repositories.FilterCircuitRepository;
import gr.demo.developer.demodeveloper.scope.ViewScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.HashMap;

/**
 * http://localhost:8771/rest/browser/index.html#/rest/
 */

@SpringBootApplication
//@EnableEurekaClient
public class DemodeveloperApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemodeveloperApplication.class, args);
        FilterCircuitRepository repa = context.getBean(FilterCircuitRepository.class);
        repa.save(new FilterCircuit("Filter A1"));
        repa.save(new FilterCircuit("Filter A2"));
        repa.save(new FilterCircuit("Filter B3"));
        repa.save(new FilterCircuit("Filter B100"));
        repa.save(new FilterCircuit("Filter B1001"));
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/pumps.xhtml");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    @Bean
    public static ViewScope viewScope() {
        return new ViewScope();
    }

    @Bean
    public static CustomScopeConfigurer scopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("view", viewScope());
        configurer.setScopes(hashMap);
        return configurer;
    }

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
                config.setBasePath("/rest");
            }
        };
    }

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//			System.out.println("START of Spring BOOoo00T:");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//		};
//	}
}
