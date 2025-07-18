package com.google.android.apps.miphone.astrea.http.api.proto;

import defpackage.asr;
import defpackage.eev;
import defpackage.efa;
import defpackage.efb;
import defpackage.egj;
import defpackage.egp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UnrecognizedUrlException extends efb implements egj {
    private static final UnrecognizedUrlException DEFAULT_INSTANCE;
    private static volatile egp PARSER;
    private int bitField0_;
    private String url_ = "";

    static {
        UnrecognizedUrlException unrecognizedUrlException = new UnrecognizedUrlException();
        DEFAULT_INSTANCE = unrecognizedUrlException;
        efb.registerDefaultInstance(UnrecognizedUrlException.class, unrecognizedUrlException);
    }

    private UnrecognizedUrlException() {
    }

    public static asr newBuilder() {
        return (asr) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "url_"});
        }
        if (iOrdinal == 3) {
            return new UnrecognizedUrlException();
        }
        if (iOrdinal == 4) {
            return new asr();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = PARSER;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (UnrecognizedUrlException.class) {
            eevVar = PARSER;
            if (eevVar == null) {
                eevVar = new eev(DEFAULT_INSTANCE);
                PARSER = eevVar;
            }
        }
        return eevVar;
    }
}
