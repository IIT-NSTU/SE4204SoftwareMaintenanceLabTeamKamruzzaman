package ChemistryCalculator.backend;

import java.util.HashMap;

public class Atom {
    private static final HashMap<String, String[]> allAtoms = new Database().getAllAtoms();
    private final Orbitals orbitals = new Orbitals(this);
    private String symbol;
    private String name;
    private  double atomicMass;
    private int atomicNumber;

    private Atom(String symbol) {
        String[] atom = allAtoms.get(symbol);
        this.symbol = symbol;
        atomicNumber = Integer.parseInt(atom[0]);
        name = atom[1];
        atomicMass = Double.parseDouble(atom[2]);

    }

    private Atom(int atomicNumber) {
        allAtoms.entrySet().stream().filter(entry -> atomicNumber == Integer.parseInt(entry.getValue()[0])).forEachOrdered(entry -> {
            this.symbol = entry.getKey();
            this.name = entry.getValue()[1];
            this.atomicMass = Double.parseDouble(entry.getValue()[2]);
        });
        this.atomicNumber = atomicNumber;
    }

    public static Atom getInstance(String symbol) {
        if (isValid(symbol)) {
            return new Atom(symbol);
        }
        throw new InvalidAtomException("'" + symbol + "'" + " is not a valid symbol !");
    }

    public static Atom getInstance(int atomicNumber) {
        if (atomicNumber >= 1 && atomicNumber <= 118){
            return new Atom(atomicNumber);
        }
        throw new InvalidAtomException("'" + atomicNumber + "'" + " is not a valid atomic number !");
    }

    private static boolean isValid(String symbol) {
        return allAtoms.containsKey(symbol);
    }


    public String getElectronConfig() {
        return orbitals.getElectronConfig(this.atomicNumber);
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    @Override
    public String toString() {
        return "Atom{" +
                "name='" + name + '\'' +
                '}';
    }
}

