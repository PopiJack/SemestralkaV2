/**
 * Trieda ktora prebera pozicie dvoch objektov a zistuje ci sa narazili alebo nie
 */
public class ManazerKolizie {

    public ManazerKolizie() {
    }

    /**
     * Trieda kolizia vrati true ak sa narazili a false ak nie
     * @param objekt1
     * @param objekt2
     * @return true/false
     */

    public boolean kolizia(AktivnyPrvokMapy objekt1, AktivnyPrvokMapy objekt2) {
        System.out.println(objekt1.getPoziciaX());
        return objekt1.getPoziciaX() + objekt1.getSirka() >= objekt2.getPoziciaX() &&
                objekt1.getPoziciaX() <= objekt2.getPoziciaX() + objekt2.getSirka() &&
                objekt1.getPoziciaY() + objekt1.getVyska() >= objekt2.getPoziciaY() &&
                objekt1.getPoziciaY() <= objekt2.getPoziciaY() + objekt2.getVyska();
    }
}
