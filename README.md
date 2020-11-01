# Java JDK 11 and Fx13  Modular


## Modular - Maven

`java-11-fx-modular` sample modular project to run with Maven.

Maven creates in the folder target/hellofx a minimized runtime with the help of JLink. 
Just copy the folder hellofx to your target machine. The the build is platform dependant.
A build from a windows environment will only run on the windows platform; the same for Mac and Linux.

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    cd to the folder java-11-fx-modular
    ./mvnw clean javafx:run

To create and run a custom JRE:

    cd to the folder java-11-fx-modular
    ./mvnw clean javafx:jlink
    target/hellofx/bin/launcher


### Windows

If you run on Windows, follow these steps:

    cd to the folder java-11-fx-modular
    mvnw clean javafx:run

To create and run a custom JRE:

    cd to the folder java-11-fx-modular
    mvnw clean javafx:jlink
    target\hellofx\bin\launcher
    
    start /min target\hellofx\bin\launcher
    
    
## Install git for Windows    

Install git for Windows:

[https://git-scm.com/download/win](https://git-scm.com/download/win)


## Import Maven Project in Eclipse

Navigate to Import->Maven->Check out Maven project from scm

If there is no git connector available... please install it

Help->Install new Software. Copy the following link in field work:

https://repo1.maven.org/maven2/.m2e/connectors/m2eclipse-egit/0.15.1/N/0.15.1.201806191431/    








    