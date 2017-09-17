package cn.itcast_10;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class DeleteFolder extends TimerTask{

	@Override
	public void run() {
		File srcFolder=new File("aaa");
		deleteFolder(srcFolder);
	}

	private void deleteFolder(File srcFolder) {
		File[] fileArray=srcFolder.listFiles();
		if(fileArray!=null){
		for(File file:fileArray){
			if(file.isDirectory()){
				deleteFolder(file);
			}else{
				System.out.println(file.getName()+":"+file.delete());
			}
		}
		System.out.println(srcFolder.getName()+":"+srcFolder.delete());
		
		}
	}
	
}

public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer t=new Timer();
		String s="2017-06-20 16:25:10";
				
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=sdf.parse(s);
		
		t.schedule(new DeleteFolder(), d);
	}
}
