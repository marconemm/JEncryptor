package jencryptor;

import java.sql.SQLException;
import java.util.zip.DataFormatException;

/**
 * @author Marcone Melo Mendonça
 * @version 1.0
 * @see https://github.com/marconemm/JEncryptor
 * @desc Interface to encrypt or decrypt methods.
 */
public interface EaD_I {
    
    //C - Create
    int insertHashValue(HashCode_BL hashCode) throws DataFormatException, SQLException, ClassNotFoundException;
    
    //R - Read
    HashCode_BL selectHashValue(HashCode_BL haCode) throws DataFormatException, SQLException, ClassNotFoundException;
}
