package it.unibo.exceptions.arithmetic;

import java.io.IOException;

public class NetworkException extends IOException{

    public NetworkException ()
    {
        String S;
        S="Network error:No respose";
        super (S);

    }

    public NetworkException(String S)
    {
       
        S="Network error:No respose";
        super (S);

    }
    
}