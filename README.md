Sasi, here are what I think might be the potential sources of this error: 
		- forms are .form files rather than .html
		- @bean in org.flowable.FlowableSpringBootExampleApplication is a CommandLineRunner
		- no SpringProcessEngine
		
Things I learned after our meeting:
	- If it helps, I discovered that issuing a post to 'http://localhost:8080/process' gives me a 200. 
		- This gets printed to the console: "2019-06-06 14:58:21.777  WARN 12004 --- [           main] o.f.e.i.b.b.UserTaskActivityBehavior     
		: property not found in task description expression Unknown property used in expression: ${employeeName}
		 would like to take ${numberOfDays} day(s) of vacation (Motivation: ${vacationMotivation})."
	
--------------------------------------------------------------------------------------------------------------------------------------------------------
Example project for using the Flowable starters with Spring boot.
It automatically deploys all process and cases from the `processes` and `cases` folders respectively.
Exposes the REST endpoints for the 6 engines of Flowable:
* `process-api` for the Process Engine
* `cmmn-api` for the CMMN Engine
* `dmn-api` for the DMN Engine
* `idm-api` for the IDM Engine
* `form-api` for the Form Engine
* `content-api` for the Content Engine
