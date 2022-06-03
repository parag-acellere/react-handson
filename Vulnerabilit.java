Class Vulnerability {
public void foo() {
    // Non-compliant code
        try {            
            System.out.println("1");
            Cipher c = Cipher.getInstance("DES");
        // Or DESede, RC2, RC4 as these are known to be vulnerable
        } catch (NoSuchAlgorithmException|NoSuchPaddingException e) {
            logger.error("Invalid algorithm",e);
        }
    }
   }
