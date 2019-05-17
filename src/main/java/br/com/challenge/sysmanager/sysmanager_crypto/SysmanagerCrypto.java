package br.com.challenge.sysmanager.sysmanager_crypto;

/**
 * SysmanagerCrypto Class
 * 
 * Classe com métodos estáticos que criptografam e descriptografam uma String obedecendo o algoritmo definido no desafio da Sysmanager
 * 
 * Descrição do algoritmo:
 * O algoritmo de criptgrafia é bastante simples: basta substituir a letra da palavra pela sua terceira sucessora no alfabeto (por exemplo, A=D e Z=D).
 * O projeto deve tambem ser capaz de descriptografar o mesmo texto.
 * Nao se preocupar com a criptografia de numeros.
 * 
 * @author kico
 *
 */
public class SysmanagerCrypto 
{
    
    private SysmanagerCrypto() {
    	 throw new IllegalStateException("Static class");
    }
    
    /**
     * Método privado que aplica a regra de criptografia para um caractér.
     * @param ch
     * @return
     */
    private static char getCryptoChar(final char ch) {
    	int cryptoFormula = ch + 3;
    	int cryptoGreaterZFormula = ch - 23;
    	char z = Character.isLowerCase(ch) ? 'z' : 'Z';
    	
    	char cryptoCh = (char) ((cryptoFormula) > z ? cryptoGreaterZFormula : cryptoFormula);
    	
    	return (Character.isLetter(ch) ? cryptoCh : ch);
    }
    
    /**
     * Método privado que aplica a regra de descriptografia para um caractér.
     * @param ch
     * @return
     */
    private static char getDeCryptoChar(final char ch) {
    	int cryptoFormula = ch - 3;
    	int cryptoLowerAFormula = ch + 23;
    	char a = Character.isLowerCase(ch) ? 'a' : 'A';
    	
    	char cryptoCh = (char) ((cryptoFormula) < a ? cryptoLowerAFormula : cryptoFormula);
    	
    	return (Character.isLetter(ch) ? cryptoCh : ch);
    }
    
    /**
     * Método público que recebe uma String e retorna o valor Criptografado.
     * @param word
     * @return
     */
    public static String encrypt(final String word) {
        
    	StringBuilder wordBuilder = new StringBuilder();

        for(int i = 0; i <= word.length() - 1; i++)
        {
        	wordBuilder.append(getCryptoChar(word.charAt(i)));
        }
        
        return wordBuilder.toString();
    }
    
    /**
     * Método público que recebe uma String e retorna o valor Descriptografado.
     * @param word
     * @return
     */
    public static String decrypt(final String word) {
    	StringBuilder wordBuilder = new StringBuilder();

        for(int i = 0; i <= word.length() - 1; i++)
        {
        	wordBuilder.append(getDeCryptoChar(word.charAt(i)));
        }
        
        return wordBuilder.toString();
    }
}
