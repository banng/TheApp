package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toUpperCase().contains("SPA2012")) {
            return "SPA is a jolly conference run by the eponymous BCS specialist group";
        } else if (query.toUpperCase().contains("BCS")){
        	return "BCS is the British Computer Society";
        } else if (query.toLowerCase().matches("what is \\d+ plus \\d+")) {
        	return addNumbers(query);
        } else if (query.toLowerCase().matches("what is \\d+ multiplied by \\d+")) {
        	return multNumbers(query);
        }

        return "";
    }

	private String multNumbers(String query) {
		int total = 1;
		String[] words = query.split(" ");
		for(String word : words) {
			if(word.matches("^\\d+$")) {
				total *= Integer.valueOf(word);
			}
		}
		return String.valueOf(total);
	}

	private String addNumbers(String query) {
		int total = 0;
		String[] words = query.split(" ");
		for(String word : words) {
			if(word.matches("^\\d+$")) {
				total += Integer.valueOf(word);
			}
		}
		return String.valueOf(total);
	}
}
