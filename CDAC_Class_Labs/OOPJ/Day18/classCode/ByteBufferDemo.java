import java.nio.*;
import java.io.*;
import java.nio.channels.*;

class ByteBufferDemo{
		public static void main(String[] args) throws IOException{
			
			FileInputStream fis = new FileInputStream("stud_details_out.txt");
			
			FileChannel fcin = fis.getChannel();
			ByteBuffer bb = ByteBuffer.allocate((int)fcin.size()); 
			fcin.read(bb);
			
			bb.rewind(); // reading through the buffer and printing it to the console
			
			for(int i=0; i < (int)fcin.size(); i++){
				System.out.print((char)bb.get(i));
			} 
			System.out.println();			
			
			bb.rewind();
			FileOutputStream fos = new FileOutputStream("bytebuffer_out.txt");
			FileChannel fcout = fos.getChannel();
			fcout.write(bb);
			
			
			fcin.close();
			fis.close();
			
			System.out.println("File Read Successfully");
		}
}