public class ParametrosInvalidosException {

    int primeiroNumero = 0;
    int segundoNumero = 0;

    public ParametrosInvalidosException(int primeiroNumero, int segundoNumero) {

        if (primeiroNumero > segundoNumero) {
            throw new RuntimeException("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO!");
        }

        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }
}