package com.wallet0x.hdwalletkit;

public class CantDeriveNonHardened extends HDDerivationException {
    public CantDeriveNonHardened() {
        super("can't derive non hardened");
    }
}
