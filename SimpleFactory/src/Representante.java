
public class Representante {
	public static void main(String[] args) {
		EmpresaFornecedora pedido = new EmpresaFornecedora();
		EmpresaFornecedora pedido2 = new EmpresaFornecedora();
		
		pedido.escolherIndustria("GO", "gesso").criarIndustria();
		pedido2.escolherIndustria("GO", "calcario").criarIndustria();
		
	}
}
