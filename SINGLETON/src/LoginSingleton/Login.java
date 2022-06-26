package LoginSingleton;

public class Login {
	private static Login login;
	private String usuario;
	private String senha;
	
	private Login(){}
	
	public Login getInstance(){
		if(login == null){
		return new Login();
		}else{
		return login;
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void fazerLogin(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		System.out.println(usuario + "Login efetuado com sucesso");
		
		
		
		
	}
	

}
