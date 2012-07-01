package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.StringContains.containsString;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutSpa() throws Exception {
        assertThat(queryProcessor.process("SPA2012"), containsString("conference"));
    }
    
    @Test
    public void shouldAddTwoNumbers() throws Exception {
    	String query = "what is 3 plus 14";
    	assertThat(queryProcessor.process(query), containsString("17"));
    }
}
