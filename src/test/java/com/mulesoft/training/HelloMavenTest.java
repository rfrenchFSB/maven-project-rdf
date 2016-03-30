package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    // mavenFlow returns Hello Maven
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }

    // retrieveFlights response contains content-type header
    // content-type headers has a value of application/json
    @Test
   /* public void retrieveFlightsAddsAppropriateHeader() throws Exception{
      MuleEvent event = runFlow("retrieveFlights");
      String contentType = event.getMessage().getOutboundProperty("Content-Type");
      assertEquals("application/json", contentType);
    }*/

    // run maven-config.xml when testing
    @Override
    protected String getConfigFile(){
      return "maven-project.xml";
    }

}
