package by.htp.file.service;

import java.util.List;


import by.htp.file.bean.TextFile;

public class DirectoryService {

	public TextFile createTextFile(String title) {
		TextFile file = new TextFile(title);
		return file;
	}

	public void renameTextFile(TextFile tf, String title) {
		tf.setTitle(title);
	}

	public void supplementeTextFile(TextFile file, String data) {
		file.SetStringData(data);
	}

	public void deleteTextFile(List<TextFile> list, int index) {
		list.remove(index);
	}

}
