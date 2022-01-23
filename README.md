# Introduction to Spring Cloud Netflix Eureka-Server and Spring Cloud Api Gateway


## Development

* JDK 17
* Spring Boot - 2.6.2
* Spring Data JPA
* Spring Web
* H2 Embedded Database
* Maven - 4
* Lombok
* IDE - IntelliJ IDEA 2021.3.1

***
* spring-cloud-netflix-eureka-server 3.1.0
* spring-cloud-starter-netflix-eureka-client 3.1.0
* spring-cloud-starter-gateway

## Gateway Service configure

		server.port = 7080
		spring.application.name = api-gateway
		eureka.client.serviceUrl.defaultZone = http://localhost:8761/eureka

		#spring.cloud.gateway.discovery.locator.enabled=true
		#spring.cloud.gateway.discovery.locator.lower-case-service-id=true
		spring.cloud.gateway.routes[0].id = user-status-check
		spring.cloud.gateway.routes[0].uri = lb://api-mobileapp-users
		spring.cloud.gateway.routes[0].predicates[0] = Path=/alierqul/user/status/check
		spring.cloud.gateway.routes[0].predicates[1] = Method=GET
		spring.cloud.gateway.routes[0].filters[0] =RewritePath=/alierqul/user/status/check, /user/status/check

##  Server service 

### @EnableEurekaServer
### Discovery Server is an actively managed registry for service locations.

    #8761 eureka default port
    server.port=8761
    
    #Requered aplication name
    spring.application.name=boost-discovery-server

    #To be a Server
    eureka.client.register-with-eureka=false
    eureka.client.fetch-registry=false
***

##  Client service 1
### @EnableEurekaClient
    server.port=8081
    spring.application.name=boost-course-service
##  Client service 2
### @EnableEurekaClient
    server.port=8082
    spring.application.name=boost-catalog-service
***


