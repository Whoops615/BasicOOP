package by.htp.file.bean;

import java.util.ArrayList;
import java.util.List;

public class TextFile extends File {

	private List<String> data;

	public TextFile() {

	}

	public TextFile(String title) {
		super(title);
		data = new ArrayList<String>();

	}

	public List<String> getData() {
		return data;
	}

	public String getStringData(int index) {
		return data.get(index);
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public void SetStringData(String str) {
		data.add(str);
	}

	@Override
	public String toString() {
		return "TextFile [data=" + data + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

}
