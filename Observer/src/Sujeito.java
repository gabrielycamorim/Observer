
public interface Sujeito {

	public void registro(Observer obj);
	
	public void naoregistrado(Observer obj);
	
	public void notificaObservers();
	
	public Object getAtualiza(Observer obj);
	
}
