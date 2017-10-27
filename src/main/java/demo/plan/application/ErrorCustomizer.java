package demo.plan.application;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
/**
 * 用于自定义实现404等错误页面
 * @author tangrj001
 *
 */
@Component
public class ErrorCustomizer {

	@Bean
	public EmbeddedServletContainerCustomizer escc() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
			    ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
			    ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
			    container.addErrorPages(error404Page, error500Page);
			}
		};
	}
}
