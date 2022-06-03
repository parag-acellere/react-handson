Class Vulnerabilit {
public void foo() {
    // Non-compliant code
        try {            
            Cipher c = Cipher.getInstance("DES");
        // Or DESede, RC2, RC4 as these are known to be vulnerable
        } catch (NoSuchAlgorithmException|NoSuchPaddingException e) {
            System.out.println("1");
            logger.error("Invalid algorithm",e);
        }
    }
   }
