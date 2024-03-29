package br.ufc.quixada.eda.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EDAUtil {
	/**
	 * Ler o arquivo que cont�m as prioridades iniciais da lista de prioridades.
	 * @param path
	 * @return
	 * @throws IOException
	 */
    public static List<Integer> getDadosIniciais(String path) throws IOException {
        List<Integer> entrada = new ArrayList<Integer>();
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter("\r\n");
		while (scanner.hasNext())
			entrada.add(scanner.nextInt());
		
		scanner.close();
        return entrada;
    }
    
    /**
     * Ler as opera��es que ser�o realizadas na lista de prioridades ap�s a sua cria��o.
     * @param path
     * @return
     * @throws IOException
     */
    public static List<Operacao> getOperacoes(String path) {
        List<Operacao> operacoes = new ArrayList<Operacao>();
        Scanner scanner = null;

    	try {
    		scanner = new Scanner(new FileReader(path)).useDelimiter(" |\r\n");
		while (scanner.hasNext()) {
			operacoes.add(new Operacao(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		}
			
		scanner.close();
        return operacoes;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			scanner.close();
	        return operacoes;
			
		}

    }    

    public static List<Operacao> getOperacoes2(String path) throws IOException {
        List<Operacao> operacoes = new ArrayList<Operacao>();
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter(" |\r\n");	
		while (scanner.hasNext())
			operacoes.add(new Operacao(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
			
		scanner.close();
        return operacoes;
    }    
}
