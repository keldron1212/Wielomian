public class WielomianSolver {
    int solve(Integer[] table, int stWielomianu, int argument) {
        int solution = table[0];
        for (int i = 1; i <= stWielomianu; i++)
            solution = solution * argument + table[i];
        return solution;
    }
}
