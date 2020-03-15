
public class EmpresaFornecedora {
	public IndustriaMateriaPrima escolherIndustria(String estado, String descricao) {
		if(estado.equals("GO") && descricao.equals("calcario")) {
			return new IndustriaCalbras();
		}else if(estado.equals("GO") && descricao.equals("gesso")) {
			return new IndustriaNutrion();
		}else if(estado.equals("TO") && descricao.equals("calcario")) {
			return new IndustriaHipercal();
		}else if(estado.equals("TO") && descricao.equals("gesso")) {
			return new IndustriaConsube();
		}
		return null;
	}
}
