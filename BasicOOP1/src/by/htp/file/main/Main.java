package by.htp.file.main;

import by.htp.file.bean.Directory;

import by.htp.file.bean.TextFile;
import by.htp.file.service.DirectoryService;

public class Main {

	public static void main(String[] args) {

		DirectoryService ds = new DirectoryService();

		Directory d = new Directory("Java");
		d.setDirectory(new Directory("note"));
		d.getSubDirectory().get(0).setTextFile(new TextFile("lesson1"));

		ds.supplementeTextFile(d.getSubDirectory().get(0).getTextFile(0), "Java Super!!");
		System.out.println(d.getTitle());
		System.out.println(d.getSubDirectory().get(0).getTitle());
		System.out.println(
				d.getSubDirectory().get(0).getTextFile(0).getTitle() + " " + d.getSubDirectory().get(0).getTextFile(0));

	}

}
