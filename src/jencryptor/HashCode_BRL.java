/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jencryptor;

import java.sql.SQLException;
import java.util.zip.DataFormatException;

/**
 * @author Marcone Melo Mendonça
 * @version 1.0
 * @see https://github.com/marconemm/JEncryptor
 * @desc Class "HashCode Business Rules Layer". Destined to attend the "business rules"
 * from the table "hashCollection" on Database.
 */
public class HashCode_BRL implements EaD_I {

    @Override
    public int insertHashValue(HashCode_BL hashCode) throws DataFormatException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashCode_BL selectHashValue(HashCode_BL haCode) throws DataFormatException, SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
