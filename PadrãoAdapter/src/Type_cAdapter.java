
public class Type_cAdapter implements Hub {
   
	
	private UsbType_c c;
	
	
	public Type_cAdapter(UsbType_c c) {
		this.c=c;
	}
	
	@Override
	public void entrada(String nome, double capacidade, boolean funcionando) {
		this.c.executar(nome, capacidade, true);
		
	}

}
