import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class process2 extends Thread{
	
	
	
	public static void main(String[] args) {
		
		process1 t1 = new process1(1,5,7000);
		t1.start();
		process1 t2 = new process1(1,5,7000);
		t2.start();
		/*
		 * process1 t2 = new process1(1,5,7002); t1.start(); process1 t3 = new
		 * process1(1,5,7003); t1.start();
		 * 
		 * try { t1.join(); t2.join(); t3.join(); } catch (Exception e) { // TODO:
		 * handle exception }
		 */
		
	}

}
