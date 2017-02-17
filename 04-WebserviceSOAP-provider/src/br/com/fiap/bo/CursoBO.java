package br.com.fiap.bo;

public class CursoBO {
	
	public float calcularMedia(float ps,
						float nac, float am){
		return (float) ((ps * 0.5) + (nac*0.2) + (am*0.3));
		
	}
	
	public String calcularExame(float media, float exame){
		if(media + exame >= 12){
			return "Aprovado";
		}else{
			return "Reprovado";
		}
	}
}
