class CurrentWeather(var city:String, var apiKey:String, var countryCode:String = "") {

	
}

object hello_world {

	def main(args: Array[String]) = {
		
		var test = new CurrentWeather("JJ", "KK", "OO")
		println("Hello, new language named Scala !")
	}
}
