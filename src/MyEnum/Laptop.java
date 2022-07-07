package MyEnum;

public enum Laptop {

    DELL("nvideo") {
        @Override
        void getRam() {
            System.out.println("8 Gb");
        }
    }, ASUS("intel") {
        @Override
        void getRam() {
            System.out.println("16 Gb");
        }
    }, ACER() {
        @Override
        void getRam() {
            System.out.println("12 gb");
        }
    }, APPLE("M1") {
        @Override
        void getRam() {
            System.out.println("24 Gb");
        }
    };

    String videoCard;

    Laptop(String videoCard) {

        this.videoCard = videoCard;
    }

    Laptop() {
    }

    abstract void getRam();

    public boolean videoCardLaptop() {
        return videoCard != null;
    }

}
