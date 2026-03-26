package academy.devdojo.javaoneforall.javacore.kenum.domain;

public enum PaymentType {
        DEBIT{
            @Override
            public double calculateDiscount(double value) {
                return value * 0.95;
            }
        }, CREDIT{
        @Override
        public double calculateDiscount(double value) {
            return value * 0.90;
        }
    };

    public abstract double calculateDiscount(double value);

    }