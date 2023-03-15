import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Master {

	public static void main(String[] args) {
		try {

			DatagramSocket mcs = new DatagramSocket(6001);
			InetAddress add = InetAddress.getByName("localhost");

				ArrayList<Long> list = new ArrayList<Long>();
					
				
				//for(int i = 0; i < 5; i++){
				byte rec[] = new byte[256];
				DatagramPacket pkg = new DatagramPacket(rec, rec.length);
				mcs.receive(pkg);
				String data = new String(pkg.getData(), 0, pkg.getLength());
				System.out.println("Dados recebidos: " + data);
				//System.out.println(i);
				//i++;}
				byte[] sen = new byte[1024];
				sen = "aceito".getBytes();
				pkg = new DatagramPacket(sen, sen.length, add, pkg.getPort());
				
				mcs.send(pkg);
				
		}

		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
