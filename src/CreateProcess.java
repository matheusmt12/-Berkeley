import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class CreateProcess extends Thread{
	
	
	
	public static void main(String[] args) {
		
		process t1 = new process(1,5,7000);
		t1.start();
		process t2 = new process(2,13,7002);
		t2.start();
		process t3 = new process(3,9,7001);
		t3.start();
		
		/*
		 * process1 t2 = new process1(1,5,7002); t1.start(); process1 t3 = new
		 * process1(1,5,7003); t1.start();
		 * 
		 * try { t1.join(); t2.join(); t3.join(); } catch (Exception e) { // TODO:
		 * handle exception }
		 */
		
	}

}
