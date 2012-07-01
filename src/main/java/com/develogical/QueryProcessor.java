package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toUpperCase().contains("SPA2012")) {
            return "SPA is a jolly conference run by the eponymous BCS specialist group";
        } else if (query.toUpperCase().contains("BCS")){
        	return "BCS is the British Computer Society";
        }
        return "";
    }
}
