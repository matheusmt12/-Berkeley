import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class process1 extends Thread{
	
	public static void main(String[] args) {
		
	
		try {
			byte[] b = "Testando Broadcast1".getBytes();

			InetAddress addr = InetAddress.getByName("255.255.255.255");
			DatagramPacket pkg = new DatagramPacket(b, b.length, addr,6001);
			DatagramSocket ds = new DatagramSocket(6002);
			
			ds.send(pkg);
			
			byte[] r = new byte[1024];
			pkg = new DatagramPacket(r, r.length);
			ds.receive(pkg);
			String data = new String(pkg.getData(), 0, pkg.getLength());
			System.out.println("Dados recebidos: " + data);
			System.out.println("Teerminou");
			}
		catch (Exception e) {
			System.out.println("Nao foi possivel enviar a mensagem");
		}
	
	}

}
