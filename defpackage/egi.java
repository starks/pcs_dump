package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface egi extends egj {
    egp getParserForType();

    int getSerializedSize();

    egh newBuilderForType();

    egh toBuilder();

    byte[] toByteArray();

    eea toByteString();

    void writeTo(eei eeiVar);

    void writeTo(OutputStream outputStream);
}
