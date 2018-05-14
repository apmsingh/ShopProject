package com.cs.test.network.local;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		InetAddress localHost = InetAddress.getLocalHost();
		String hostName = localHost.getHostName();
		System.out.println(hostName);
	}
}
