import java.io.*;
class FileDemo2{
	public static void main(String args[]){
		File f = null;
		try{
			f= new File("file.txt");
			FileReader fin = new FileReader(f);
			BufferedReader bin = new BufferedReader(fin);
			String sr;
			System.out.println("The contents of the fil are :");
			while ((sr= bin.readLine())!=null){
				System.out.print(sr);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}