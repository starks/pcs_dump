package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdz extends InputStream implements InputStreamRetargetInterface, env {
    public egi a;
    public final egp b;
    public ByteArrayInputStream c;

    public fdz(egi egiVar, egp egpVar) {
        this.a = egiVar;
        this.b = egpVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        egi egiVar = this.a;
        if (egiVar != null) {
            return egiVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        egi egiVar = this.a;
        if (egiVar != null) {
            this.c = new ByteArrayInputStream(egiVar.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        egi egiVar = this.a;
        if (egiVar != null) {
            int serializedSize = egiVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                boolean z = eei.e;
                eeg eegVar = new eeg(bArr, i, serializedSize);
                this.a.writeTo(eegVar);
                eegVar.ag();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
