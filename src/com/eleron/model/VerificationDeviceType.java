package com.eleron.model;

import java.util.Arrays;

/**
 * Created by alximik on 14/05/15.
 */
public enum VerificationDeviceType {
        SIMPLE
                {
                    public boolean verify(byte[] calculated, byte[] standard){
                        return Arrays.equals(calculated, standard);
                    }
                },

        ADVANCE
                {
                    public boolean verify(byte[] calculated, byte[] standard){
                        if (calculated == standard)
                            return true;
                        if (calculated == null || standard == null)
                            return false;

                        int length = calculated.length;
                        if (standard.length != length)
                            return false;

                        for (int i = 0; i < length; i++)
                            if (calculated[i] != standard[i])
                                return false;
                        System.out.println("ADVANCE");
                        return true;
                    }
                }

}
