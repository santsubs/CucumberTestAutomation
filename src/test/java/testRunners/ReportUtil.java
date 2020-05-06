package testRunners;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateMasterthoughtReport();
	}
	
	
	public static void GenerateMasterthoughtReport(){
	    try{
	        String RootDir = System.getProperty("user.dir");
	        File reportOutputDirectory = new File("target/Masterthought");
	        List<String> list = new ArrayList<String>();
	        list.add("target/reports/cucumber.json");
//	        list.add("target/cucumber2.json");
	        
	        Configuration config = new Configuration(reportOutputDirectory,"test");

	        String pluginUrlPath = "";
	        String buildNumber = "1";
	        String buildProject = "cucumber-jvm";
	        boolean skippedFails = true;
	        boolean pendingFails = true;
	        boolean undefinedFails = true;
	        boolean missingFails = true;
	        boolean flashCharts = true;
	        boolean runWithJenkins = false;
	        boolean highCharts = false;
	        boolean parallelTesting = true;
	        boolean artifactsEnabled = false;
	        String artifactConfig = "";

	        ReportBuilder reportBuilder = new ReportBuilder(list, config);

	        reportBuilder.generateReports();
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}

}
