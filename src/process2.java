import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class process2 extends Thread{
	
	
	
	public static void main(String[] args) {
		
		process1 t1 = new process1(1,5,7000);
		t1.start();
		

	
	}

}
