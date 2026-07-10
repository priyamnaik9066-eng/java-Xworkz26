class AloeVeraGel {

    boolean isParabenFree() {
        return true;
    }

    int getQuantity() {
        return 150;
    }

    double getPrice() {
        return 299.00;
    }

    public static void main(String[] args) {

        AloeVeraGel gel = new AloeVeraGel();

        System.out.println("Paraben Free : " + gel.isParabenFree());
        System.out.println("Quantity : " + gel.getQuantity() + " ml");
        System.out.println("Price : ₹" + gel.getPrice());
    }
}