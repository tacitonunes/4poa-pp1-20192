package objetos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Leitura {
	
	//	PASSO 2.6.1 - CRIAR ESTE MÉTODO ESTÁTICO RETORNANDO UMA LISTA DE OBJETOS
		//IMPORTE "import java.util.LinkedList;"
	public static LinkedList<Carro> ler() {
		
		// PASSO 2.6.2 - CRIE A CLASSE "Carro" no pacote "objetos", neste nosso caso
		
		// PASSO 2.6.3 - INSTANCIE A SUA LISTA
		LinkedList<Carro> lista = new LinkedList<Carro>();
		
		// PASSO 2.6.4 - BLOCO PADRÃO PARA LEITURA
		try {
			//MESMO CAMINHO DA ESCRITA
			FileReader fr = new FileReader(Escrita.path + Escrita.arq); 
			
			//CRIANDO UM BUFFER PARA PREVENIR PERDAS
			BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()) {
				//LER UMA LINHA DO ARQUIVO
				String linha = br.readLine();
				
				//LER OS ATRIBUTOS NO ARQUIVO, SEPARADOS PELO CARACTER DEFINIDO NA HORA DA ESCRITA
				String[] atr = linha.split(";");
				String[] opcs = atr[4].split(",");
				
				//INSERE O OBJETO IMPORTADO DA LINHA DO ARQUIVO NA SUA LISTA INSTANCIADA NO PASSO 2.6.3
				lista.add(new Carro(atr[0], atr[1], atr[2], atr[3], opcs));
			}
			
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		
		// RETORNA A LISTA CRIADA
		return lista;
	}
}
