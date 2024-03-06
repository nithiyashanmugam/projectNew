package RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Feature",
		glue="StepDefn",
		dryRun=false,
		monochrome=true,
		tags="@TC004",
		plugin={"pretty","html:Reports/WebReport","json:Reports/jsonreport.json"}				
		)
public class Runner {

}

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features="src/test/resources/Feature",
//		glue="StepDefn",
//		dryRun=false,
//		monochrome=true,
//		tags="@TC001",
//		plugin= {"pretty","html:report/WebReport.html","json:report/JsonReport.json","junit:report/xmlreport.xml"}			
//		)
//public class Runner {		
//
//}
