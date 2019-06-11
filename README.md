Project has now been installed as a jar file, which allows us to run it as a standalone spring boot app from the command line. To do so, navigate to flowable-springboot-demo/target , run the jar file located in this folder.

	- java -jar <most-recent-jar-file>.jar
	- hit 'http://localhost:8080/actuator' or 'http://localhost:8080/actuator/flowable' to get a peak at what's going on. 

If making changes, run a mvn clean in either eclipse or command line in order to get rid of old jar files, then run mvn install to generate a current jar. 
	
-------------------------------------------------------------------------------------------------------------------------------------------
**Old notes from original project author. Useless so far**

Example project for using the Flowable starters with Spring boot.
It automatically deploys all process and cases from the `processes` and `cases` folders respectively.
Exposes the REST endpoints for the 6 engines of Flowable:
* `process-api` for the Process Engine
* `cmmn-api` for the CMMN Engine
* `dmn-api` for the DMN Engine
* `idm-api` for the IDM Engine
* `form-api` for the Form Engine
* `content-api` for the Content Engine
