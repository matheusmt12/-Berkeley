import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Master {

	public static void main(String[] args) {
		try {
			// Classe java para trabalhar com multicast ou broadcast
			DatagramSocket mcs = new DatagramSocket(6001);// porta como
															// parametro
	//		 MulticastSocket mcs = new MulticastSocket(6001);//porta como
			// parametro

				ArrayList<Long> list = new ArrayList<Long>();
					
				
				for(int i = 0; i < 5; i++){
				byte rec[] = new byte[256];
				DatagramPacket pkg = new DatagramPacket(rec, rec.length);
				mcs.receive(pkg);// recebendo dados enviados via broadcast
				String data = new String(pkg.getData(), 0, pkg.getLength());
				System.out.println("Dados recebidos: " + data);
				System.out.println(i);
				i++;}
				
			
		}

		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
