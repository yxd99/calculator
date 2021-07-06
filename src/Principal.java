public class Principal {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Helpers helper = new Helpers();
        boolean esPrimeraVez = true;
        double numberOne, numberTwo, total = 0;
        int moreNumbers;
        String result = "", operation;
        numberOne = helper.readDouble("Ingrese un número");
        result = result.concat(""+numberOne);
        
        moreNumbers = 1;
        while (moreNumbers == 1){
     
            operation = helper.readText("""
                    Ingrese el tipo de operación que deseas realizar:
                    Para sumar digite: +
                    Para restar digite: -
                    Para multiplicar digite: *
                    Para dividir digite: /
                    """);
            numberTwo = helper.readDouble("Digite un número");

            if(!esPrimeraVez){
                numberOne = total;
            }     
        
            switch (operation) {
                case "+" -> {
                    total = calculator.sum(numberOne, numberTwo);
                    result = result.concat(operation+numberTwo);
                }
                case "-" -> {
                    total = calculator.substracion(numberOne, numberTwo);
                    result = result.concat(operation+numberTwo);
                }
                case "*" -> {
                    total = calculator.multiply(numberOne, numberTwo);
                    result = result.concat(operation+numberTwo);
                }
                case "/" -> {
                    total = calculator.division(numberOne, numberTwo);
                    result = result.concat(operation+numberTwo);
                }
                default -> {
                    helper.showMessage("Valor no valido");
                }
            }

            esPrimeraVez = false;
            
                    moreNumbers = helper.readInt("""
                    Desea seguir ingresando números
                    1: Si
                    Otro valor: no
                    """);

        } 
        
        helper.showMessage(result+" es "+total);
    }
}
