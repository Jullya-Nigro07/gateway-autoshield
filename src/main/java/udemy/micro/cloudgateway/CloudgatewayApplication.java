package udemy.micro.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudgatewayApplication.class, args);
	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder){
		return builder.routes()
				.route("cliente-service", route -> route.path("/cliente/**").uri("lb://cliente"))
				.route("veiculo-service", route -> route.path("/veiculos/**").uri("lb://veiculo"))
				.route("seguro-service", route -> route.path("/seguro/**").uri("lb://seguro"))
				.build();
	}
}
