package br.com.challenge.sysmanager.sysmanager_crypto;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testes unitários SysManagerCrypto
 * @author kico
 *
 */
public class SysmanagerCryptoTest {
	
	@Test
	public void passAllNumbersShouldReturnAllNumbers() {
		assertTrue(SysmanagerCrypto.encrypt("0123456789").equals("0123456789"));
	}
	
	@Test
	public void passEmptyStringShouldReturnEmptyString() {
		assertTrue(SysmanagerCrypto.encrypt("").equals(""));
	}

	@Test
	public void passStringShouldMatchBasicEncryptExample() {
		assertTrue(SysmanagerCrypto.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
				.equals("DEFGHIJKLMNOPQRSTUVWXYZABC"));
	}
	
	@Test
	public void passStringShouldMatchBasicDecryptExample() {
		assertTrue(SysmanagerCrypto.decrypt("DEFGHIJKLMNOPQRSTUVWXYZABC")
				.equals("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
	
	@Test
	public void passEncryptedStringShouldMatchDecrypted() {
		assertTrue(SysmanagerCrypto.encrypt("abcde")
				.equals(SysmanagerCrypto.decrypt("ghijk")));
	}
	
}
