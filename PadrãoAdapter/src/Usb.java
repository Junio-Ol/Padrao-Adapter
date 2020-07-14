
public class Usb implements Hub{

	@Override
	public void entrada(String nome, double capacidade, boolean funcionando) {
		
		System.out.print("Entrada:"+nome+"\n");
		System.out.print("Capacidade:"+capacidade+" Mbps\n");
	    System.out.println(funcionando?"Funcionando":"Não Funciona");
	
	}
	
	

}
