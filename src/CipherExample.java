
class CipherExample {
    public void foo() {
    // Non-compliant code
        try {            
            Cipher c = Cipher.getInstance("DES");
		System.out.println("");
        // Or DESede, RC2, RC4 as these are known to be vulnerable
        } catch (NoSuchAlgorithmException|NoSuchPaddingException e) {
            logger.error("Invalid algorithm",e);
        }
    }
}



