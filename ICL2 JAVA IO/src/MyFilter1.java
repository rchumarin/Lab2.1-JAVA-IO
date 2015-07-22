import org.apache.commons.lang3.*;

public class MyFilter1 implements Filter {	
	public Boolean accept(String line) {
		//на экране печатаются только те строки файла где нету слова Путин"
		if(line !=null && !StringUtils.contains(line, "Путин")) return true;
		else return false;
	}
}
