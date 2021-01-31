import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

 

public class Article {
	public static void main(String [] args) throws IOException{
	
	OkHttpClient client = new OkHttpClient();
	
	Request request = new Request.Builder()
		.url("https://lexper.p.rapidapi.com/v1.1/extract?url=https%3A%2F%2Fwww.iqiraq.news%2Feconomy%2F6199--.html&media=1")
		.get()
		.addHeader("x-rapidapi-key", "c3debe0bf3mshabfa5d4e358c5e3p167078jsn7830f3d2de8f")
		.addHeader("Content-Type", "application/json; charset=utf-8")
		.addHeader("x-rapidapi-host", "lexper.p.rapidapi.com")
		.build();

	Response response = client.newCall(request).execute();
	String text = response.body().string();
	System.out.println(text);
	}
}
