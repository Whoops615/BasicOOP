package by.htp.file.bean;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String title;
	private List<Directory> subDirectory;
	private List<TextFile> files;

	public Directory() {
		subDirectory = new ArrayList<Directory>();
		files = new ArrayList<TextFile>();
	}

	public Directory(String title) {
		this.title = title;
		subDirectory = new ArrayList<Directory>();
		files = new ArrayList<TextFile>();
	}

	public Directory(String title, List<Directory> subDirectory, List<TextFile> files) {
		this.title = title;
		this.subDirectory = subDirectory;
		this.files = files;
	}

	public Directory getDirectory(int index) {
		return subDirectory.get(index);
	}

	public void setDirectory(Directory directory) {
		subDirectory.add(directory);
	}

	public TextFile getTextFile(int index) {
		return files.get(index);
	}

	public void setTextFile(TextFile Textfile) {
		files.add(Textfile);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Directory> getSubDirectory() {
		return subDirectory;
	}

	public void setSubDirectory(List<Directory> subDirectory) {
		this.subDirectory = subDirectory;
	}

	public List<TextFile> getTextFiles() {
		return files;
	}

	public void setTextFiles(List<TextFile> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "Directory [title=" + title + ", subDirectory=" + subDirectory + ", files=" + files + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((subDirectory == null) ? 0 : subDirectory.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (subDirectory == null) {
			if (other.subDirectory != null)
				return false;
		} else if (!subDirectory.equals(other.subDirectory))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
