public class CepFormat {
    public String formatCep(String cep) throws InvalidCepException {
        if (cep.length() != 8) {
            throw new InvalidCepException();
        }

        char[] cepArray;
        cepArray = cep.toCharArray();

        return String.valueOf(cepArray[0] + cepArray[1] + "." + cepArray[2] + cepArray[3] + cepArray[4] + "-" + cepArray[5] + cepArray[6] + cepArray[7]);
    }
}
