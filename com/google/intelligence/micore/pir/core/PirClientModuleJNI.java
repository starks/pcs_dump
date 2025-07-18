package com.google.intelligence.micore.pir.core;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PirClientModuleJNI {
    public static final native void PirClientSwig_beginSession(long j, PirClientSwig pirClientSwig, long j2);

    public static final native long PirClientSwig_create(byte[] bArr);

    public static final native byte[] PirClientSwig_createRequest(long j, PirClientSwig pirClientSwig);

    public static final native byte[] PirClientSwig_processResponseChunk(long j, PirClientSwig pirClientSwig, byte[] bArr);

    public static final native void delete_PirClientSwig(long j);
}
