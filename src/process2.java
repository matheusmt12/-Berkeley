import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class process2 extends Thread{
	
	
	
	public static void main(String[] args) {
		
	
		try {
			byte[] b = "Testando Broadcast2".getBytes();
			//Definindo o endere�o de envio do pacote neste caso o endere�o de broadcast
			InetAddress addr = InetAddress.getByName("255.255.255.255");
			DatagramPacket pkg = new DatagramPacket(b, b.length, addr,6001);
			DatagramSocket ds = new DatagramSocket();
			
			ds.send(pkg);//enviando pacote broadcast
			
			}
		catch (Exception e) {
			System.out.println("Nao foi possivel enviar a mensagem");
		}
	
	}

}
