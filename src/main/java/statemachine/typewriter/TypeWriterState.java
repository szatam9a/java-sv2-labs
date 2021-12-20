package statemachine.typewriter;

public enum TypeWriterState {
    ON {
        @Override
        TypeWriterState CAPSLOCK() {
            return TypeWriterState.OFF;
        }
    }, OFF {
        @Override
        TypeWriterState CAPSLOCK() {
            return TypeWriterState.ON;
        }
    };

    abstract TypeWriterState CAPSLOCK();
    }
