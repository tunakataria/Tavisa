/////// Assignment //////

######Start a project
To start a project please run below mvn command

mvn clean spring-boot:run

by default the the project will be up and running on localhost:8080. Should you wish to change the default port to
something else. Mention below in application.properties

server.port=<CUSTOME_PORT>



#######Find a place end point#####

localhost:8080/app/V1/searchPlace/{input}


####### Lombok
Project uses lombok for defining getters and setter for POJOs at run time. You should have lombok plugin installed in your IDE.