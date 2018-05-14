package com.cs.test.network.local;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NetworkTest {
	static Integer serverPort = 234;
	static Integer clientPort = 8224;
	static DatagramSocket ds;
	static byte buffer[] = new byte[1028];
	
	public static void main(String[] args) throws IOException {
		// inetAddressTest();
		// socketTest();
		// urlConnectionTest();
		// urlHttpTest();
		// dataGramTest(args);
	}

	private static void dataGramTest(String[] args) throws SocketException, IOException {
		if(args.length == 1)
		{
			ds = new DatagramSocket(serverPort);
			theServerConnect();
		}else{
			ds = new DatagramSocket(clientPort);
			theClientConnect();
		}
	}
	
	public static void theServerConnect() throws IOException
	{
		int pos = 0;
		while(true){
			int c = System.in.read();
			switch (c) {
			case -1:
				System.out.println("server quit");
				ds.close();
				break;
			case '\n':
				ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(), clientPort));
			default:
				buffer[pos++] = (byte) c;
				break;
			}
		}
	}
	
	public static void theClientConnect() throws IOException
	{
		while(true){
			DatagramPacket p = new DatagramPacket(buffer, buffer.length);
			ds.receive(p);
			System.out.println(new String(p.getData(), 0, p.getLength()));
		}
	}
	
	private static void urlHttpTest() throws MalformedURLException, IOException {
		URL url = new URL("http", "localhost", 2480, "");
		int port = url.getPort();
		System.out.println(port);
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		InputStream inputStream = openConnection.getInputStream();
		int read;
		int contentLength = openConnection.getContentLength();
		System.out.println(contentLength);
		while ((read = inputStream.read()) != -1) {
			System.out.print((char) read);
		}
		String requestMethod = openConnection.getRequestMethod();
		System.out.println(requestMethod);
		String responseMessage = openConnection.getResponseMessage();
		System.out.println(responseMessage);
		inputStream.close();
	}

	private static void urlConnectionTest() throws MalformedURLException, IOException {
		URL url = new URL("http", "localhost", 2480, "");
		int port = url.getPort();
		System.out.println(port);
		URLConnection openConnection = url.openConnection();
		InputStream inputStream = openConnection.getInputStream();
		int read;
		int contentLength = openConnection.getContentLength();
		System.out.println(contentLength);
		while ((read = inputStream.read()) != -1) {
			System.out.print((char) read);
		}
		Map<String, List<String>> headerFields = openConnection.getHeaderFields();
		Set<String> keySet = headerFields.keySet();
		for (String key : keySet) {
			System.out.println(key + ":" +headerFields.get(key));
		}
		inputStream.close();
	}

	private static void socketTest() throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 2480);
		int port = socket.getPort();
		System.out.println(port + " " + socket.getLocalPort() + " " + socket.getSoTimeout());
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		int read = inputStream.read();
		System.out.println(read);
		socket.close();
	}

	private static void inetAddressTest() throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		System.out.println(inetAddress);
		InetAddress localHost = InetAddress.getLocalHost();
		String hostName = localHost.getHostName();
		System.out.println(hostName);

		InetAddress byName = InetAddress.getByName("localhost");
		System.out.println(byName);
		System.out.println(byName.getHostAddress());
		System.out.println(byName.getLoopbackAddress());

		InetAddress[] byNames = InetAddress.getAllByName("localhost");
		for (InetAddress inetAddress2 : byNames) {
			System.out.println(inetAddress2);
		}

		InetAddress[] byNamesNet = InetAddress.getAllByName("www.google.com");
		for (InetAddress inetAddress2 : byNamesNet) {
			System.out.println(inetAddress2);
		}
	}
}
