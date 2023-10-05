package AtvdHeranca;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo ("Ford","Atual",2020,"azul");
		
		System.out.println("Veiculo:");
		System.out.println("Marca:"+veiculo.getMarca());
		System.out.println("Modelo:"+veiculo.getModelo());
		System.out.println("Ano:"+veiculo.getAno());
		System.out.println("Cor:"+veiculo.getCor());
		
		Automovel automovel = new Automovel ("Ford","Atual",2020,"azul",2,"Bom");
		System.out.println("Automovel:");
		System.out.println("Marca:"+automovel.getMarca());
		System.out.println("Modelo:"+automovel.getModelo());
		System.out.println("Ano:"+automovel.getAno());
		System.out.println("Cor:"+automovel.getCor());
		System.out.println("NumeroPortas:"+automovel.getNumeroPortas());
		System.out.println("Motor:"+automovel.getMotor());
		
		Moto moto = new Moto("Ford","Atual",2020,"azul",10);
		System.out.println("Moto:");
		System.out.println("Marca:"+moto.getMarca());
		System.out.println("Modelo:"+moto.getModelo());
		System.out.println("Ano:"+moto.getAno());
		System.out.println("Cor:"+moto.getCor());
		System.out.println("Cilindrada:"+moto.getCilindrada());
	}

}
