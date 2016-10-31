//Max Russell APCS Period 2
	public class Magpie2 {

		//Get a default greeting and return a greeting	
		public static String getGreeting() {
			return "Hello, let's talk.";
		}

		/**
		 * Gives a response to a user statement
		 * takes in a user statement
		 * returns a response based on given rules
		 */
		public String getResponse(String statement) {
			String response = "";
			if (statement.trim().length()==0) {
				response = "Say something I can understand.";
			} else if (statement.indexOf("no") >= 0) {
				response = "Well that was rude...";
			// Add a response for if the user doesn't input anything
			}
			else if (statement.indexOf("What's the deal with airline food?") >= 0)
			{
			response = "Yeah, what's the deal?";
		    }
			else if (statement.indexOf("brother") >= 0)
			{
				response = "He seems nice, tell me more.";
			}
		    else if (statement.indexOf("mother") >= 0
				  || statement.indexOf("father") >= 0
				  || statement.indexOf("sister") >= 0)
			{
				response = "Tell me more about your family.";
			} 
			else if (statement.indexOf("Dreyer") >= 0
				 || statement.indexOf("deHeer") >= 0
				 || statement.indexOf("Lamont") >= 0)
			{
				response = "They sound like a good teacher.";
			} 
			else 
			{
				response = getRandomResponse();
			}
			return response;
		}

		/**
		 * Pick a default response to use if nothing else fits.
		 * returns a non-committal string
		 */
		private String getRandomResponse() {
			final int NUMBER_OF_RESPONSES = 9;
			double r = Math.random();
			int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
			String response = "";

			if (whichResponse == 0) {
				response = "Interesting, tell me more.";
			} else if (whichResponse == 1) {
				response = "Hmmm.";
			} else if (whichResponse == 2) {
				response = "Do you really think so?";
			} else if (whichResponse == 3) {
				response = "You don't say.";
			} else if (whichResponse == 4) {
				response = "alright then...";
			} else if (whichResponse == 5) {
				response = "neat...";
			} else if (whichResponse == 6) {
				response = "...ok";
			} else if (whichResponse == 7) {
				response = "Let's talk about something else...";
			} else if (whichResponse == 8) {
				response = "You talk a lot, I'm falling behind...";
			}

			return response;
		}
	}

