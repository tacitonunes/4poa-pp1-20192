package objetos;

//NÃO ESQUECER DE IMPORTAR
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Escrita {
	
	// PASSO 2.6 - CRIAR O MÉTODO "escrever" PÚBLICO E ESTÁTICO, QUE RECEBA O OBJETO ENVIADO PELO SERVLET
	static String path = "C:\\4poa\\";
	static String arq = "arquivo.txt";
	
	public static void escrever(Carro carro){
			
		// PASSO 2.6.1 - INSTANCIAR NOVO DIRETÓRIO/ARQUIVO
		File diretorio = new File(path);
		
		// PASSO 2.6.2 - VERIFICAR SE O DIRETORIO JÁ EXISTE. SE NÃO, CRIAR!
		if (!diretorio.exists()) {
			diretorio.mkdir();
		}
		try {			
			FileWriter fw = new FileWriter(path + arq, true);
			
			BufferedWriter bw = new BufferedWriter(fw);
			// OBS 1: PERCEBA ABAIXO QUE ESCOLHI O ";" PRA SEPARAR OS ATRIBUTOS
				//ESTE MESMO CARACTER (;) DEVERÁ CONSTAR NA CLASSE DE LEITURA PARA O SPLIT
			
			// OBS 2: OPCIONAIS ESCREVERÁ UM ARRAY DE ATRIBUTOS SEM OS COLCHETES NO ARQUIVO
			bw.write(carro.getPlaca() + ";" + carro.getMontadora() + ";" + carro.getModelo() + ";" + carro.getAno() + ";" + Arrays.toString(carro.getOpcionais()).replace("[", "").replace("]", ""));
//import java.util.Arrays;
			
			bw.newLine();
			
			bw.close();
			fw.close();
			
		} catch(IOException erro){
			erro.printStackTrace();
		}
	}
	
	
}
