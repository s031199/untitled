public class Naudotojas {
        private String vardas;
        private String pavarde;
        private int amzius;

        public String getVardas() {
            return vardas;
        }
        public void setVardas(String vardas) {
            this.vardas = vardas;
        }

        public String getPavarde() {
        return pavarde;
        }
        public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
        }

        public int getAmzius() {
            return amzius;
        }
        public void setAmzius(int amzius) {
            this.amzius = amzius;
        }
}


class Person {
    private Naudotojas naudotojas;

    public Person() {
        this.naudotojas = new Naudotojas();
        naudotojas.setVardas("Vardas");
        naudotojas.setPavarde("Pavarde");
        naudotojas.setAmzius(00);
    }

    String getNaudotojasvardas() {
        return naudotojas.getVardas();
    }

    String getNaudotojaspavarde() {
        return naudotojas.getPavarde();
    }

    int getNaudotojasamzius() {
        return naudotojas.getAmzius();
    }
}
