
import java.util.ArrayList;
import java.util.List;

public class SeInscreveu implements Sujeito {
	private List<Observer> observers;
	private String mensagem;
	private boolean mudou;
	
	public SeInscreveu(){
		this.observers=new ArrayList<>();
	}

	@Override
	public void notificaObservers() {
		List<Observer> observersLocal = null;
		
		 {
			if (!mudou)
				return;
			observersLocal = new ArrayList<>(this.observers);
			this.mudou=false;
		}
		for (Observer obj : observersLocal) {
			obj.atualiza();
		}

	}

	@Override
	public Object getAtualiza(Observer obj) {
		return this.mensagem;
	}
	
	
	public void postMessage(String msg){
		System.out.println("Novas inscrições: "+msg);
		this.mensagem=msg;
		this.mudou=true;
		notificaObservers();
	}

	@Override
	public void registro(Observer obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void naoregistrado(Observer obj) {
		// TODO Auto-generated method stub
		
	}
}
