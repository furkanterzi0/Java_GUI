import java.util.ArrayList;
import java.util.Random;

public class DogrulamaKodu {
	
	public DogrulamaKodu() {
		
	}
	public String kod() {
		
		ArrayList<String> a=new ArrayList<>();
		a.add("aCrTXe");
		a.add("bxTGHB");
		a.add("zCWFfs");
		a.add("dbmJFW");
		a.add("tpOFKd");
		a.add("wfVCDg");
		a.add("FwfFAw");
		a.add("FsxRxd");
		a.add("EmfKRs");
		a.add("ÇfkwOW");
		a.add("FÇsfFg");
		a.add("E262e2");
		a.add("2F92Br");
		a.add("2042LD");
		a.add("w20Fe0");
		a.add("Fe2sf4");
		a.add("FsnW2d");
		a.add("En52tA");
		
		Random rnd=new Random();
		int s=rnd.nextInt(18);
		
		return a.get(s);
	}

}
