package jencryptor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 * @author Marcone Melo Mendonça
 * @version 1.0
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "HashCode Basic Layer". Destined to represent the table
 * "hashCollection" on Database.
 */
public class HashCode_BL {

    private final ArrayList<Byte> hashCode;
    private final String encryptedTxt, hashCodeStr, encryptType;

    public HashCode_BL(String textToEncrypit, String encryptType) throws NoSuchAlgorithmException {
        this.encryptedTxt = textToEncrypit;
        this.encryptType = encryptType;
        this.hashCode = new ArrayList<>();
        setHashCode(textToEncrypit);
        this.hashCodeStr = setStrHashCode(getHashCode());
    }

    private void setHashCode(String strProvided) throws NoSuchAlgorithmException {
        MessageDigest msgDigest = null;
        msgDigest = MessageDigest.getInstance(this.encryptType); //"MD5"; "SHA-1"; or "SHA-256"
        msgDigest.reset();
        msgDigest.update(strProvided.getBytes());
        byte[] temp = msgDigest.digest();

        for (byte i = 0; i < temp.length; i++) {
            this.hashCode.add(temp[i]);
        }
    }

    private String setStrHashCode(byte[] arrayProvided) {
        StringBuilder strBldr = new StringBuilder(arrayProvided.length * 2);
        for (byte i = 0; i < arrayProvided.length; i++) {
            int tempValue = arrayProvided[i] & 0xff;
            if (tempValue < 16) {
                strBldr.append('0');
            }
            strBldr.append(Integer.toHexString(tempValue));
        }
        return new String(strBldr).toUpperCase();
    }

    private byte[] getHashCode() {
        byte[] result = new byte[this.hashCode.size()];
        byte i = 0;
        for (byte temp : this.hashCode) {
            result[i] = temp;
            i++;
        }
        return result;
    }
    
    public String getEncryptedTxt() {
        return encryptedTxt;
    }

    public String getHashCodeStr() {
        return this.hashCodeStr;
    }

}
