package ar.edu.untref.dyasc;

public class Validator {

    public boolean isInputValid(String[] args){

        if(args.length==0){
            return false;
        }

        //si el tamaño de args es uno, significa que solo se eligio un numero
        if(args.length==1){
            try{
                Integer.parseInt(args[0]);
            }catch (Exception e){
                return false;
            }
        }

        //si el tamaño es 2, me fijo que el primer parametro sea un string que contenga order y orientaciones validas
        //o lanzo un error
        if (args.length == 2) {
            try{
                String options = args[0];
                Integer.parseInt(args[1]);
                char order = options.charAt(4);
                char orientation = options.charAt(3);
                if(order!='i' && order!='d' || orientation!='v' && orientation!='h'){
                    return false;
                }
            }catch (Exception e){
                return false;
            }

        }

        return true;
    }

}
