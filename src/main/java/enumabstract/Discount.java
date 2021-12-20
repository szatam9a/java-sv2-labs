package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        double getAmountToPay(int price, int pieces) {
            return (price * pieces * 0.8);
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        double getAmountToPay(int price, int pieces) {
            double twoOrLess = pieces * price * 0.75;
            double threeOrMore = price / 2 + ((pieces - 1) * price * 0.75);
            return pieces > 2 ? threeOrMore : twoOrLess;
        }
    };

    abstract double getAmountToPay(int price, int pieces);
}
