package ChemistryCalculator.backend;

public class Orbitals {

    public String getElectronConfig(int atomicNumber) {

        int counter;

        StringBuilder output = new StringBuilder();
        String[][] orbitals = {
                {"1s", "2"}, {"2s", "2"}, {"2p", "6"},
                {"3s", "2"}, {"3p", "6"}, {"4s", "2"},
                {"3d", "10"}, {"4p", "6"}, {"5s", "2"},
                {"4d", "10"}, {"5p", "6"}, {"6s", "2"},
                {"4f", "14"}, {"5d", "10"}, {"6p", "6"},
                {"7s", "2"}, {"5f", "14"}, {"6d", "10"},
                {"7p", "6"}, {"8s", "2"}
        };

        for (String[] innerArray : orbitals) {
            String orbitalName = innerArray[0];
            int orbitalSize = Integer.parseInt(innerArray[1]);

            counter = Math.min(orbitalSize, atomicNumber);

            output.append(orbitalName).append(counter).append(" ");

            atomicNumber -= counter;
            if (atomicNumber <= 0) {
                break;
            }

        }

        return output.toString();
    }
}