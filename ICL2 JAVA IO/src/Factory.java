
public class Factory implements Filter{	
	public void show(String line) {
		if(accept(line)) 
				System.out.println(line);	
	}

	public Boolean accept(String line) {
		if(line !=null) return true;
		else return false;
	}

	public Factory getFilter(int num) {
		if (num=='1') return new MyFilter1();
		else if (num=='2') return new MyFilter2();
		else return new Factory();
	}

	
}
