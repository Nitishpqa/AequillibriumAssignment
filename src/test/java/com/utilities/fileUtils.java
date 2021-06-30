package com.utilities;

import java.io.File;

public class fileUtils {
	public void clearScreenshotsDirectory() {
		File path = new File("./Screenshots/");
		if(!path.exists()) {
			path.mkdir();	
		}
		File[] files = path.listFiles();
		for (File file : files) {
			// System.out.println("Deleted filename :"+ file.getName());
			file.delete();
		}
		System.out.println("Deleted screenshots folders");
	}
}
