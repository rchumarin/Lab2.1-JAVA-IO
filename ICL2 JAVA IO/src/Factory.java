
public class Factory {
	public Filter getFilter(int num) {  
		if(num=='1')
			return new MyFilter1();
		else if(num=='2')
			return new MyFilter2();
		return null;
	}
}


