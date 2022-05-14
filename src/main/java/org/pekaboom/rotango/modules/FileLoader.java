package org.pekaboom.rotango.modules;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

/* File loader class */
public class FileLoader {
	private String content;
	/* Constructor */
	public FileLoader() {
		content = "";
	}
	/* Include file method */
	public void include(String filename, Class<?> className) throws IOException {
		ClassLoader classLoader = className.getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(filename);
		InputStreamReader stream = new InputStreamReader(inputStream, "UTF-8");
		BufferedReader reader = new BufferedReader(stream);
		// retrieve lines from file
		for (String line; (line = reader.readLine()) != null;) {
			content +=line+"\n";
		}
	}
	/* Get file content */
	public String getContent() {
		return content;
	}
	
	/* Get files from /webapp folder */
	public StringBuilder getWebFiles(HttpServletRequest request, String filepath) throws IOException {
		StringBuilder pubFiles = new StringBuilder("");
		String path = request.getServletContext().getRealPath(filepath);
		FileInputStream stream = new FileInputStream(path);
		InputStreamReader streamReader = new InputStreamReader(stream);
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(streamReader);
		String line;
		while((line = reader.readLine()) != null) {
			pubFiles.append(line);
		}
		return pubFiles;
	}
	/* set or replace strings in content */
	public String setVar(String str, String replace) {
		String x = replace;
		replace = x != null ? x:"";
		content = getContent().replace(str, replace.toString());
		return content;
	}
}