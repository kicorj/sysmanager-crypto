package br.com.challenge.sysmanager.sysmanager_crypto;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Main Class para execução da Criptografia/Descriptografia via CLI
 * @author kico
 *
 */
public class AppCommandLine {
	
	public static void main(String[] args) {
		
		// cria o parser para linha de comando
		CommandLineParser parser = new DefaultParser();

		// define as opções
		Options options = new Options();
		options.addOption("e", "encrypt", true, "encrypt string");
		options.addOption("d", "decrypt", true, "decrypt string");
		
		try {
		    // parse dos argumentos
		    CommandLine line = parser.parse( options, args );

		    // opção encrypt
		    if( line.hasOption( "e" ) ) {
		        System.out.println( SysmanagerCrypto.encrypt(line.getOptionValue("e")));
		    }
		    
		    // opção decrypt
		    if( line.hasOption( "d" ) ) {
		        System.out.println( SysmanagerCrypto.decrypt(line.getOptionValue("d")));
		    }
		}
		catch( ParseException exp ) {
		    System.out.println("Comando desconhecido");
		}
		
		
	}
}
