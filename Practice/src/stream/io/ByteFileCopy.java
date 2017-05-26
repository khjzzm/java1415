package stream.io;
import java.io.*;

class ByteFileCopy
{
	public static void main(String[] args) throws IOException
	{
		InputStream in=new FileInputStream("org.text");
		OutputStream out=new FileOutputStream("cpy.text");
		
		int copyByte=0;
		int bData;
		
		while(true)
		{
			bData=in.read();
			if(bData==-1)
				break;
			
			out.write(bData);
			copyByte++;
		}

		in.close();
		out.close();		
		System.out.println("����� ����Ʈ ũ�� "+ copyByte);
	}
}