import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Master {

	public static void main(String[] args) {
		try {

			DatagramSocket mcs = new DatagramSocket(6001);
			InetAddress add = InetAddress.getByName("localhost");

			ArrayList<DatagramPacket> list = new ArrayList<DatagramPacket>();

			int i = 0;
			int timeMaster = 3;
			int timepus = 0;
			while (i < 3) {
				byte rec[] = new byte[256];
				DatagramPacket pkg = new DatagramPacket(rec, rec.length);
				mcs.receive(pkg);
				String data = new String(pkg.getData(), 0, pkg.getLength());
				System.out.println("Dados recebidos: " + data);
				
				timepus += Integer.parseInt(data);
				list.add(pkg);

				Thread.currentThread().sleep(1000);
				i++;
			}
			
			int average = (timepus + timeMaster) / list.size() + 1; 
			
			for (DatagramPacket item : list) {	
				  byte[] sen = new byte[1024]; sen = Integer.toString(average).getBytes();
				  DatagramPacket test = new DatagramPacket(sen, sen.length, add, item.getPort());
				  mcs.send(test);
				System.out.println(item.getPort());
			}

			


			  
			/*
			 * mcs.receive(pkg); data = new String(pkg.getData(), 0, pkg.getLength());
			 * System.out.println("Dados recebidos: " + data); //System.out.println(i);
			 * //i++;} sen = new byte[1024]; sen = "aceito".getBytes(); pkg = new
			 * DatagramPacket(sen, sen.length, add, pkg.getPort());
			 * 
			 * mcs.send(pkg);
			 */
			 
		}

		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
