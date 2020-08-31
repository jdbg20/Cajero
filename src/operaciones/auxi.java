package operaciones; 

public class auxi { 
    
public static boolean isNum(String a){ //METODO PARA VALIDAR SI ES UN NÚMERO 

    try {

        int b = Integer.parseInt(a); 

        return true;  //SI SE PUEDE CONVERTIR A NÚMERO, DEVUELVE VERDADERO ) 

    } catch (NumberFormatException e) { 
        
return false; // CASO CONTRARIO. DEVUELVE FALSO 
}
}
}

