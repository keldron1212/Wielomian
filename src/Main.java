public class Main {
    public static void main(String[] args) {

        InputReader numberReader = new InputReader();
        int stWielomianu = numberReader.readNextIntPositive("stopnia wielomianu:");
        Integer[] tabelaArgumentow = numberReader.readArguments("kolejnego współczynnika:", stWielomianu);
        int argument = numberReader.readNextInt("argument wielomianu:");
        WielomianSolver wielomianSolver = new WielomianSolver();
        int solution = wielomianSolver.solve(tabelaArgumentow, stWielomianu, argument);
        System.out.println(solution);
    }
}