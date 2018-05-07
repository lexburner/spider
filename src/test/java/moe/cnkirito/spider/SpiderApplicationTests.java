package moe.cnkirito.spider;

import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class SpiderApplicationTests {

	public static void main(String[] args) throws IOException {
		String proxyHost = "127.0.0.1";
		String proxyPort = "1087";

		System.setProperty("http.proxyHost", proxyHost);
		System.setProperty("http.proxyPort", proxyPort);

		// 对https也开启代理
		System.setProperty("https.proxyHost", proxyHost);
		System.setProperty("https.proxyPort", proxyPort);

		URL url = new URL("http://sukebei.nyaa.si/");
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream inputStream = connection.getInputStream();
		byte[] bytes = new byte[1024];
		while (inputStream.read(bytes) >= 0) {
			System.out.println(new String(bytes));
		}

	}

}
