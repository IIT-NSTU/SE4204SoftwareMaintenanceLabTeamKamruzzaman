package ChemistryCalculator.backend;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;


public class Database {
    private static final HashMap<String, String[]> allAtoms = new HashMap<>();

    static {
        allAtoms.put("H", new String[]{"1", "Hydrogen", "1.00794"});
        allAtoms.put("He", new String[]{"2", "Helium", "4.002602"});
        allAtoms.put("Li", new String[]{"3", "Lithium", "6.941"});
        allAtoms.put("Be", new String[]{"4", "Beryllium", "9.012182"});
        allAtoms.put("B", new String[]{"5", "Boron", "10.811"});
        allAtoms.put("C", new String[]{"6", "Carbon", "12.0107"});
        allAtoms.put("N", new String[]{"7", "Nitrogen", "14.0067"});
        allAtoms.put("O", new String[]{"8", "Oxygen", "15.9994"});
        allAtoms.put("F", new String[]{"9", "Fluorine", "18.9984032"});
        allAtoms.put("Ne", new String[]{"10", "Neon", "20.1797"});
        allAtoms.put("Na", new String[]{"11", "Sodium", "22.989769"});

        allAtoms.put("Mg", new String[]{"12", "Magnesium", "24.305"});
        allAtoms.put("Al", new String[]{"13", "Aluminium", "26.981538"});
        allAtoms.put("Si", new String[]{"14", "Silicon", "28.0855"});
        allAtoms.put("P", new String[]{"15", "Phosphorus", "30.973762"});
        allAtoms.put("S", new String[]{"16", "Sulphur", "32.065"});
        allAtoms.put("Cl", new String[]{"17", "Chlorine", "35.453"});
        allAtoms.put("Ar", new String[]{"18", "Argon", "39.948"});
        allAtoms.put("K", new String[]{"19", "Potassium", "39.0983"});
        allAtoms.put("Ca", new String[]{"20", "Calcium", "40.078"});
        allAtoms.put("Sc", new String[]{"21", "Scandium", "44.955912"});

        allAtoms.put("Ti", new String[]{"22", "Titanium", "47.867"});
        allAtoms.put("V", new String[]{"23", "Vanadium", "50.9415"});
        allAtoms.put("Cr", new String[]{"24", "Chromium", "51.9961"});
        allAtoms.put("Mn", new String[]{"25", "Manganese", "54.938049"});
        allAtoms.put("Fe", new String[]{"26", "Iron", "55.845"});
        allAtoms.put("Co", new String[]{"27", "Cobalt", "58.9332"});
        allAtoms.put("Ni", new String[]{"28", "Nickel", "58.6934"});
        allAtoms.put("Cu", new String[]{"29", "Copper", "63.546"});
        allAtoms.put("Zn", new String[]{"30", "Zinc", "65.409"});
        allAtoms.put("Ga", new String[]{"31", "Gallium", "69.723"});

        allAtoms.put("Ge", new String[]{"32", "Germanium", "72.64"});
        allAtoms.put("As", new String[]{"33", "Arsenic", "74.9216"});
        allAtoms.put("Se", new String[]{"34", "Selenium", "78.96"});
        allAtoms.put("Br", new String[]{"35", "Bromine", "79.904"});
        allAtoms.put("Kr", new String[]{"36", "Krypton", "83.798"});
        allAtoms.put("Rb", new String[]{"37", "Rubidium", "85.4678"});
        allAtoms.put("Sr", new String[]{"38", "Strontium", "87.62"});
        allAtoms.put("Y", new String[]{"39", "Yttrium", "88.90585"});
        allAtoms.put("Zr", new String[]{"40", "Zirconium", "91.224"});
        allAtoms.put("Nb", new String[]{"41", "Niobium", "92.90638"});

        allAtoms.put("Mo", new String[]{"42", "Molybdenum", "95.94"});
        allAtoms.put("Tc", new String[]{"43", "Technetium", "97.9072"});
        allAtoms.put("Ru", new String[]{"44", "Ruthenium", "101.07"});
        allAtoms.put("Rh", new String[]{"45", "Rhodium", "102.9055"});
        allAtoms.put("Pd", new String[]{"46", "Palladium", "106.42"});
        allAtoms.put("Ag", new String[]{"47", "Silver", "107.8682"});
        allAtoms.put("Cd", new String[]{"48", "Cadmium", "112.411"});
        allAtoms.put("In", new String[]{"49", "Indium", "114.818"});
        allAtoms.put("Sn", new String[]{"50", "Tin", "118.71"});
        allAtoms.put("Sb", new String[]{"51", "Antimony", "121.76"});

        allAtoms.put("Te", new String[]{"52", "Tellurium", "127.6"});
        allAtoms.put("I", new String[]{"53", "Iodine", "126.90447"});
        allAtoms.put("Xe", new String[]{"54", "Xenon", "131.293"});
        allAtoms.put("Cs", new String[]{"55", "Caesium", "132.90545"});
        allAtoms.put("Ba", new String[]{"56", "Barium", "137.327"});
        allAtoms.put("La", new String[]{"57", "Lanthanum", "138.9055"});
        allAtoms.put("Ce", new String[]{"58", "Cerium", "140.116"});
        allAtoms.put("Pr", new String[]{"59", "Praseodymium", "140.90765"});
        allAtoms.put("Nd", new String[]{"60", "Neodymium", "144.24"});
        allAtoms.put("Pm", new String[]{"61", "Promethium", "144.9127"});

        allAtoms.put("Sm", new String[]{"62", "Samarium", "150.36"});
        allAtoms.put("Eu", new String[]{"63", "Europium", "151.964"});
        allAtoms.put("Gd", new String[]{"64", "Gadolinium", "157.25"});
        allAtoms.put("Tb", new String[]{"65", "Terbium", "158.92534"});
        allAtoms.put("Dy", new String[]{"66", "Dysprosium", "162.5"});
        allAtoms.put("Ho", new String[]{"67", "Holmium", "164.93032"});
        allAtoms.put("Er", new String[]{"68", "Erbium", "167.259"});
        allAtoms.put("Tm", new String[]{"69", "Thulium", "168.93421"});
        allAtoms.put("Yb", new String[]{"70", "Ytterbium", "173.04"});
        allAtoms.put("Lu", new String[]{"71", "Lutetium", "174.967"});

        allAtoms.put("Hf", new String[]{"72", "Hafnium", "178.49"});
        allAtoms.put("Ta", new String[]{"73", "Tantalum", "180.9479"});
        allAtoms.put("W", new String[]{"74", "Tungsten", "183.84"});
        allAtoms.put("Re", new String[]{"75", "Rhenium", "186.207"});
        allAtoms.put("Os", new String[]{"76", "Osmium", "190.23"});
        allAtoms.put("Ir", new String[]{"77", "Iridium", "192.217"});
        allAtoms.put("Pt", new String[]{"78", "Platinum", "195.078"});
        allAtoms.put("Au", new String[]{"79", "Gold", "196.96655"});
        allAtoms.put("Hg", new String[]{"80", "Mercury", "200.59"});
        allAtoms.put("Tl", new String[]{"81", "Thallium", "204.3833"});

        allAtoms.put("Pb", new String[]{"82", "Lead", "207.2"});
        allAtoms.put("Bi", new String[]{"83", "Bismuth", "208.98038"});
        allAtoms.put("Po", new String[]{"84", "Polonium", "208.9824"});
        allAtoms.put("At", new String[]{"85", "Astatine", "209.9871"});
        allAtoms.put("Rn", new String[]{"86", "Radon", "222.0176"});
        allAtoms.put("Fr", new String[]{"87", "Francium", "223.0197"});
        allAtoms.put("Ra", new String[]{"88", "Radium", "226.0254"});
        allAtoms.put("Ac", new String[]{"89", "Actinium", "227.0277"});
        allAtoms.put("Th", new String[]{"90", "Thorium", "232.03806"});
        allAtoms.put("Pa", new String[]{"91", "Protactinium", "231.03588"});

        allAtoms.put("U", new String[]{"92", "Uranium", "238.02891"});
        allAtoms.put("Np", new String[]{"93", "Neptunium", "237.0482"});
        allAtoms.put("Pu", new String[]{"94", "Plutonium", "244.0642"});
        allAtoms.put("Am", new String[]{"95", "Americium", "243.0614"});
        allAtoms.put("Cm", new String[]{"96", "Curium", "247.0704"});
        allAtoms.put("Bk", new String[]{"97", "Berkelium", "247.0703"});
        allAtoms.put("Cf", new String[]{"98", "Californium", "251.0796"});
        allAtoms.put("Es", new String[]{"99", "Einsteinium", "252.0830"});
        allAtoms.put("Fm", new String[]{"100", "Fermium", "257.0951"});
        allAtoms.put("Md", new String[]{"101", "Mendelevium", "258.0984"});

        allAtoms.put("No", new String[]{"102", "Nobelium", "259.1010"});
        allAtoms.put("Lr", new String[]{"103", "Lawrencium", "262.1097"});
        allAtoms.put("Rf", new String[]{"105", "Rutherfordium", "261.1088"});
        allAtoms.put("Db", new String[]{"105", "Dubnium", "262.1141"});
        allAtoms.put("Sg", new String[]{"106", "Seaborgium", "266.1219"});
        allAtoms.put("Bh", new String[]{"107", "Bohrium", "264.12"});
        allAtoms.put("Hs", new String[]{"108", "Hassium", "277.0"});
        allAtoms.put("Mt", new String[]{"109", "Meitnerium", "268.1388"});
        allAtoms.put("Ds", new String[]{"110", "Darmstadtium", "271.0"});
        allAtoms.put("Rg", new String[]{"111", "Roentgenium", "272.0"});

        allAtoms.put("Cn", new String[]{"112", "Copernicium", "285.0"});
        allAtoms.put("Nh", new String[]{"113", "Nihonium", "284.0"});
        allAtoms.put("Fi", new String[]{"114", "Flerovium", "285.0"});
        allAtoms.put("Mc", new String[]{"115", "Moscovium", "288.0"});
        allAtoms.put("Lv", new String[]{"116", "Livermorium", "292.0"});
        allAtoms.put("Ts", new String[]{"117", "Tennessine", "294.211"});
        allAtoms.put("Og", new String[]{"118", "Oganesson", "294.0"});
    }


//    public Database() {
//
//        try {
//            InputStream fileInputStream = getClass().getResourceAsStream("/ChemistryCalculator/database/database.ser");
//            ObjectInputStream objectinputStream = new ObjectInputStream(fileInputStream);
//            this.allAtoms = (HashMap<String, String[]>) objectinputStream.readObject();
//
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.printf("Database Error ! %s%n", e.getMessage());
//        }
//    }

    public HashMap<String, String[]> getAllAtoms() {
        return allAtoms;
    }
}
