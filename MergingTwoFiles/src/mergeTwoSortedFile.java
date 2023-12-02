import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class mergeTwoSortedFile {

	public static void main(String[] args) {
		try(BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("File1.txt"));
				BufferedInputStream bis2=new BufferedInputStream(new FileInputStream("File2.txt"));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("File.txt"));){
			int a1=bis1.read();
			int a2=bis2.read();
			while(a1!=-1 && a2!=-1) {
				if(a1<a2) {
					bos.write(a1);
					a1=bis1.read();
				}else {
					bos.write(a2);
					a2=bis2.read();
				}
			}
			while(a1!=-1) {
				bos.write(a1);
				a1=bis1.read();
			}
			while(a2!=-1) {
				bos.write(a2);
				a2=bis2.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
