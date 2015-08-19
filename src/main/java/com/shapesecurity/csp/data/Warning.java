package com.shapesecurity.csp.data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Warning {

    @Nullable
    public Location startLocation;
    @Nullable
    public Location endLocation;

    @Nonnull
    public final String message;

    public Warning(@Nonnull String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Warning: " + message;
    }
}
