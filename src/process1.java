import java.net.DatagramPacket;
import java.time.*;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class process1 extends Thread {

	private int identity;
	private int time;
	private int port;

	process1(int identity, int time,int port) {
		this.identity = identity;
		this.time = time;
		this.port = port;
	}

	public void run() {
		try {
			byte[] b = "Testando Broadcast1".getBytes();

			InetAddress addr = InetAddress.getByName("255.255.255.255");
			DatagramPacket pkg = new DatagramPacket(b, b.length, addr, 6001);
			DatagramSocket ds = new DatagramSocket();

			ds.send(pkg);

			byte[] r = new byte[1024];
			pkg = new DatagramPacket(r, r.length);
			ds.receive(pkg);
			String data = new String(pkg.getData(), 0, pkg.getLength());
			System.out.println("Dados recebidos: " + data);
			System.out.println("Teerminou");
		} catch (Exception e) {
			System.out.println("Nao foi possivel enviar a mensagem");
		}

	}

}
