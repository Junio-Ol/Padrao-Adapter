
public class Teste {
	
	
	public static void main(String[] args) {
		
		UsbType_c c = new UsbType_c();
		Hub h = new Type_cAdapter(c);
	//	Hub h = new Usb();
		h.entrada("Usb TYPE-C", 1000, true);
	}

}
