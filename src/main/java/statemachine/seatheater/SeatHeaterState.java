package statemachine.seatheater;

public enum SeatHeaterState {
    OFF {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.HIGH;
        }
    }, HIGH {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.MEDIUM;
        }
    }, MEDIUM {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.MIN;
        }
    }, MIN {
        @Override
        SeatHeaterState next() {
            return SeatHeaterState.OFF;
        }
    };

    abstract SeatHeaterState next();
}
