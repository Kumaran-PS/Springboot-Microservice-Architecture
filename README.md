# Springboot-Microservice
Springboot-Microservice


Functionalities of the Microservice :




  -> There are two microservices User and Department.
  
  
  
  
  -> All Microservices are conncected through a service registry - Eureka Web Server.
  
  
  
  
  -> A seperate api gateway is implemented , all api request traverses through the gateway then  to the respective microservice.
  
  
  
  -> The Microservice is implemented as a resileient ie, when some microservice is out of service or takes longer time to respond , a fallback method is called which          informs the client that api is out of service
  
  
  
  
  -> A hystrix dashboard is used to visualize the number of request , api status etc graphically.
  
  
  
  -> To maintain a common global configuration for all microservice a cloud - config server containing all configuration is used. 
  
  
  
  -> To trace log , trace id  zipkin and sleuth distributed logger service is used.
