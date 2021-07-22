package refactor.exemplos.change_function_declaration;

/**
 * Se estiver removendo um parametro, verifique se nao esta sendo referenciado no corpo da funcao
 * Se o metodo estiver sendo usado em outras partes do codigo, voce pode utilizar o extract_function
 * ATALHO : CTRL + F6
 */

public class CalculaCircunferencia {

    public double circun(double radius){
        return 2 * Math.PI * radius;
    }

    public double circunferencia(double radius){
        return 2 * Math.PI * radius;
    }


    /**
     * Extract function: 
     */

    public double circunn(double radius){
        return circunferencia(radius);
    }
}
