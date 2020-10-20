
public class Inscritos implements Observer {
	
	private String inscrito;
	private Sujeito topic;
	
	public Inscritos(String in){
		this.inscrito=in;
	}
	@Override
	public void atualiza() {
		String msg = (String) topic.getAtualiza(this);
		if(msg == null){
			System.out.println(inscrito+" Se inscreveu");
		}else
		System.out.println(inscrito+"  se inscreveu "+msg);
	}

	@Override
	public void setSujeito(Sujeito suj) {
		this.topic=suj;
	}
}
