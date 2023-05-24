public class ManazerKolizie {

    public ManazerKolizie() {
    }

    public boolean kolizia(AktivnyPrvokMapy objekt1, AktivnyPrvokMapy objekt2) {
        if (
                objekt1.getPoziciaX() + objekt1.getSirka() >= objekt2.getPoziciaX() &&
                objekt1.getPoziciaX() <= objekt2.getPoziciaX() + objekt2.getSirka() &&
                objekt1.getPoziciaY() + objekt1.getVyska() >= objekt2.getPoziciaY() &&
                objekt1.getPoziciaY() <= objekt2.getPoziciaY() + objekt2.getVyska()
        ) {
            return true;
        }
        return false;
    }
}
