SpringBoot command line example.
Steps to create are:

1 - go to https://start.spring.io/ and put 
groupId: com.arquitecturajava
Artifact: SpringBoot1
and generate the project

2 - create service class with a method in this case mensaje

3 - In SpringBoot1Application class 3 things
    add Service instance
    implements CommandLineRunner
    create a simple implementation calling servicio.mensaje()
    