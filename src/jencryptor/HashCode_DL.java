package jencryptor;

import java.sql.SQLException;

/**
 * @author Marcone Melo Mendonça
 * @version 1.0
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "HashCode Data Layer". Destined to manipulate the table "hashCollection" on Database.
 */
public class HashCode_DL implements EaD_I {

    @Override
    public int insertHashValue(HashCode_BL hashCode) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashCode_BL selectHashValue(HashCode_BL haCode) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
